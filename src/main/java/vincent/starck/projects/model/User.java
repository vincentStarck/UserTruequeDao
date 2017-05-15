package vincent.starck.projects.model;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	public String id;
	public String firstName;
	public String lastName;
	public String middleName;
	
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String email;
	

	public User() {
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
