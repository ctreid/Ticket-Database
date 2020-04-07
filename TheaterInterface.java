import java.util.ArrayList;
import java.util.Scanner;

public class TheaterInterface {
	private Scanner scanner;
	
	public TheaterInterface() {
		scanner = new Scanner (System.in);
	}
	
	public void theater() {
		Theaters theater = Theaters.getInstance();
		
		System.out.println("******Your Movie Ticket******");
		displayTheater();
		
		while(addTheater()) {
			String theaterName = getField("Theater Name");
			String theaterLocation = getField("Theater Location");
			
			theater.addTheater(theaterName, theaterLocation);
		}
		
		System.out.println("******Your updated theater list******");
		displayTheater();
		
		System.out.println("\nHave a good day!");
	}
	
	public String getField(String prompt) {
		System.out.print(prompt + " : ");
		return scanner.nextLine();
	}
	
	public boolean addTheater() {
		System.out.print("Would you like to add a theater? (Y or N): ");
		
		String input = scanner.nextLine();
		
		if(input.toLowerCase().trim().equals("y"))return true;
		return false;
	}
	public void displayTheater() {
		Theaters theater = Theaters.getInstance();
		ArrayList<Theater> theaters = theater.getTheater();
		
		for(Theater t : theaters) {
			System.out.println(t.getName() + " " + t.getLocation());
		}
	}
}
