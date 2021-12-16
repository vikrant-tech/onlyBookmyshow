package bookmyshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String showForm() {
		return "login";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getForm(@RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password,Model model) {
		
		System.out.println("user email is " + email);
		System.out.println("user name is " + username);
		System.out.println("user password is "+ password);
		
		model.addAttribute("email" , email);
		model.addAttribute("username",username);
		model.addAttribute("password" , password);
		
		return "success";
	}

}
