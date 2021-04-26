package hmw1;

public class User {
	
	int id;
	String name, email, password, userType;
	
	
	User(int id, String name, String email, String password, String userType){
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}
}
