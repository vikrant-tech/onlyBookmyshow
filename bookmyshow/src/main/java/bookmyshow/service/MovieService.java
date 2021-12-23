package bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import bookmyshow.Dao.MovieDao;
import bookmyshow.Models.Movie;

@Service
public class MovieService {

	@Autowired
	private MovieDao movieDao;
	public int createMovie(Movie movie) {
		return this.movieDao.saveMovie(movie);
	}
}
