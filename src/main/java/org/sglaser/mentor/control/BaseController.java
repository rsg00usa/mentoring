package org.sglaser.mentor.control;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BaseController {

    private static final Logger LOG = LoggerFactory.getLogger(BaseController.class);

    // Serve the home page with dynamic title and page css
    @GetMapping("/")
    public ModelAndView serveHomePage() {
        return setDefaultModelAndView("Mentoring", "index.css");
    } 
    
    // Set some default model values and view for each page
    protected ModelAndView setDefaultModelAndView(String title, String style) {
        LOG.info("page title = " + title);
        ModelAndView modelView = new ModelAndView();
        modelView.addObject("title", title);
        modelView.addObject("page-style", style);
        modelView.setViewName(style.split("\\.")[0]);
        return modelView;
    }
}