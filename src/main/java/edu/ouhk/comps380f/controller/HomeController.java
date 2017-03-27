package edu.ouhk.comps380f.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends HttpServlet {
    @Autowired
    StudentTemplate addDatabase;

//    public String viewHome() {
//        return "home";
//    }
    @RequestMapping(value = "/*")
    public ModelAndView defaultPage() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome pages");
        return model;
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView welcomPage() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is welcome pages");
        return model;
    }

    @RequestMapping(value = "/admin**", method = RequestMethod.GET)
    public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }

    @RequestMapping(value = "/register")
    public ModelAndView registerPage() {
        ModelAndView model = new ModelAndView("register");
        return model;
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public ModelAndView data(HttpServletRequest request) {
        ModelAndView model = new ModelAndView("data");
        RegisterData add = new RegisterData();

        String username = request.getParameter("username");
        String password = request.getParameter("password");
        model.addObject("username", username);
        model.addObject("password", password);
        //add.setUsername(username);
        //add.setPassword(password);
        addDatabase.insert(username, password);
        //  model.addObject("password", password);
        return model;
    }

    /*   public ModelAndView adminPage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Hello World");
        model.addObject("message", "This is protected page!");
        model.setViewName("admin");
        return model;
    }
     */
}
