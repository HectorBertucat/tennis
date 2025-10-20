package fr.hectorb.tennis.service;

import fr.hectorb.tennis.ApplicationStatus;
import fr.hectorb.tennis.HealthCheck;
import fr.hectorb.tennis.repository.HealthCheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    @Autowired
    private HealthCheckRepository healthCheckRepository;

    public HealthCheck healthCheck() {
        Long nbDbConnections = healthCheckRepository.countApplicationConnections();

        if (nbDbConnections > 0) {
            return new HealthCheck(ApplicationStatus.OK, "Db has " + nbDbConnections + " connections");
        }  else {
            return new HealthCheck(ApplicationStatus.KO, "Db has " + nbDbConnections + " connections");
        }
    }
}
