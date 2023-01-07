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
public class Event<T> implements Serializable {

    private static final long serialVersionUID = 6663799768098658089L;

    private RoutingKey routingKey;

    private MessageProperties messageProperties;

    private Metadata metadata;

    private int code;

    private String message;

    private Map<String, ?> headers;

    private T data;

    private Trailer trailer;
}
