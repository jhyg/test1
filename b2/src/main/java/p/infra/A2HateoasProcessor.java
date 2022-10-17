package p.infra;
import p.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class A2HateoasProcessor implements RepresentationModelProcessor<EntityModel<A2>>  {

    @Override
    public EntityModel<A2> process(EntityModel<A2> model) {

        
        return model;
    }
    
}
