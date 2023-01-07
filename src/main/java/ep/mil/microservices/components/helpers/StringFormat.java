package ep.mil.microservices.components.helpers;

public class StringFormat {

    public static String formatMessage(String message, Object... variables) {
        return String.format(message, variables);
    }
}
