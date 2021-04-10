package org.sglaser.mentor.control;

import java.util.List;

import org.sglaser.mentor.model.Employee;
import org.sglaser.mentor.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MentorController {

    @Autowired
    BaseController base;

    @Autowired
    private EmployeeRepository repository;

    // Serve the home page with dynamic title and page css
    @GetMapping("/")
    public ModelAndView serveHomePage() {
        return base.setDefaultModelAndView("Mentoring", "index.css");
    } 

    // Get list of all the mentees as employee entity
    @GetMapping("/mentees")
    public ModelAndView displayMentees() {
        List<Employee> employees = repository.findByMentee("true");
        ModelAndView modelView = base.setDefaultModelAndView("Mentees", "mentee.css");
        modelView.addObject("mentees", employees);
       return modelView; 
    }

    // Get list of all the mentors as employee entity
    @GetMapping("/mentors")
    public ModelAndView displayMentors() {
        List<Employee> employees = repository.findByMentor("true");
         ModelAndView modelView = base.setDefaultModelAndView("Mentors", "mentor.css");
         modelView.addObject("mentors", employees);
        return modelView;      
    }
}