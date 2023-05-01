package insat.architecture.OrchestrationService.service;

import insat.architecture.OrchestrationService.model.Application;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class CommercialServiceGate {



  String url ="http://localhost:8081";

  private final RestTemplate restTemplate;

  public CommercialServiceGate(RestTemplateBuilder restTemplateBuilder) {
    this.restTemplate = restTemplateBuilder.build();
  }
  public String getRating(Application app) {

    return this.restTemplate.getForObject(url, String.class,app );
  }
}
