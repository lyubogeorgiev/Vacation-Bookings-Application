package edu.wgu.georgievl.d288.dao;

import edu.wgu.georgievl.d288.entities.Vacation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "vacations", path = "vacations")
public interface VacationRepository extends CrudRepository<Vacation, Integer> {
}
