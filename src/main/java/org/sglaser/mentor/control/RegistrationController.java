package org.sglaser.mentor.control;

import java.time.LocalDate;

import org.sglaser.mentor.dto.EmployeeRegistrationDto;
import org.sglaser.mentor.model.Employee;
import org.sglaser.mentor.repository.EmployeeRepository;
import org.sglaser.mentor.service.EmployeeService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistrationController {

    private static final Logger LOG = LoggerFactory.getLogger(RegistrationController.class);

    @Autowired
    private BaseController base;

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private EmployeeService employeeService;

    // Serve the registration page for emplyees to register
    @GetMapping("/register")
    public ModelAndView serveRegistrationPage() {
        return base.setDefaultModelAndView("Registration", "register.css");
    }

    // Collect employee registration information from registration page
    @PostMapping("/register")
    public ModelAndView doRegistration(@ModelAttribute("employee") EmployeeRegistrationDto employeeRegDto) {
        LOG.info("form email = " + employeeRegDto.getEmail());
        
        ModelAndView modelView = base.setDefaultModelAndView("Registration", "register.css");
        Employee employee = repository.findByEmail(employeeRegDto.getEmail());
        if (employee == null) {
            employeeRegDto.setRegDate(LocalDate.now());
            employeeService.save(employeeRegDto);
            modelView.addObject("regsuccess", true);
            modelView.addObject("successmsg", "new user");
        } else {
            // TODO: check login against registration
            modelView.addObject("regfail", true);
            modelView.addObject("failmsg", "existing user");
        }
        return modelView;
    } 
}