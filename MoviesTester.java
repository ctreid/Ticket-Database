import java.util.ArrayList;
public class MoviesTester extends Movies{

	public static void main(String[] args) {
		Movies movies = new Movies();
		System.out.println("***********TESTING MOVIES CLASS***********");
		
		System.out.println("\nTESTING GET INSTANCE METHOD:\n-------------------------");
		Movies retMovies;
		retMovies = MoviesTester.getInstance();
		if(retMovies != null) {
			System.out.println("Movies were returned!");
		}
		else {
			System.out.println("Movies were not returned.");
		}
		
		System.out.println("\nTESTING GET MOVIE METHOD:\n-------------------------");
		ArrayList<Movie>retList;
		retList = MoviesTester.getMovie();
		if(retList != null) {
			System.out.println("A list was returned!");
		}
		else {
			System.out.println("A list was not returned.");
		}
		
		System.out.println("\nTESTING ADD MOVIE METHOD:\n-------------------------");
		Movie tempMovie = new Movie("Test", 0, "Test", "Test");
		MoviesTester.addMovie("Test", 0, "Test", "Test");
		Movie compareValue;
		boolean found = false;
		for(int i = 0; i < MoviesTester.movieList.size(); i++) {
			compareValue = MoviesTester.movieList.get(i);
			if(compareValue.getTitle().equalsIgnoreCase(tempMovie.getTitle())) {
				found = true;
			}
		}
		if(found) {
			System.out.println("Movie was added!");
		}
		else {
			System.out.println("Movie was not added.");
		}
	}

}
