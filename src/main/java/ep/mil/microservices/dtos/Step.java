package ep.mil.microservices.dtos;

import lombok.*;
import org.springframework.amqp.core.MessageProperties;

import java.io.Serializable;
import java.util.Map;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Step implements Serializable {

    private static final long serialVersionUID = 8579328134634458621L;


    private RoutingKey routingKey;

    private MessageProperties messageProperties;

    private Map<String, String> mapper;
}
