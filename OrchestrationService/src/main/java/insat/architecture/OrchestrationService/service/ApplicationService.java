package insat.architecture.OrchestrationService.service;

import insat.architecture.OrchestrationService.model.Application;
import insat.architecture.OrchestrationService.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
public class ApplicationService {
  @Autowired
  ApplicationRepository applicationRepository;
  private String directory ="/home/haythemkaouech/Desktop/Work/architecture/FileDatabase";
  public List<Application>getApps(){
    return this.applicationRepository.findAll();
  }
  public Application saveApp(String id , String firstName , String lastName, String address, String postalCode, MultipartFile cin,MultipartFile proof , MultipartFile report) throws IOException {
    Path uploadPath = Paths.get(directory);



    try {
      Path cinPath = uploadPath.resolve(cin.getOriginalFilename());
      Path proofPath = uploadPath.resolve(proof.getOriginalFilename());
      Path reportPath = uploadPath.resolve(report.getOriginalFilename());
      cin.transferTo(cinPath);
      proof.transferTo(proofPath);
      report.transferTo(reportPath);
      Application newApp= new Application(id,firstName,lastName,address,postalCode,cinPath.toString(),proofPath.toString(),reportPath.toString());
      this.applicationRepository.save(newApp);
      return newApp;
    } catch (IOException e) {
      throw new IOException("Could not save file: "  );
    }
  }
}
