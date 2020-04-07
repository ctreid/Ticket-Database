package project;

public class Theater {
	private Movies movies;
	private Users users;
	
	public Theater() {
		movies = Movies.getInstance();
		users = Users.getInstance();
	}
	
	//Returns true if item is found, and false otherwise
	public boolean findMovie(String movieName) {
		return movies.haveMovie(movieName);
	}
	
	public boolean checkout(String movieName) {
		if(!findMovie(movieName))return false;
		
		//checkout the item
		//need a user then have them checkout an item
		return true;
	}
	
	public boolean rateMovie(String movieName, int rating) {
		if(!findMovie(movieName))return false;
		
		if(rating < 0 || rating > 5) return false;
		
		return true;
	}
	
	public boolean payFine(int amount) {
		if(amount < 0) return false;
		
		return true; 	//successfully paid fine
	}
}
