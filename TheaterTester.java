
public class TheaterTester {

	public static void main(String[] args) {
		Theater theater = new Theater();
		String retValue = null;
		
		System.out.println("***********TESTING MOVIE CLASS***********");
		
		System.out.println("\nTESTING SET LOCATION METHOD:\n-------------------------");
		theater.setLocation("Test");
		if(theater.getLocation().equalsIgnoreCase("Test")) {
			System.out.println("Location was changed!");
		}
		else {
			System.out.println("Location was not changed");
		}
		
		System.out.println("\nTESTING GET LOCATION METHOD:\n-------------------------");
		retValue = theater.getLocation();
		if(retValue != null && retValue.equalsIgnoreCase("Test")) {
			System.out.println("Location was returned");
		}
		else {
			System.out.println("Location was not returned");
		}
		
		System.out.println("\nTESTING SET NAME METHOD:\n-------------------------");
		theater.setName("Test");
		if(theater.getName().equalsIgnoreCase("Test")) {
			System.out.println("Name was changed!");
		}
		else {
			System.out.println("Name was not changed");
		}
		
		System.out.println("\nTESTING GET NAME METHOD:\n-------------------------");
		retValue = theater.getName();
		if(retValue != null && retValue.equalsIgnoreCase("Test")) {
			System.out.println("Name was returned");
		}
		else {
			System.out.println("Namw was not returned");
		}
	}

}
