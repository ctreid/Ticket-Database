package project;

import java.util.ArrayList;

public class Playhouse {
	private Plays plays;
	private Users users;
	
	public Playhouse() {
		plays = Plays.getInstance();
		users = Users.getInstance();
	}
	
	//Returns true if item is found, and false otherwise
	public boolean findPlay(String playName) {
		ArrayList<Play> playList = plays.getPlay();
		for (int i = 0; i < playList.size(); i++) {
			Play tmp = playList.get(i);
			if (playName.equalsIgnoreCase(tmp.getTitle())) {
				return true;
			}
		}
		return false;
	}
	
	public boolean checkout(String playName) {
		if(!findPlay(playName))return false;
		
		//checkout the item
		//need a user then have them checkout an item
		return true;
	}
	
	public boolean ratePlay(String playName, int rating) {
		if(!findPlay(playName))return false;
		
		if(rating < 0 || rating > 5) return false;
		
		return true;
	}
	
	public boolean payFine(int amount) {
		if(amount < 0) return false;
		
		return true; 	//successfully paid fine
	}
}