package p.domain;

import p.domain.*;
import p.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class E extends AbstractEvent {

    private Long id;

    public E(A aggregate){
        super(aggregate);
    }
    public E(){
        super();
    }
}
