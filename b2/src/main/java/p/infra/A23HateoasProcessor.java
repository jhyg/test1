package p.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import p.domain.*;

@Component
public class A23HateoasProcessor
    implements RepresentationModelProcessor<EntityModel<A23>> {

    @Override
    public EntityModel<A23> process(EntityModel<A23> model) {
        return model;
    }
}
