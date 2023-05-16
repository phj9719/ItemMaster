package itemmaster.domain;

import itemmaster.ProcessApplication;
import itemmaster.domain.ProcessInserted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;

@Entity
@Table(name = "Process_table")
@Data
public class Process {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String itemCd;

    @PostPersist
    public void onPostPersist() {
        ProcessInserted processInserted = new ProcessInserted(this);
        processInserted.publishAfterCommit();
    }

    public static ProcessRepository repository() {
        ProcessRepository processRepository = applicationContext()
            .getBean(ProcessRepository.class);
        return processRepository;
    }

    public static ApplicationContext applicationContext() {
        return ProcessApplication.applicationContext;
    }
}
