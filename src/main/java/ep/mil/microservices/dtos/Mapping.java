package ep.mil.microservices.dtos;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Mapping implements Serializable {

    private static final long serialVersionUID = 1798117057547103312L;

    private String body;
}
