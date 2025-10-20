package fr.hectorb.tennis.service;

import fr.hectorb.tennis.ApplicationStatus;
import fr.hectorb.tennis.HealthCheck;
import org.springframework.stereotype.Service;

@Service
public class HealthCheckService {

    public HealthCheck healthCheck() {
        return new HealthCheck(ApplicationStatus.OK, "Welcome to Hector tennis");
    }
}
