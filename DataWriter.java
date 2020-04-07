import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstant {
	public static void saveMovie() {
		Movies movies = Movies.getInstance();
		JSONArray jsonMovie = new JSONArray();
		ArrayList <Movie> movieList = movies.getMovie();
			
		for(int i = 0; i < movieList.size(); i++) {
			jsonMovie.add(getMovieJSON(movieList.get(i)));
		}
			
	    try (FileWriter file = new FileWriter(MOVIE_FILE_NAME)) {
	        file.write(jsonMovie.toJSONString());
	        file.flush();
	 
	    } catch (IOException e) {
	        e.printStackTrace();
        }
	}
	public static JSONObject getMovieJSON(Movie movie) {
		JSONObject movieDetails = new JSONObject();
		movieDetails.put(MOVIE_TITLE, movie.getTitle());
		movieDetails.put(MOVIE_COST_PER_TICKET, movie.getCostPerTicket());
		movieDetails.put(MOVIE_DURATION_TIME, movie.getDurationTime());
		movieDetails.put(MOVIE_DESCRIPTION, movie.getDescription());
        return movieDetails;
    }
	
	public static void savePlay() {
		Plays plays = Plays.getInstance();
		JSONArray jsonPlay = new JSONArray();
		ArrayList <Play> playList = plays.getPlay();
		for (int i = 0; i < playList.size(); i++) {
			jsonPlay.add(getPlayJSON(playList.get(i)));
		}
		
		try(FileWriter file = new FileWriter(PLAY_FILE_NAME)){
			file.write(jsonPlay.toJSONString());
			file.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static JSONObject getPlayJSON(Play play) {
		JSONObject playDetails = new JSONObject();
		playDetails.put(PLAY_TITLE, play.getTitle());
		playDetails.put(PLAY_COST_PER_TICKET, play.getCostPerTicket());
		playDetails.put(PLAY_DESCRIPTION, play.getDescription());
		return playDetails;
		
	}
	
	public static void saveUser() {
		Users user= Users.getInstance();
		JSONArray jsonUser = new JSONArray();
		ArrayList <User> userList = user.getUser();
		
		for(int i = 0; i < userList.size(); i++) {
			jsonUser.add(getUserJSON(userList.get(i)));
		}
		
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
            file.write(jsonUser.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
	public static JSONObject getUserJSON(User user) {
		JSONObject userDetails = new JSONObject();
		userDetails.put(USER_NAME, user.getUserName());
		userDetails.put(USER_PASSWORD, user.getPassword());
		return userDetails;
	}
	
	public static void saveTheater() {
		Theaters theater= Theaters.getInstance();
		JSONArray jsonTheater = new JSONArray();
		ArrayList <Theater> theaterList = theater.getTheater();
		
		for(int i = 0; i < theaterList.size(); i++) {
			jsonTheater.add(getTheaterJSON(theaterList.get(i)));
		}
		
        try (FileWriter file = new FileWriter(THEATER_FILE_NAME)) {
            file.write(jsonTheater.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static JSONObject getTheaterJSON(Theater theater) {
		JSONObject theaterDetails = new JSONObject();
		theaterDetails.put(THEATER_NAME, theater.getName());
		theaterDetails.put(THEATER_LOCATION, theater.getLocation());
		return theaterDetails;
	}
	
}
