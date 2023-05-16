package itemmaster.domain;

import itemmaster.domain.*;
import itemmaster.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class MaterialInserted extends AbstractEvent {

    private Long id;
    private String name;

    public MaterialInserted(Material aggregate) {
        super(aggregate);
    }

    public MaterialInserted() {
        super();
    }
}
