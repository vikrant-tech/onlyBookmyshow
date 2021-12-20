package bookmyshow.Models;

public class Movie {
	
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieLanguage=" + movieLanguage + ", MovieType=" + MovieType + "]";
	}
	private int id;
	private String movieName;
	private String movieLanguage;
	private String MovieType;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieLanguage() {
		return movieLanguage;
	}
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	public String getMovieType() {
		return MovieType;
	}
	public void setMovieType(String movieType) {
		MovieType = movieType;
	}
	

}
