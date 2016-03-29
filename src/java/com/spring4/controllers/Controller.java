package com.spring4.controllers;

import com.spring4.model.Persona;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

@RestController
public class Controller
{
    @RequestMapping("/persona")
    public Persona saludar()
    {
        return new Persona("Nicolas","Grossi");
    }
    
    @RequestMapping("/")
    public ModelAndView redirect()
    {
        ModelAndView mav = new ModelAndView("redirect.jsp");
        return mav;
    }
}
