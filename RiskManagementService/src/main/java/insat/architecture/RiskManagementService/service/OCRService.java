package insat.architecture.RiskManagementService.service;

import insat.architecture.RiskManagementService.model.Application;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.File;

@Service
public class OCRService {
  String url ="http://localhost:10000";

  private final RestTemplate restTemplate;

  public OCRService(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }
  public String getInfo(File file) {

    return this.restTemplate.getForObject(url, String.class,file );
  }
}
