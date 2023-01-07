package ep.mil.microservices.components.configurations;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@EnableConfigurationProperties
@ConfigurationProperties(prefix = "rabbit")
@Configuration
@ComponentScans({
    @ComponentScan({"ep.mil.microservices.services.implementations"}),
    @ComponentScan({"ep.mil.microservices.components.aspects"}),
    @ComponentScan({"ep.mil.microservices.services"}),
    @ComponentScan({"ep.mil.microservices.components"}),
    @ComponentScan({"ep.mil.microservices"})
})
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class MicroservicesMessagingConfiguration {

    private String host;

    private int port;

    private String username;

    private String password;

    private String virtualhost;

    private boolean publisherReturns;

    private String publisherConfirmType;
}
