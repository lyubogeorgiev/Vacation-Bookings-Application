package edu.wgu.georgievl.d288.dao;

import edu.wgu.georgievl.d288.entities.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "division", path = "divisions")
public interface DivisionRepository extends JpaRepository<Division, Integer> {
}
