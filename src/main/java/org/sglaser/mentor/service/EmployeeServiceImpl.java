package org.sglaser.mentor.service;

import org.sglaser.mentor.dto.EmployeeRegistrationDto;
import org.sglaser.mentor.model.Employee;
import org.sglaser.mentor.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
	private BCryptPasswordEncoder passwordEncoder;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save (EmployeeRegistrationDto registrationDto) {
        Employee employee = new Employee(registrationDto.getFirstName(), registrationDto.getLastName(), registrationDto.getEmail(), passwordEncoder.encode(registrationDto.getPassword()),
            registrationDto.getTitle(), registrationDto.getTeam(), registrationDto.getBeMentor(), registrationDto.getBeMentee(), registrationDto.getRegDate());
        return employeeRepository.save(employee);
    }

    @Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}