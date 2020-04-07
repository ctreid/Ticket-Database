import java.util.ArrayList;
import java.util.Scanner; 

public class UserInterface {
	private Scanner scanner;
	private String user;
	User u = new User();
	
	public UserInterface(String user) {
		scanner = new Scanner (System.in);
		this.user = user;
	}

	public void user() {
		Users user = Users.getInstance();
		
		System.out.println("******User Information******");
		displayUser();
	}
	
	public void displayUser() {
		System.out.println("Username: " + u.getUserName());
	}
	
	public void newUser() {
		System.out.println("Welcome new user! \nPlease enter a username: ");
		String username = scanner.next();
		u.setUserName(username);
		System.out.println("Please enter a password: ");
		String password = scanner.next();
		u.setPassword(password);
		System.out.println("");
	}
	
	public void guestUser() {
		System.out.println("Welcome guest user! The guest username and password are both Guest");
		u.setUserName("Guest");
		u.setPassword("Guest");
	}
	
	public void employeeUser() {
		System.out.println("Welcome back! \nPlease enter your username: ");
		String username = scanner.next();
		u.setUserName(username);
		System.out.println("Please enter your password: ");
		String password = scanner.next();
		u.setPassword(password);
	}
	
	public void returningUser() {
		System.out.println("Welcome back! \nPlease enter your username: ");
		String username = scanner.next();
		u.setUserName(username);
		System.out.println("Please enter your password: ");
		String password = scanner.next();
		u.setPassword(password);
	}
	
	public void setUserChoice(String user) {
		this.user = user;
	}
	
	public String getUserChoice() {
		return user;
	}
	
	public void userChoice() {
		if (getUserChoice().equals("N")) {
			newUser();
		}
		
		else if(getUserChoice().equals("R")) {
			returningUser();
		}
		
		else if(getUserChoice().equals("G")) {
			guestUser();
		}
		
		else {
			employeeUser();
		}
	}
}

