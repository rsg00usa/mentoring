package org.sglaser.mentor.repository;

import java.util.List;

import org.sglaser.mentor.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

// Identify the type of entity (Employee) and primary key (String) in JpaRepository

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

    @Query("FROM Employee e WHERE e.beMentee = ?1 ORDER BY team")
    List<Employee> findByMentee(String mentee);

    @Query("FROM Employee e WHERE e.beMentor = ?1 ORDER BY team")
    List<Employee> findByMentor(String mentor);

    @Query("FROM Employee e WHERE e.email = ?1")
    //List<Employee> findByEmail(String email);
    Employee findByEmail(String email);

}