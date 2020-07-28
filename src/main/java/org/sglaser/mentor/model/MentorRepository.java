package org.sglaser.mentor.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Identify the type of entity (Employee) and primary key (String) in CrudRepository

@Repository
public interface MentorRepository extends CrudRepository<Employee, String> {

    @Query("FROM Employee e WHERE e.mentee = ?1 ORDER BY team")
    List<Employee> findByMentee(String mentee);

    @Query("FROM Employee e WHERE e.mentor = ?1 ORDER BY team")
    List<Employee> findByMentor(String mentor);
}