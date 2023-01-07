package ep.mil.microservices.dtos;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Confirm implements Serializable {

    private static final long serialVersionUID = -7017669004577222629L;

    private String id;

    private boolean confirmed;

    private String reason;
}
