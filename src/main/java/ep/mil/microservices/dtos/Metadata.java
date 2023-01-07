package ep.mil.microservices.dtos;

import lombok.*;

import java.io.Serializable;
import java.util.Queue;


@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Metadata implements Serializable {

    private static final long serialVersionUID = 2098929213317775875L;

    private Queue<Step> steps;
}
