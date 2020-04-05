
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;;

public class DataLoader extends DataConstant{

	public static ArrayList<User> loadUser() {
		ArrayList<User> user = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < userJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)userJSON.get(i);
				String userName  = (String)userJSON.get(USER_USERNAME);
				String password = (String)userJSON.get(USER_PASSWORD);
				
				user.add(new User(userName, password));
			}
			
			return user;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public static ArrayList<Theater> loadTheater() {
		ArrayList<Theater> theater = new ArrayList<Theater>();
		
		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray theaterJson = (JSONArray)new JSONParser().parse(reader);
		
			for(int i = 0; i < theaterJSON.size(); i++) {
				JSONObject theaterJSON = (JSONObject)theaterJSON.get(i);
				String name  = (String)theaterJSON.get(THEATER_NAME);
				String location = (String)theaterJSON.get(THEATER_LOCATION);
				
				theater.add(new Theater(name,location));
			}
			
			return theater;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return null;
	}
	public static ArrayList<Movie> loadMovie() {
		ArrayList<Movie> movie = new ArrayList<Movie>();
		
		try {
			FileReader reader = new FileReader(MOVIE_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray movieJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < movieJSON.size(); i++) {
				JSONObject movieJSON = (JSONObject)movieJSON1.get(i);
				String title  = (String)movieJSON.get(MOVIE_TITLE);
				int costperTicket = (int)movieJSON.get(MOVIE_COST_PER_TICKET);
				int durationTime  = (int)movieJSON.get(MOVIE_DURATION_TIME);
				String description = (String)movieJSON.get(MOVIE_DESCRIPTION);
				
				movie.add(new Movie(title,costperTicket,durationTime,description));
			}
			
			return movie;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}