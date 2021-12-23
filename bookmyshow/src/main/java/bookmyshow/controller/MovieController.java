package bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bookmyshow.Models.Movie;
import bookmyshow.service.MovieService;

@Controller
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movie")
	public String showMovie() {
		
		System.out.println("my movie section will work");
		return "movie";
	}
  
	@RequestMapping(path ="/bookingform" , method = RequestMethod.POST)
	public String getMovie(@ModelAttribute Movie movie ,Model model) {
		System.out.println(movie);
		this.movieService.createMovie(movie);
		return "booking";
	}
}
