
public class User {
	private String password;
	private String userName;
	
	public User(String password, String userName) {
		this.password = password;
		this.userName = userName;
	}
	public String getuserName() {
		return userName;
	}
	
	public void setuserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}