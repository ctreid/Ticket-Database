import java.util.ArrayList;

public class Plays {
	private static Plays plays = null;
	private static ArrayList<Play> playList = new ArrayList<Play>();
	
	private Plays() {
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
	
	public void addPlay(String title /*to do*/) {
		//to do
	}
}
