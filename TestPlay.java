
public class TestPlay {
	public static void main (String [] args) {
		Play testPlay = new Play("Test", 10, "Test", "Test");
		String retVal = null;
		double retPrice;
		System.out.println("***********TESTING PLAY CLASS***********");
		
		System.out.println("\nTESTING GET TITLE METHOD:\n-------------------------");
		retVal = testPlay.getTitle();
		if (retVal != null && retVal.equalsIgnoreCase("Test"))
			System.out.println("Title was returned!");
		else
			System.out.println("Title was not returned.");
		
		
		System.out.println("\nTESTING SET TITLE METHOD:\n-------------------------");
		testPlay.setTitle("Lauren");
		if (testPlay.getTitle().equalsIgnoreCase("Lauren"))
			System.out.println("Title was changed succesfully!");
		else
			System.out.println("Title was not changed successfully.");
		
		
		System.out.println("\nTESTING GET COST PER TICKET METHOD:\n-------------------------");
		retPrice = testPlay.getCostPerTicket();
		if (retPrice == 10)
			System.out.println("Cost per ticket was returned!");
		else
			System.out.println("Cost per ticket was not returned.");
		
		
		System.out.println("\nTESTING SET COST PER TICKET METHOD:\n-------------------------");
		testPlay.setCostPerTicket(20);
		if (testPlay.getCostPerTicket() == 20)
			System.out.println("Cost per ticket was changed!");
		else
			System.out.println("Cost per ticket was not changed.");
		
		
		System.out.println("\nTESTING GET DESCRIPTION METHOD:\n-------------------------");
		retVal = testPlay.getDescription();
		if (retVal != null && retVal.equalsIgnoreCase("Test"))
			System.out.println("Description was returned!");
		else
			System.out.println("Description was not returned.");
		
		
		
		System.out.println("\nTESTING SET TITLE METHOD:\n-------------------------");
		testPlay.setDescription("Lauren");
		if (testPlay.getDescription().equalsIgnoreCase("Lauren"))
			System.out.println("Description was changed succesfully!");
		else
			System.out.println("Description was not changed successfully.");
		
		
		
		System.out.println("\nTESTING GET SHOW TIMES METHOD:\n-------------------------");
		retVal = testPlay.getShowTimes();
		if (retVal != null && retVal.equalsIgnoreCase("Test"))
			System.out.println("Show Times were returned!");
		else
			System.out.println("Show Times were not returned.");
		
		
		
		System.out.println("\nTESTING SET SHOW TIMES METHOD:\n-------------------------");
		testPlay.setShowTimes("Lauren");
		if (testPlay.getShowTimes().equalsIgnoreCase("Lauren"))
			System.out.println("Show Times were changed succesfully!");
		else
			System.out.println("Show Times were not changed successfully.");
	}
}
