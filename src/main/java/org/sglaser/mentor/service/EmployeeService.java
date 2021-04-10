package org.sglaser.mentor.service;

import org.sglaser.mentor.dto.EmployeeRegistrationDto;
import org.sglaser.mentor.model.Employee;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface EmployeeService extends UserDetailsService {
    
    Employee save (EmployeeRegistrationDto registrationDto);
}
