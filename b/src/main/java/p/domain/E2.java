package p.domain;

import java.util.*;
import lombok.*;
import p.domain.*;
import p.infra.AbstractEvent;

@Data
@ToString
public class E2 extends AbstractEvent {

    private Long id;

    public E2(A aggregate) {
        super(aggregate);
    }

    public E2() {
        super();
    }
}
