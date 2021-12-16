package bookmyshow.Entities;

public class User {
	
	private int id;
	private String UserName;
	private String UserEmail;
	private String UserPassword;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public User(int id, String userName, String userEmail, String userPassword) {
		super();
		this.id = id;
		UserName = userName;
		UserEmail = userEmail;
		UserPassword = userPassword;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	
	
	

}
