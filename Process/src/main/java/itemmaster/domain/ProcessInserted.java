package itemmaster.domain;

import itemmaster.domain.*;
import itemmaster.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ProcessInserted extends AbstractEvent {

    private Long id;
    private String itemCd;
    private String itemName;

    public ProcessInserted(Process aggregate) {
        super(aggregate);
    }

    public ProcessInserted() {
        super();
    }
}
