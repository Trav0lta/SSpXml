package ua.com.owu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ua.com.owu.entity.Profile;
import ua.com.owu.entity.User;
import ua.com.owu.service.ProfileService;
import ua.com.owu.service.SecurityService;
import ua.com.owu.service.UserService;
import ua.com.owu.validator.UserValidator;

import java.security.Principal;
import java.util.List;

@Controller
public class ProfileController {


    @Autowired
    private ProfileService profileService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/", "/welcome"}, method = RequestMethod.GET)
    public String welcome() {

        return "welcome";
    }


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String registration(Model model) {
        model.addAttribute("indexform");
        return "/index";
    }

//    @RequestMapping(value = "/personal", method = RequestMethod.GET)
//    public String personal(Model model) {
//        model.addAttribute("personalform");
//        return "/personal";
//    }


    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String saveProfile(Model model,
                              Principal principal,
                              @RequestParam("interest") String interest,
                              @RequestParam("aim") String aim) {
        String principalName = principal.getName();
        User byUsername = userService.findByUsername(principalName);
        model.addAttribute("currentUser", byUsername);
        Profile profile = new Profile();
        profile.setInterest(interest);
        profile.setAim(aim);
        profile.setUser(byUsername);
        profileService.save(profile);
        return "/personal";
    }


    @RequestMapping(value = "/showAllInterests", method = RequestMethod.GET)
    public String showAllInterests(Model model) {
        List<Profile> profiles = profileService.findAll();
        model.addAttribute("AllInterests", profiles);
        return "personal";
    }
}
