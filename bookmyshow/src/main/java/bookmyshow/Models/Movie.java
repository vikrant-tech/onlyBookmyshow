package bookmyshow.Models;

public class Movie {
	private int id;
	private String name;
	private String language;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Movie(int id, String name, String language) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
	}
	

}
