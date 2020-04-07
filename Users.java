import java.util.ArrayList;
public class Users {
	private static Users users = null;
	private static ArrayList<User> userList = new ArrayList<User>();
	
	private Users() {
		userList = DataLoader.loadUser();
	}
	
	public static Users getInstance() {
		if(users == null) {
			users = new Users();
		}
		
		return users;
	}
	
	public ArrayList<User> getUser() {
		return userList;
	}
	
	public void addUser(String userName, String password) {
		userList.add(new User(userName, password));
		DataWriter.saveUser();
	}
}
