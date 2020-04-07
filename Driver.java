import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
	
	
	public static void text() {
		Scanner scanner;
		scanner = new Scanner (System.in);
		String choice = null;
		UserInterface us = new UserInterface(choice);
		MovieInterface m = new MovieInterface();
		Movies mov = new Movies();
		Movie movie = new Movie();
		
		System.out.println("Welcome to the Ticket Database!" + 
				"\nAre you a New User (N), Returning User (R), Guest User (G), or Employee (E)?");
		String user = scanner.next();
		if (user.equals("N")) {
			us.setUserChoice("N");
			us.newUser();
		}
		else if (user.equals("R")) {
			us.setUserChoice("R");
			us.returningUser();
		}
		else if (user.equals("G")) {
			us.setUserChoice("G");
			us.guestUser();
		}
		else if (user.equals("E")) {
			us.setUserChoice("E");
			us.employeeUser();
		}
		else {
			System.out.println("Please enter a valid option");
		}
		
		us.displayUser();
		
		System.out.println("Would you like to buy tickets to a "+
				"\n1. Movie \n2. Play \n3. Concert");
		int type = scanner.nextInt();
		
		if (type == 1) {
			System.out.println("You have selected movie");
			if (us.getUserChoice().equals("E")) {
					m.addMovie();
			}
			else {
				System.out.println("Here are the current movies: ");
				ArrayList<Movie> movies = mov.getMovie();
				for (int i = 0; i < movies.size(); i++) {
					System.out.println((i + 1) + ". " + movies.get(i).getTitle());
				}
				
				System.out.println("Which movie would you like to see?");
				int movieNum = scanner.nextInt();
				movieNum = movieNum - 1;
				System.out.println();
				System.out.println("You have selected: " + movies.get(movieNum).getTitle() + "\n");
				System.out.println("Title: " + movies.get(movieNum).getTitle() + "\nCost Per Ticket: " + movies.get(movieNum).getCostPerTicket() + "\nDuration Time: " + 
						movies.get(movieNum).getDurationTime() + "\nDescription: " + movies.get(movieNum).getDescription());
				System.out.println("\nHow many tickets would you like to buy for " + movies.get(movieNum).getTitle());
				int numTickets = scanner.nextInt();
				
				if (numTickets <= 0) {
					System.out.println("Please enter a valid number of tickets: ");
					numTickets = scanner.nextInt();
				}
				
				System.out.println("Would you like to select your seats? Y or N");
				String ticketAnswer = scanner.next();
				
				if (ticketAnswer.equals("Y")) {
					movie.displaySeats();
					String seatSelection[];
					seatSelection = new String[numTickets];
					
					for (int i = 0; i < numTickets; i++) {
						System.out.println("Enter seat selection " + (i+1) + "(capitalization matters): ");
						String seat = scanner.next();
						seatSelection[i] = seat;
					}
					
					System.out.println("Your seats are: " + seatSelection);
				}
				
				else {
					System.out.println("Please pick out your seat when you arrive to the theater.");
				}
				
			}
	
		}
		
		else if (type == 2) {
			System.out.println("You have selected play");
			if (us.getUserChoice().equals("E")) {
				System.out.println("Would you like to add a play? Y/N: ");
				String employeeAdd = scanner.nextLine();
				if (employeeAdd.equals("Y")) {
					//add a play
				}
			}
			else {
				System.out.println("Here are the current plays: ");
				//display the plays
			}
		}
		
		else if (type == 3) {
			System.out.println("Feature coming soon");
		}
	}
	
	public static void main (String [] args) {
		text();
		
		
		
	}
	
}
