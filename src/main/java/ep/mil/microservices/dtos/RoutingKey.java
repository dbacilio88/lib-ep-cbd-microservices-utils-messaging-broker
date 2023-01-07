package ep.mil.microservices.dtos;

import ep.mil.microservices.components.enums.EventType;
import lombok.*;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class RoutingKey implements Serializable {

    private static final long serialVersionUID = 7509298680109475595L;

    private EventType eventType;

    private String origin;

    private String destiny;

    private String domain;

    private String command;

    private String additional;
}
