package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import ua.com.owu.entity.User;
import ua.com.owu.service.ProfileService;
import ua.com.owu.service.SecurityService;
import ua.com.owu.service.UserService;
import ua.com.owu.validator.UserValidator;
import org.springframework.ui.Model;

import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private UserService userService;





    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String admin(Model model) {
        return "admin";
    }



    @RequestMapping(value = "/showAll",method = RequestMethod.GET)
    public String showAll(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("allUsers",users);
        return "admin";
    }

//    @RequestMapping(value ="/delete",method = RequestMethod.POST)
//    public ModelAndView delete(@RequestParam int id){
//        userService.delete(id);
//        return  new ModelAndView("redirect:admin");
//    }


}
