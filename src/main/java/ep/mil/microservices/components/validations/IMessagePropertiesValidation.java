package ep.mil.microservices.components.validations;

import ep.mil.microservices.components.enums.MessagingValidationResult;
import org.springframework.amqp.core.MessageProperties;

import java.util.Objects;
import java.util.function.Function;

public interface IMessagePropertiesValidation extends Function<MessageProperties, MessagingValidationResult> {

    static IMessagePropertiesValidation validateReplyTo() {
        return messageProperties ->
            Objects.isNull(messageProperties)
                || Objects.isNull(messageProperties.getReplyTo())
                || messageProperties.getReplyTo().trim().isEmpty()
                ? MessagingValidationResult.PROCESS_VALIDATION_FAIL
                : MessagingValidationResult.PROCESS_VALIDATION_SUCCESS;

    }

    static IMessagePropertiesValidation validateCorrelationId() {
        return messageProperties ->

            Objects.isNull(messageProperties)
                || Objects.isNull(messageProperties.getCorrelationId())
                || messageProperties.getCorrelationId().trim().isEmpty()
                ? MessagingValidationResult.PROCESS_VALIDATION_FAIL
                : MessagingValidationResult.PROCESS_VALIDATION_SUCCESS;
    }

    default IMessagePropertiesValidation and(IMessagePropertiesValidation otherValidation) {
        return messageProperties -> {
            MessagingValidationResult messagingValidationResult = apply(messageProperties);
            return messagingValidationResult.equals(MessagingValidationResult.PROCESS_VALIDATION_SUCCESS) ? otherValidation.apply(messageProperties) : messagingValidationResult;
        };
    }
}
