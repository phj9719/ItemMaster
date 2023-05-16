package itemmaster.domain;

import itemmaster.MaterialApplication;
import itemmaster.domain.MaterialInserted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Material_table")
@Data
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemCd;

    @PostPersist
    public void onPostPersist() {
        MaterialInserted materialInserted = new MaterialInserted(this);
        materialInserted.publishAfterCommit();
    }

    public static MaterialRepository repository() {
        MaterialRepository materialRepository = applicationContext()
            .getBean(MaterialRepository.class);
        return materialRepository;
    }

    public static ApplicationContext applicationContext() {
        return MaterialApplication.applicationContext;
    }
}
