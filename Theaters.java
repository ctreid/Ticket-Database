import java.util.ArrayList;
public class Theaters {
	private static Theaters theaters = null;
	public static ArrayList<Theater> theaterList = new ArrayList<Theater>();
	
	public Theaters() {
		theaterList = DataLoader.loadTheater();
	}
	
	public static Theaters getInstance() {
		if(theaters == null) {
			theaters = new Theaters();
		}
		
		return theaters;
	}
	public ArrayList<Theater> getTheater() {
		return theaterList;
	}
	
	public void addTheater(String name, String location) {
		theaterList.add(new Theater(name,location));
		DataWriter.saveTheater();
	}
}
