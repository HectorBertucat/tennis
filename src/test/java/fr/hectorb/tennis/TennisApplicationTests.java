package fr.hectorb.tennis;

import fr.hectorb.tennis.repository.HealthCheckRepository;
import fr.hectorb.tennis.service.HealthCheckService;
import fr.hectorb.tennis.web.HealthCheckController;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TennisApplicationTests {

    @Autowired
    private HealthCheckController healthCheckController;
    @Autowired
    private HealthCheckRepository healthCheckRepository;
    @Autowired
    private HealthCheckService healthCheckService;

	@Test
	void contextLoads() {
        Assertions.assertThat(healthCheckController).isNotNull();
        Assertions.assertThat(healthCheckRepository).isNotNull();
        Assertions.assertThat(healthCheckService).isNotNull();
	}

}
