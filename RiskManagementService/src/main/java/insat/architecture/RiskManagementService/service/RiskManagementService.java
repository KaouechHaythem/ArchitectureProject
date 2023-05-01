package insat.architecture.RiskManagementService.service;

import insat.architecture.RiskManagementService.model.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class RiskManagementService {
  @Autowired
  OCRService ocrService;
  public  String getScore(Application app){
    String cinPath = app.getCinPath();
    File cin = new File(cinPath);
    String proofPath = app.getProofPath();
    File proof = new File(proofPath);
    String reportPath = app.getReportPath();
    File report = new File(reportPath);
    String cinInfo= this.ocrService.getInfo(cin);
    String proofInfo = this.ocrService.getInfo(proof);
    String reportInfo = this.ocrService.getInfo(report);
    return "THIS FUNCTIONS CALLS OCR API TO CALCULATE RISK SCORE FOR AN APPLICATION";
    }
}
