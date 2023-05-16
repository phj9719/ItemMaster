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

    private String material;

    private String process;

    private Date createAt;

    @Embedded
    private MaterialId materialId;

    @Embedded
    private ProcessId processId;

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
