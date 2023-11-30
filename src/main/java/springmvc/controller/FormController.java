package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import springmvc.entity.User;

@Controller
class FormController {

    //to display form
    @RequestMapping("/form")
    public String showForm(){
        return "form";
    }

    //to process form
    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute User user, Model model){
        model.addAttribute("user",user);
        return "profile";
    }
    //when you sumbit form, it has action=processForm so this method starts executing because we have mapped it using RequestMapping
    //then it uses @ModelAttribute to insert all input values of form to User's instance named user.
    //then it uses model to send data(User object) to profile.jsp

}
