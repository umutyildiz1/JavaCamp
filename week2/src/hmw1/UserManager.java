package hmw1;

public class UserManager {
	public void printUser(User user) {
		System.out.println("Name:" + user.name + " Id:" + user.id + "Email:" + user.email);
	}
	public void changeUserName(User user, String name) {
		user.name = name;
	}
}
