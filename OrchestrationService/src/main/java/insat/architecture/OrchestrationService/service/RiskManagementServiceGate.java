package insat.architecture.OrchestrationService.service;

import insat.architecture.OrchestrationService.model.Application;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RiskManagementServiceGate {

  String url ="http://localhost:8082";

  private final RestTemplate restTemplate;

  public RiskManagementServiceGate(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }
  public String getFinalRating(Application app) {

    return this.restTemplate.getForObject(url+"/api/risk", String.class,app );
  }
}
