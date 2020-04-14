 
public class MovieTester extends Movie{

	public static void main(String[] args) {
		Movie movie = new Movie();
		String retValue = null;
		double retPrice;
		int retNumTickets;
		System.out.println("***********TESTING MOVIE CLASS***********");
		
		System.out.println("\nTESTING SET TITLE METHOD:\n-------------------------");
		movie.setTitle("Test");
		if(movie.getTitle().equalsIgnoreCase("Test")) {
			System.out.println("Title was changed successfully!");
		}
		else {
			System.out.println("Title was not changed successfully");
		}
		
		System.out.println("\nTESTING GET TITLE METHOD:\n-------------------------");
		retValue = movie.getTitle();
		if(retValue != null && retValue.equalsIgnoreCase("Test")) {
			System.out.println("Title was reutrned!");
		}
		else {
			System.out.println("Title was not returned");
		}
		
		System.out.println("\nTESTING SET COST PER TICKET METHOD:\n-------------------------");
		movie.setCostPerTicket(15.50);
		if(movie.getCostPerTicket() == 15.50) {
			System.out.println("Cost per ticket was changed!");
		}
		else {
			System.out.println("Cost per ticket was not changed");
		}
		
		System.out.println("\nTESTING GET COST PER TICKET METHOD:\n-------------------------");
		retPrice = movie.getCostPerTicket();
		if (retPrice == 15.50) {
			System.out.println("Cost per ticket was returned!");
		}
		else {
			System.out.println("Cost per ticket was not returned");
		}
		
		System.out.println("\nTESTING SET DESCRIPTION METHOD:\n-------------------------");
		movie.setDescription("Test");
		if (movie.getDescription().equalsIgnoreCase("Test")) {
			System.out.println("Description was changed successfully");
		}
		else {
			System.out.println("Description was not changed");
		}
		
		System.out.println("\nTESTING GET DESCRIPTION METHOD:\n-------------------------");
		retValue = movie.getDescription();
		if(retValue != null && retValue.equalsIgnoreCase("Test")) {
			System.out.println("Description was returned!");
		}
		else {
			System.out.println("Description was not returned");
		}
		
		System.out.println("\nTESTING SET NUM TICKETS METHOD:\n-------------------------");
		movie.setNumTickets(3);
		if(movie.getNumTickets() == 3) {
			System.out.println("Number of tickets was changed!");
		}
		else {
			System.out.println("Number of tickets was not changed");
		}
		
		System.out.println("\nTESTING GET NUM TICKETS METHOD:\n-------------------------");
		retNumTickets = movie.getNumTickets();
		if(retNumTickets == 3) {
			System.out.println("Number of tickets were returned!");
		}
		else {
			System.out.println("Number of tickets were not returned");
		}
		
		System.out.println("\nTESTING DISPLAY SEATS METHOD:\n-------------------------");
		movie.displaySeats();
		
		System.out.println("\nTESTING SET REVIEWS METHOD:\n-------------------------");
		movie.setReviews("Okay");
		if(movie.getReviews().equalsIgnoreCase("Okay")) {
			System.out.println("The reviews were changed!");
		}
		else {
			System.out.println("The reviews were not changed");
		}
		
		System.out.println("\nTESTING GET REVIEWS METHOD:\n-------------------------");
		retValue = movie.getReviews();
		if(retValue != null && retValue.equalsIgnoreCase("Okay")) {
			System.out.println("Reviews were returned!");
		}
		else {
			System.out.println("Reviews were not returned");
		}
		
		System.out.println("\nTESTING SET RATINGS METHOD:\n-------------------------");
		movie.setRatings("***");
		if(movie.getRatings().equals("***")) {
			System.out.println("Ratings were changed!");
		}
		else {
			System.out.println("Ratings were not changed");
		}
		
		System.out.println("\nTESTING GET RATINGS METHOD:\n-------------------------");
		retValue = movie.getRatings();
		if(retValue != null && retValue.equals("***")) {
			System.out.println("The ratings were returned!");
		}
		else {
			System.out.println("The ratings were not returned");
		}
		
	}

}
