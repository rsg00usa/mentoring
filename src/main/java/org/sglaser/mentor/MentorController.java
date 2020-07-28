package org.sglaser.mentor;

import java.time.LocalDate;
import java.util.List;

import org.sglaser.mentor.model.Employee;
import org.sglaser.mentor.model.MentorRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MentorController {

    private static final Logger LOG = LoggerFactory.getLogger(MentorController.class);

    @Autowired
    private MentorRepository repository;

    // Serve the home page with dynamic title and page css
    @GetMapping("/")
    public ModelAndView serveHomePage() {
        return setDefaultModelAndView("Mentoring", "index.css");
    } 

    // Serve the registration page for emplyees to register
    @GetMapping("/register")
    public ModelAndView serveRegistrationPage() {
        return setDefaultModelAndView("Registration", "register.css");
    }

    // Collect employee registration information from registration page
    @PostMapping("/register")
    public ModelAndView doRegistration(@ModelAttribute Employee employee) {
        employee.setRegDate(LocalDate.now());
        repository.save(employee);
        return setDefaultModelAndView("Registration", "register.css");
    }   

    // Get list of all the mentees as employee entity
    @GetMapping("/mentees")
    public ModelAndView displayMentees() {
        List<Employee> employees = repository.findByMentee("true");
        ModelAndView modelView = setDefaultModelAndView("Mentees", "mentee.css");
        modelView.addObject("mentees", employees);
       return modelView; 
    }

    // Get list of all the mentors as employee entity
    @GetMapping("/mentors")
    public ModelAndView displayMentors() {
        List<Employee> employees = repository.findByMentor("true");
         ModelAndView modelView = setDefaultModelAndView("Mentors", "mentor.css");
         modelView.addObject("mentors", employees);
        return modelView;      
    }
    
    // Set some default model values and view for each page
    private ModelAndView setDefaultModelAndView(String title, String style) {
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("title", title);
        modelView.addObject("page-style", style);
        modelView.setViewName(style.split("\\.")[0]);
        return modelView;
    }
}
