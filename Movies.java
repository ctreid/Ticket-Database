import java.util.ArrayList;
public class Movies {
	private static Movies movies = null;
	private static ArrayList<Movie> movieList = new ArrayList<Movie>();
	
	public Movies() {
		movieList = DataLoader.loadMovie();
		
	}
	
	public static Movies getInstance() {
		if(movies == null) {
			movies = new Movies();
		}
		
		return movies;
	}
	
	public ArrayList<Movie> getMovie() {
		return movieList;
	}
	
	public void addMovie(String title, double costPerTicket, String durationTime, String description) {
		movieList.add(new Movie(title, costPerTicket, durationTime, description));
		DataWriter.saveMovie();
	}
}
