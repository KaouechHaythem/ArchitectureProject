package insat.architecture.OrchestrationService.service;

import org.springframework.stereotype.Service;

@Service
public class KafkaListener {


    @KafkaListener(topics = "notifications", groupId = "architecture")
    public void listen(String message) {
      System.out.println("Notification: " + message);
    }


}
