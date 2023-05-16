package itemmaster.domain;

import itemmaster.domain.*;
import itemmaster.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class ItemInserted extends AbstractEvent {

    private Long id;
    private String itemCd;
    private String itemName;
    private String itemSize;
    private Date createAt;
    private ProcessId processId;
    private MaterialId materialId;

    public ItemInserted(Item aggregate) {
        super(aggregate);
    }

    public ItemInserted() {
        super();
    }
}
