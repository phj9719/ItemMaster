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
    private MaterialId materialId;
    private ProcessId processId;

    public ItemInserted(Item aggregate) {
        super(aggregate);
    }

    public ItemInserted() {
        super();
    }
}
