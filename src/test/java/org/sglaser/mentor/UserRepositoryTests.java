package org.sglaser.mentor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.sglaser.mentor.model.Employee;
import org.sglaser.mentor.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
 
    @Autowired
    private TestEntityManager entityManager;
     
    @Autowired
    private EmployeeRepository repo;

    @Test
    public void testCreateUser() {
        Employee emp = new Employee();
        emp.setEmail("ravikumar@gmail.com");
        emp.setPassword("ravi2020");
        emp.setFirstName("Ravi");
        emp.setLastName("Kumar");
        
        Employee savedemp = repo.save(emp);
        
        Employee existUser = entityManager.find(Employee.class, savedemp.getEmail());
        
        assertThat(existUser.getEmail()).isEqualTo(emp.getEmail());    
    }
}


