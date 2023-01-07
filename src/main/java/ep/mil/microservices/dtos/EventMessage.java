package ep.mil.microservices.dtos;

import ep.mil.microservices.components.helpers.Serializer;
import lombok.*;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageProperties;

import java.io.Serializable;
import java.util.Map;

@ToString
@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class EventMessage extends Message implements Serializable {

    private static final long serialVersionUID = -192314856043447771L;

    private Map<String, String> eventSequences;

    private Map<String, String> eventLog;

    public EventMessage(Object body, String appId) {
        super(Serializer.objectToBytes(body), new MessageProperties());
        getMessageProperties().setAppId(appId);
    }

    public EventMessage(byte[] body, String appId) {
        super(body, new MessageProperties());
        getMessageProperties().setAppId(appId);
    }

    public EventMessage(byte[] body, MessageProperties messageProperties) {
        super(body, messageProperties);
    }

    public EventMessage(Object body, MessageProperties messageProperties) {
        super(Serializer.objectToBytes(body), messageProperties);
    }

  /*  @Override
    public boolean equals(Object object) {
        return super.equals(object);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }*/
}
