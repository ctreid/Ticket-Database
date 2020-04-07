package project;
import java.util.ArrayList;

public class Movies {
	private static Movies movies;
	private ArrayList<Movie> movieList;
	
	private Movies() {
		movieList = Database.getMovies();
	}
	
	public static Movies getInstance() {
		if (movies == null) {
			movies = new Movies();
		}
		return movies;
	}
	
	public boolean haveMovie(String movieNamee) {
		return true;
	}
	
	public Movie getMovie(String movieName) {
		return null;
	}
}
