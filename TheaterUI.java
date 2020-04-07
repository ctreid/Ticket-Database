package project;

import java.util.Scanner;

public class TheaterUI {
	private static final String WELCOME_MESSAGE = "Welcome to our Theater";
	private String[] mainMenuOptions = {"Find Movie","Checkout Movie","Rate a Movie","Pay a Fine","Logout"};
	private Scanner scanner;
	private Theater theater;
	
	TheaterUI(){
		scanner = new Scanner(System.in);
		theater = new Theater();
	}
	
	public void run() {
		System.out.println(WELCOME_MESSAGE);
		
		//Loop as long as we want to keep interacting with the theater
		while(true) {
			displayMainMenu();
			
			int userCommand = getUserCommand(mainMenuOptions.length);
			
			if(userCommand == -1) {
				System.out.println("Not a valid command");
				continue;
			}
			
			//if they picked the last option then log them out
			if(userCommand == mainMenuOptions.length -1) break;
		
			switch(userCommand) {
				case(0):
					findMovie();
					break;
				case(1):
					checkoutMovie();
					break;
				case(2):
					rateMovie();
					break;
				case(3):
					payFine();
					break;
			}
		}
		
		System.out.println("Good bye, and have a nice day");
		
	}
	
	private void displayMainMenu() {
		System.out.println("\n************ Main Menu *************");
		for(int i=0; i< mainMenuOptions.length; i++) {
			System.out.println((i+1) + ". " + mainMenuOptions[i]);
		}
		System.out.println("\n");
	}
	
	//get the users command number, if it's not valid, return -1
	private int getUserCommand(int numCommands) {
		System.out.print("What would you like to do?: ");
		
		String input = scanner.nextLine();
		int command = Integer.parseInt(input) - 1;
		
		if(command >= 0 && command <= numCommands -1) return command;
		
		return -1;
	}
	
	private void findMovie() {
		System.out.println("\n-----Searching the theater-----");
		String movie = getUserMovie();
		
		if(movie == null)return;
		
		if(!theater.findMovie(movie)) {
			System.out.println("Sorry we couldn't find your movie\n");
			return;
		}
		
		System.out.println("YAY your moovie is in the theater\n");		
	}
	
	private void checkoutMovie() {
		System.out.println("\n-----Checking out a movie-----");
		String movie = getUserMovie();
		
		if(movie == null)return;
		
		if(!theater.checkout(movie)) {
			System.out.println("Sorry we couldn't checkout your movie\n");
			return;
		}
		System.out.println("Your movie was successfully checked out\n");
	}
	
	private void rateMovie() {
		System.out.println("\n-----Searching the Theater-----");
		String movie = getUserMovie();
		
		if(movie == null)return;
		
		//get rating
		System.out.print("Enter rating: ");
		int rating = Integer.parseInt(scanner.nextLine());
		
		if(rating < 0 || rating > 5) {
			System.out.println("Not a valid rating\n");
			return;
		}
		
		if(!theater.rateMovie(movie, rating)) {
			System.out.println("Sorry we couldn't rate your item\n");
			return;
		}
		
		System.out.println("Item was successfully rated\n");
	}
	
	private void payFine() {
		System.out.println("-----Paying a fine-----");
		
		//get amount
		System.out.print("Enter amount: ");
		int amount = Integer.parseInt(scanner.nextLine());
		
		if(amount < 0) {
			System.out.println("Not a valid amount\n");
			return;
		}
		
		if(!theater.payFine(amount)) {
			System.out.println("Sorry, you were not able to pay this fine.\n");
			return;
		}
		
		System.out.println("Fine paid\n");
	}
	
	private String getUserMovie() {
		System.out.print("Enter Movie Name: ");
		
		while(true) {
			String movieName = scanner.nextLine().trim().toLowerCase();
		
			if(!movieName.contentEquals("")) return movieName;
			
			System.out.println("You need to actually enter content");
			System.out.print("Would you like to enter a movie again (y) or return to main menu (n): ");
			String command = scanner.nextLine().trim().toLowerCase();
			if(command == "n") return null;
		}
	}
	
	
	public static void main(String[] args) {
		TheaterUI theaterInterface = new TheaterUI();
		theaterInterface.run();

	}

}
