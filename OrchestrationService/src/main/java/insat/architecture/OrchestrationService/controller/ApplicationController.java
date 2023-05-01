package insat.architecture.OrchestrationService.controller;

import insat.architecture.OrchestrationService.model.Application;
import insat.architecture.OrchestrationService.service.ApplicationService;
import insat.architecture.OrchestrationService.service.CommercialServiceGate;
import insat.architecture.OrchestrationService.service.RiskManagementServiceGate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/apps")
public class ApplicationController {
  @Autowired
  ApplicationService applicationService;
  @Autowired
  CommercialServiceGate commercialService;
  @Autowired
  RiskManagementServiceGate riskManagementServiceGate;
  @GetMapping
  public List<Application> getAll(){
    return this.applicationService.getApps();
  }
  @PostMapping()
  public ResponseEntity<String> processApplication(@RequestParam("id") String id,
                                                @RequestParam("firstName") String firstName,
                                                @RequestParam("lastName") String lastName,
                                                @RequestParam("address") String address,
                                                @RequestParam("postalCode") String postalCode,
                                                @RequestParam("cin") MultipartFile cin,
                                                @RequestParam("proof") MultipartFile proof,
                                                @RequestParam("report") MultipartFile report) throws IOException {
    try {
     Application app= this.applicationService.saveApp(id, firstName, lastName, address, postalCode, cin, proof, report);
      String rating = this.commercialService.getRating(app);
      String finalRating = this.riskManagementServiceGate.getFinalRating(app);
      return ResponseEntity.ok("Application saved successfully.");
    } catch (IOException e) {
      return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Could not save file: " + e.getMessage());
    }
  }
}
