package itemmaster.domain;

import itemmaster.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "processes", path = "processes")
public interface ProcessRepository
    extends PagingAndSortingRepository<Process, Long> {
    List<Process> findByItemCd(String itemCd);
}
