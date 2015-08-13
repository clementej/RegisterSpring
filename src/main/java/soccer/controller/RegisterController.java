package soccer.controller;

/**
 * Created by clementearismendi on 2015-08-10.
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import soccer.model.Player;

import java.util.Map;

@Controller
    @RequestMapping(value = "/register")
    public class RegisterController {


        @RequestMapping(method = RequestMethod.GET)
        public String viewRegistration(Map<String, Object> model) {
            Player playerForm = new Player();
            model.put("playerForm", playerForm);

            return "Registration";
        }

        @RequestMapping(method = RequestMethod.POST, value ="/register")
        public String processRegistration(@ModelAttribute("playerForm") Player player,
                                          Map model) {

//            model.addAttribute("username", player.getUsername());
//            model.addAttribute("lastname", player.getLastname());
//            model.addAttribute("age", player.getAge());
//            model.addAttribute("salary", player.getSalary());
//            model.addAttribute("country", player.getCountry());
//            model.addAttribute("position", player.getPosition());
//

// for testing purpose:
            System.out.println("First name: " + player.getUsername());
            System.out.println("Last name: " + player.getLastname());
            System.out.println("Age: " + player.getAge());
            System.out.println("Salary: " + player.getSalary());
            System.out.println("Country: " + player.getCountry());
            System.out.println("Position: " + player.getPosition());

            return "RegistrationSuccess";
        }
//

}
