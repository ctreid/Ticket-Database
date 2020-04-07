import java.util.ArrayList;
import java.util.Scanner;

public class MovieInterface {
	private Scanner scanner;
	
	public MovieInterface() {
		scanner = new Scanner (System.in);
	}
	
	public void movie() {
		Movies movie = Movies.getInstance();
		
		System.out.println("******Your Movie Ticket******");
		displayMovie();
		
		while(addMovie()) {
			String movieTitle = getField("Movie Title");
			String movieCostPerTicket = getField("Movie Ticket Cost");
			String movieDurationTime = getField("Movie Duration");
			String movieDescription = getField("Movie Description");
			
			movie.addMovie(movieTitle, movieCostPerTicket, movieDurationTime, movieDescription);
		}
		
		System.out.println("******Your updated movie list******");
		displayMovie();
		
		System.out.println("\nHave a good day!");
	}
	
	public String getField(String prompt) {
		System.out.print(prompt + " : ");
		return scanner.nextLine();
	}
	
	public boolean addMovie() {
		System.out.print("Would you like to add a movie? (Y or N): ");
		
		String input = scanner.nextLine();
		
		if(input.toLowerCase().trim().equals("y"))return true;
		return false;
	}
	public void displayMovie() {
		Movies movie = Movies.getInstance();
		ArrayList<Movie> films = movie.getMovie();
		
		for(Movie m : films) {
			System.out.println(m.getTitle() + " " + m.getCostPerTicket() + " " + 
					m.getDurationTime() + " " +  m.getDescription());
		}
	}
}
