package edu.wgu.georgievl.d288.dao;

import edu.wgu.georgievl.d288.entities.Excursion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExcursionRepository extends JpaRepository<Excursion, Integer> {
}
