package itemmaster.infra;

import itemmaster.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ProcessHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Process>> {

    @Override
    public EntityModel<Process> process(EntityModel<Process> model) {
        return model;
    }
}
