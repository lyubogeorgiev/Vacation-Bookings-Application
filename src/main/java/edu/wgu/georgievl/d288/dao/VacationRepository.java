package edu.wgu.georgievl.d288.dao;

import edu.wgu.georgievl.d288.entities.Vacation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRepository extends CrudRepository<Vacation, Integer> {
}
