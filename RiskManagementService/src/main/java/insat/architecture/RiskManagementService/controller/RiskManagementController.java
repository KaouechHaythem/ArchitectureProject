package insat.architecture.RiskManagementService.controller;

import insat.architecture.RiskManagementService.model.Application;
import insat.architecture.RiskManagementService.service.RiskManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/risk")
public class RiskManagementController {
  @Autowired
  RiskManagementService riskManagementService;
  @GetMapping
  public String getScore(@RequestBody Application application){
  return this.riskManagementService.getScore(application);
  }
}
