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
			//JSONParser parser = new JSONParser();
			JSONArray userJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < userJSON.size(); i++) {
				JSONObject userJson = (JSONObject)userJSON.get(i);
				String userName  = (String)userJson.get(USER_NAME);
				String password = (String)userJson.get(USER_PASSWORD);
				
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
			//JSONParser parser = new JSONParser();
			JSONArray theaterJson = (JSONArray)new JSONParser().parse(reader);
		
			for(int i = 0; i < theaterJson.size(); i++) {
				JSONObject theaterJSON = (JSONObject)theaterJson.get(i);
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
			//JSONParser parser = new JSONParser();
			JSONArray movies = (JSONArray)new JSONParser().parse(reader);
			
			for(int i = 0; i < movies.size(); i++) {
				JSONObject movieJson = (JSONObject)movies.get(i);
				String title  = (String)movieJson.get(MOVIE_TITLE);
				double costPerTicket = (double)movieJson.get(MOVIE_COST_PER_TICKET);
				String durationTime  = (String)movieJson.get(MOVIE_DURATION_TIME);
				String description = (String)movieJson.get(MOVIE_DESCRIPTION);
				
				movie.add(new Movie(title,costPerTicket,durationTime,description));
			}
			
			return movie;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static ArrayList<Play> loadPlay() {
		ArrayList<Play> play = new ArrayList<Play>();
		try {
			FileReader reader = new FileReader(PLAY_FILE_NAME);
			//JSONParser parser = new JSONParser();
			JSONArray plays = (JSONArray)new JSONParser().parse(reader);
			
			for (int i = 0; i < plays.size(); i++) {
				JSONObject playJson = (JSONObject)plays.get(i);
				String playTitle = (String)playJson.get(PLAY_TITLE);
				double costPerTicket = (double)playJson.get(PLAY_COST_PER_TICKET);
				String description = (String)playJson.get(PLAY_DESCRIPTION);
				String showTimes = (String)playJson.get(SHOW_TIMES);
				
				play.add(new Play(playTitle, costPerTicket, description, showTimes));
			}
			return play;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}








