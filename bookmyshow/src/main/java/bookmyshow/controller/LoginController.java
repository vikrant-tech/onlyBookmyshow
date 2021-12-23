package bookmyshow.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import bookmyshow.Models.User;
import bookmyshow.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/login")
	public String showForm() {
		return "login";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String getForm(@ModelAttribute User user, Model model) {
		
		if(user.getUsername().isBlank()) {
			
			System.out.println("my user form has error!!");
			
		     return "login";	
		}
		if(user.getEmail().isBlank()) {
			return "login";
		}
		if(user.getPassword().isBlank()) {
			return "login";
		}
		
		
		
		System.out.println(user);
		
			
		
		this.userService.createUser(user);
		
		
		
		//model.addAttribute("user", user);
		
		return "success";
	}

}

/*
@RequestMapping(path = "/processform", method = RequestMethod.POST)
public String getForm(@RequestParam("email") String email, @RequestParam("username") String username, @RequestParam("password") String password,Model model) {
	
	User user = new User();
	user.setEmail(email);
	user.setPassword(password);
	user.setUsername(username);
	
	System.out.println(user);
	
	
	//System.out.println("user email is " + email);
	//System.out.println("user name is " + username);
	//System.out.println("user password is "+ password);
	
//	model.addAttribute("email" , email);
//	model.addAttribute("username",username);
//	model.addAttribute("password" , password);  
	
	
	model.addAttribute("user", user);
	
	return "success";
	
	*/
