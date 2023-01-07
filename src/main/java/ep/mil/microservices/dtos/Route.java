package ep.mil.microservices.dtos;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Route implements Serializable {

    private static final long serialVersionUID = 790485614438696814L;

    private String step;

    private String mapping;
}
