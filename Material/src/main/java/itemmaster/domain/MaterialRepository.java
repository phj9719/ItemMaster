package itemmaster.domain;

import itemmaster.domain.*;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "materials", path = "materials")
public interface MaterialRepository
    extends PagingAndSortingRepository<Material, Long> {
    List<Material> findByItemCd(String itemCd);
}
