
public class TestPlayhouse {
	public static void main (String [] args) {
		Playhouse testPlayHouse = new Playhouse();
		System.out.println("***********TESTING PLAYHOUSE CLASS***********");
		boolean test;
		
		System.out.println("\nTESTING FIND PLAY METHOD:\n-------------------------\nSearching for Romeo and Juliet");
		test = testPlayHouse.findPlay("Romeo and Juliet");
		if (test)
			System.out.println("Play found!\n");
		else 
			System.out.println("Play not found.\n");
		System.out.println("Searching for Romero and Juliet");
		test = testPlayHouse.findPlay("Romero and Juliet");
		if (test)
			System.out.println("Play found!\n");
		else 
			System.out.println("Play not found.\n");
		
		
		System.out.println("\nTESTING CHECKOUT METHOD:\n-------------------------\nChecking out Romeo and Juliet");
		test = testPlayHouse.checkout("Romeo and Juliet");
		if (test)
			System.out.println("Checkout successful!\n");
		else 
			System.out.println("Checkout not successful.\n");
		System.out.println("Checking out Romero and Juliet");
		test = testPlayHouse.checkout("Romero and Juliet");
		if (test)
			System.out.println("Checkout successful!\n");
		else 
			System.out.println("Checkout not successful.\n");
		
		
		System.out.println("\nTESTING RATE PLAY METHOD:\n-------------------------\nRating Romeo and Juliet 5 Stars");
		test = testPlayHouse.ratePlay("Romeo and Juliet", 5);
		if (test)
			System.out.println("Rating was successful!\n");
		else 
			System.out.println("Rating was not successful.\n");
		System.out.println("Rating Romeo and Juliet -5 Stars");
		test = testPlayHouse.ratePlay("Romeo and Juliet", -5);
		if (test)
			System.out.println("Rating was successful!\n");
		else 
			System.out.println("Rating was not successful.\n");
		System.out.println("Rating Romero and Juliet -5 Stars");
		test = testPlayHouse.ratePlay("Romero and Juliet", -5);
		if (test)
			System.out.println("Rating was successful!\n");
		else 
			System.out.println("Rating was not successful.\n");
		System.out.println("Rating Romero and Juliet 5 Stars");
		test = testPlayHouse.ratePlay("Romero and Juliet", 5);
		if (test)
			System.out.println("Rating was successful!\n");
		else 
			System.out.println("Rating was not successful.\n");
		
		
		System.out.println("\nTESTING PAY FINE METHOD:\n-------------------------\nPaying 50 Dollars");
		test = testPlayHouse.payFine(50);
		if (test)
			System.out.println("Payment was successful!\n");
		else 
			System.out.println("Payment was not successful.\n");
		System.out.println("Paying -5 dollars");
		test = testPlayHouse.payFine(-5);
		if (test)
			System.out.println("Payment was successful!\n");
		else 
			System.out.println("Payment was not successful.\n");
		
	}
}
