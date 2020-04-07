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
		Play play = new Play();
		Plays plays = new Plays();
		
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
		
		System.out.println("Would you like to view: "+
				"\n1. Movie \n2. Play \n3. Concert");
		int type = scanner.nextInt();
		
		if (type == 1) {
			System.out.println("You have selected movie");
			if (us.getUserChoice().equals("E")) {
				
				System.out.println("Adding movie information...");
				System.out.println("Please enter the movie title: ");
				String title = scanner.nextLine();
				scanner.nextLine();
				System.out.println("Please enter the cost per ticket: ");
				double costPerTicket = scanner.nextDouble();
				System.out.println("Please enter the length of the movie: ");
				String durationTime = scanner.next();
				System.out.println("Please enter the movies description: ");
				String description = scanner.nextLine();
				scanner.nextLine();
				
				mov.addMovie(title, costPerTicket, durationTime, description);
				
				System.out.println("Thank you");
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
				
				double price = numTickets * movies.get(movieNum).getCostPerTicket();
				
				System.out.println("Would you like to select your seats? Y or N");
				String ticketAnswer = scanner.next();
				
				String seatSelection[];
				seatSelection = new String[numTickets];
				
				if (ticketAnswer.equals("Y")) {
					movie.displaySeats();
					
					for (int i = 0; i < numTickets; i++) {
						System.out.println("Enter seat selection " + (i+1) + "(capitalization matters): ");
						seatSelection[i] = scanner.next();
					}
					
					System.out.println("Your seats are: ");
					for(int i = 0; i < numTickets; i++) {
						System.out.print(seatSelection[i] + " ");
					}
				}
				
				else {
					System.out.println("Please pick out your seat when you arrive to the theater.");
				}
				
				System.out.println();
				printMovieTicket(movies.get(movieNum).getTitle(), seatSelection, movies.get(movieNum).getDurationTime() , price);
				System.out.println();
				
				System.out.println();
				
				System.out.println("\nThank you for using Ticket Database! We hope you enjoyed your movie! \nWould you like to leave a review? Y or N: ");
				String reviewChoice = scanner.next();
				if (reviewChoice.equals("Y")) {
					System.out.println("Please enter your review: ");
					String review = scanner.next();
					movie.setReviews(review);
					System.out.println("Please enter your rating (in *****): ");
					String rating = scanner.nextLine();
					scanner.nextLine();
					movie.setRatings(rating);
					System.out.println("Have a good day!");
				}
				else {
					System.out.println("Have a good day!");
				}
				
			}
	
		}
		
		else if (type == 2) {
			System.out.println("You have selected play");
			if (us.getUserChoice().equals("E")) {
				System.out.println("Would you like to add a play? Y/N: ");
				String employeeAdd = scanner.next();
				//scanner.nextLine();
				if (employeeAdd.equals("Y")) {
					System.out.println("Adding play information...");
					System.out.println("Please enter the play title: ");
					String playTitle = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Please enter the cost per ticket: ");
					double costPerTicket = scanner.nextDouble();
					System.out.println("Please enter the plays description: ");
					String description = scanner.nextLine();
					scanner.nextLine();
					System.out.println("Please enter the show times: ");
					String showTimes = scanner.nextLine();
					
					plays.addPlay(playTitle, costPerTicket, description, showTimes);
					
					
					System.out.println("Thank you");
					
					
					System.out.println(plays.getPlay());
					
				}
			}
			
			else {
				System.out.println("Here are the current plays: ");
				ArrayList<Play> p = plays.getPlay();
				for (int i = 0; i < p.size(); i++) {
					System.out.println((i + 1) + ". " + p.get(i).getTitle());
				}
			}
		}
		
		else if (type == 3) {
			System.out.println("Feature coming soon");
		}
		
		else {
			System.out.println("Please enter 1, 2, or 3: ");
			type = scanner.nextInt();
		}
	}
	
	public static void afterMovie() {
		System.out.println("Thank you for choosing Ticket Database! Would you like to leave a review?");
	}
	
	public static void printMovieTicket(String movie, String[] seats, String duration, double price) {
		System.out.println();
		System.out.println("******************************");
		System.out.println("* Movie: " + movie);
		System.out.print("* Seats: ");
		for (int i = 0; i < seats.length; i++) {
			System.out.print(seats[i] + " ");
		}
		System.out.println();
		System.out.println("* Movie Length: " + duration);
		System.out.println("* Price: $" + price);
		System.out.println("******************************");
		System.out.println();
	}
	
	
	
	public static void main (String [] args) {
		text();
		
	}
	
}
