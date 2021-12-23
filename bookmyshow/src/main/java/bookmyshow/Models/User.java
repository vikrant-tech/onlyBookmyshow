package bookmyshow.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class User {
	
	private String email;
	@Override
	public String toString() {
		return "User [email=" + email + ", username=" + username + ", password=" + password + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
//	@NotBlank(message = " * user name can't be blank !!!")
	private String username;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
