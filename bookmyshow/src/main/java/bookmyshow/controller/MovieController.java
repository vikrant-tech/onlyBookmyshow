package bookmyshow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MovieController {
	
	@RequestMapping("/movie")
	public String showMovie() {
		
		System.out.println("my movie section will work");
		return "movie";
	}

}
