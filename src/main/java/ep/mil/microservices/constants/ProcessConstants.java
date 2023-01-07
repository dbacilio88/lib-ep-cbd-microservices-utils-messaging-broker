package ep.mil.microservices.constants;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ProcessConstants {

    public static final String SIMPLE_EMPTY_FORMAT = "";

    public static final String SIMPLE_DOT_FORMAT = ".";

    public static final String SIMPLE_DATE_FORMAT = "yyyyMMddHHmmssSSS";

    public static final String PARAMETER_CHANNEL = "channel";

    public static final String PARAMETER_METHOD = "method";

    public static final String PARAMETER_BEAN = "bean";

    public static final String PARAMETER_QUEUE_NAME = "queueName";

    public static final int NUMBER_PARAMETER_TYPES_REQUIRED = 3;

    public static final int NUMBER_PARAMETER_TYPES_REQUIRED_CONFIRM = 1;

    public static final int PARAMETER_TYPES_REQUIRED_FIRST_INDEX = 0;

    public static final int PARAMETER_TYPES_REQUIRED_SECOND_INDEX = 1;

    public static final int PARAMETER_TYPES_REQUIRED_THIRD_INDEX = 2;

    public static final int GENERAL_REPLY_CODE = 500;
}
