package net.javaguides.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CRUDRepo extends JpaRepository<Company, Integer> {

}
