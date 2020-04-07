import java.util.ArrayList;

public class Plays {
	private static Plays plays = null;
	public static ArrayList<Play> playList = new ArrayList<Play>();
	
	public Plays() {
		playList = DataLoader.loadPlay();
	}
	
	public static Plays getInstance() {
		if(plays == null) {
			plays = new Plays();
		}
		
		return plays;
	}
	
	public ArrayList<Play> getPlay(){
		return playList;
	}
	
	public void addPlay(String title, double costPerTicket,  String description, String showTimes) {
		playList.add(new Play(title, costPerTicket, description, showTimes));
		DataWriter.savePlay();
	}
}
