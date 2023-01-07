package ep.mil.microservices.dtos;

import com.rabbitmq.client.BasicProperties;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import lombok.*;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
@SuppressFBWarnings(value = "SE_BAD_FIELD", justification = "Objects of this class will not be deserialized correctly if a non-Serializable object is stored in this field.")
public class EventResponseMessage<T> implements Serializable {

    private static final long serialVersionUID = 3477779237733336830L;

    private T body;

    private BasicProperties basicProperties;
}
