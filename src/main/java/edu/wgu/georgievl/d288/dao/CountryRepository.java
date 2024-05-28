package edu.wgu.georgievl.d288.dao;

import edu.wgu.georgievl.d288.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "country", path = "countries")
public interface CountryRepository extends JpaRepository<Country, Long> {
}
