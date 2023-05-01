package insat.architecture.OrchestrationService.repository;

import insat.architecture.OrchestrationService.model.Application;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, String> {
}
