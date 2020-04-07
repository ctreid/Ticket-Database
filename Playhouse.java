package project;

public class Playhouse {
	private Plays plays;
	private Users users;
	
	public Playhouse() {
		plays = Plays.getInstance();
		users = Users.getInstance();
	}
	
	//Returns true if item is found, and false otherwise
	public boolean findPlay(String movieName) {
		return plays.haveMovie(movieName);
	}
	
	public boolean checkout(String playName) {
		if(!findPlay(playName))return false;
		
		//checkout the item
		//need a user then have them checkout an item
		return true;
	}
	
	public boolean ratePlay(String playName, int rating) {
		if(!findPlay(playeName))return false;
		
		if(rating < 0 || rating > 5) return false;
		
		return true;
	}
	
	public boolean payFine(int amount) {
		if(amount < 0) return false;
		
		return true; 	//successfully paid fine
	}
}
