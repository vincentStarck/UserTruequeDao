package hello;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	public String id;
	public String firstName;
	public String lastName;

	public User() {
	}

	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

}
