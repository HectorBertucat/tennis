package fr.hectorb.tennis.web;

import fr.hectorb.tennis.HealthCheck;
import fr.hectorb.tennis.service.HealthCheckService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "HealthCheck API")
@RestController
public class HealthCheckController {

    @Autowired
    private HealthCheckService healthCheckService;

    @Operation(summary = "Returns app status", description = "Returns if the app is connected to the db and its status")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Healthcheck with some details",
            content = {@Content(mediaType = "application/json",
            schema = @Schema(implementation = HealthCheck.class)) }),
    })
    @GetMapping("/healthcheck")
    public HealthCheck healthCheck() {
        return healthCheckService.healthCheck();
    }
}
