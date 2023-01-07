package ep.mil.microservices.components.enums;

import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Getter
public enum ExchangeType {

    DIRECT("direct"),
    TOPIC("topic"),
    FANOUT("fanout"),
    HEADERS("headers"),
    SYSTEM("system");

    private final String value;

    private static final Map<String, ExchangeType> MAP_EXCHANGE_TYPE = new HashMap<>();

    static {
        for (ExchangeType et : EnumSet.allOf(ExchangeType.class)) {
            MAP_EXCHANGE_TYPE.put(et.getValue(), et);
        }
    }

    ExchangeType(String value) {
        this.value = value;
    }

    public static Optional<ExchangeType> findExchangeTypeByValue(String value) {
        return StringUtils.isNoneBlank(value) ? Optional.of(MAP_EXCHANGE_TYPE.get(value)) : Optional.empty();
    }


}
