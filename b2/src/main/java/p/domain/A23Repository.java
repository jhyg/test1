package p.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import p.domain.*;

@RepositoryRestResource(collectionResourceRel = "a23s", path = "a23s")
public interface A23Repository extends PagingAndSortingRepository<A23, Long> {}
