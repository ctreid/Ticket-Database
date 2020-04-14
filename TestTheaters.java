import java.util.ArrayList;

public class TestTheaters {
	public static void main (String [] args) {
		Theaters testTheaters = new Theaters();
		System.out.println("***********TESTING THEATERS CLASS***********");
		
		System.out.println("\nTESTING GET INSTANCE METHOD:\n-------------------------");
		Theaters retTheaters;
		retTheaters = testTheaters.getInstance();
		if (retTheaters != null)
			System.out.println("Theaters were returned!");
		else
			System.out.println("Theaterss were not returned.");
		
		
		System.out.println("\nTESTING GET THEATER METHOD:\n-------------------------");
		ArrayList<Theater> retList;
		retList = testTheaters.getTheater();
		if (retList != null)
			System.out.println("A list was returned!");
		else
			System.out.println("A list was not returned.");
		
		
		System.out.println("\nTESTING ADD THEATER METHOD:\n-------------------------");
		Theater tmpTheater = new Theater("Test", "Test");
		testTheaters.addTheater("Test", "Test");
		Theater compareVal;
		boolean found = false;
		for (int i = 0; i < testTheaters.theaterList.size(); i++) {
			compareVal = testTheaters.theaterList.get(i);
			if (compareVal.getName().equalsIgnoreCase(tmpTheater.getName()))
				found = true;
		}
		if (found)
			System.out.println("Theater was added!");
		else
			System.out.println("Theater was not added.");
	}
}