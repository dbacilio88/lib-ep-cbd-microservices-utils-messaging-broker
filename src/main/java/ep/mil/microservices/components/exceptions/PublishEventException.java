package ep.mil.microservices.components.exceptions;

import ep.mil.microservices.components.helpers.StringFormat;

public class PublishEventException extends RuntimeException {

    private static final long serialVersionUID = 5230715778825341062L;

    public PublishEventException(String message) {
        super(message);
    }

    public PublishEventException(String message, int replyCode) {
        super(StringFormat.formatMessage("Event could not be publish. message: %s, code: %s", new Object[]{message, Integer.valueOf(replyCode)}));
    }

    public PublishEventException(String message, Throwable cause) {
        super(message, cause);
    }

    public PublishEventException(Throwable cause) {
        super(cause);
    }

    public PublishEventException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
