package itemmaster.domain;

import itemmaster.ItemMasterApplication;
import itemmaster.domain.ItemInserted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Item_table")
@Data
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemCd;

    private String itemName;

    private String itemSize;

    private Date createAt;

    @Embedded
    @AttributeOverride(
        name = "id",
        column = @Column(name = "processId", nullable = true)
    )
    private ProcessId processId;

    @Embedded
    @AttributeOverride(
        name = "id",
        column = @Column(name = "materialId", nullable = true)
    )
    private MaterialId materialId;

    @Embedded
    private ItemCd itemCd;

    @PostPersist
    public void onPostPersist() {
        ItemInserted itemInserted = new ItemInserted(this);
        itemInserted.publishAfterCommit();
    }

    public static ItemRepository repository() {
        ItemRepository itemRepository = applicationContext()
            .getBean(ItemRepository.class);
        return itemRepository;
    }

    public static ApplicationContext applicationContext() {
        return ItemMasterApplication.applicationContext;
    }
}
