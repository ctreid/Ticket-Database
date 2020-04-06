import java.util.ArrayList;
import java.util.Scanner;

public class TheaterInterface {
	private Scanner scanner;
	
	public TheaterInterface() {
		scanner = new Scanner (System.in);
	}
	
	public void play() {
		Theaters play = Theaters.getInstance();
		
		System.out.println("******Your Movie Ticket******");
		displayMovie();
		
		while(addPlay()) {
			String playTitle = getField("Movie Title");
			String playCostPerTicket = getField("Movie Ticket Cost");
			String playDurationTime = getField("Movie Duration");
			String playDescription = getField("Movie Description");
			
			play.addPlay(playTitle, playCostPerTicket, playDurationTime, playDescription);
		}
		
		System.out.println("******Your updated play list******");
		displayMovie();
		
		System.out.println("\nHave a good day!");
	}
	
	public String getField(String prompt) {
		System.out.print(prompt + " : ");
		return scanner.nextLine();
	}
	
	public boolean addPlay() {
		System.out.print("Would you like to add a play? (Y or N): ");
		
		String input = scanner.nextLine();
		
		if(input.toLowerCase().trim().equals("y"))return true;
		return false;
	}
	public void displayMovie() {
		Theaters play = Theaters.getInstance();
		ArrayList<Movie> films = play.getPlay();
		
		for(Movie m : films) {
			System.out.println(m.getTitle() + " " + m.getCostPerTicket() + " " + 
					m.getDurationTime() + " " +  m.getDescription());
		}
	}
}
