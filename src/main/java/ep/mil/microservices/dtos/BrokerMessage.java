package ep.mil.microservices.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class BrokerMessage<T> implements Serializable {

    private static final long serialVersionUID = 3414137107139454324L;

    private Map<String, String> eventSequences;

    private Map<String, String> eventLog;

    private HashMap<String, Object> headers;

    private HashMap<String, Object> metadata;

    private T data;

    private Trailer trailer;
}
