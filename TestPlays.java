import java.util.ArrayList;

public class TestPlays {
	public static void main (String [] args) {
		Plays testPlays = new Plays();
		System.out.println("***********TESTING PLAYS CLASS***********");
		
		System.out.println("\nTESTING GET INSTANCE METHOD:\n-------------------------");
		Plays retPlays;
		retPlays = testPlays.getInstance();
		if (retPlays != null)
			System.out.println("Plays were returned!");
		else
			System.out.println("Plays were not returned.");
		
		System.out.println("\nTESTING GET PLAY METHOD:\n-------------------------");
		ArrayList<Play> retList;
		retList = testPlays.getPlay();
		if (retList != null)
			System.out.println("A list was returned!");
		else
			System.out.println("A list was not returned.");
		
		System.out.println("\nTESTING ADD PLAY METHOD:\n-------------------------");
		Play tmpPlay = new Play("Test", 0, "Test", "Test");
		testPlays.addPlay("Test", 0, "Test", "Test");
		Play compareVal;
		boolean found = false;
		for (int i = 0; i < testPlays.playList.size(); i++) {
			compareVal = testPlays.playList.get(i);
			if (compareVal.getTitle().equalsIgnoreCase(tmpPlay.getTitle()))
				found = true;
		}
		if (found)
			System.out.println("Play was added!");
		else
			System.out.println("Play was not added.");	
	}
}
