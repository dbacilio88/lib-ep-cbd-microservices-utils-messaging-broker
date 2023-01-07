package ep.mil.microservices.components.helpers;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class EnvironmentUtils {

    private final Environment environment;

    public EnvironmentUtils(Environment environment) {
        this.environment = environment;
    }

    public String getValue(String variable) {
        if (variable.startsWith("${") && variable.endsWith("}"))
            return this.environment.resolvePlaceholders(variable);
        return variable;
    }

}
