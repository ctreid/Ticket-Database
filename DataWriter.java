
	import java.io.FileWriter;
	import java.io.IOException;
	import java.util.ArrayList;
	import org.json.simple.JSONArray;
	import org.json.simple.JSONObject;
	public class DataWriter extends DataConstant {
		public static void saveMovie() {
			Movie movie= movie.getInstance();
			JSONArray jsonMovie = new JSONArray();
			
			for(int i = 0; i < movie.size(); i++) {
				jsonMovie.add(getMovieJSON(movie.get(i)));
			}
			
	        try (FileWriter file = new FileWriter(MOVIE_FILE_NAME)) {
	            file.write(jsonMovie.toJSONString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		public static JSONObject getMovieJSON(Movie movies) {
			JSONObject movieDetails = new JSONObject();
			movieDetails.put(MOVIE_TITLE, movies.getTitle());
			movieDetails.put(MOVIE_COST_PER_TICKET, movies.getCostperTicket());
			movieDetails.put(MOVIE_DURATION_TIME, movies.getDurationTime());
			movieDetails.put(MOVIE_DESCRIPTION,movies.getDescription());
	        return movieDetails;
		}
		public static void saveUser() {
			User user= user.getInstance();
			JSONArray jsonUser = new JSONArray();
			
			for(int i = 0; i < user.size(); i++) {
				jsonUser.add(getUserJSON(user.get(i)));
			}
			
	        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
	            file.write(jsonUser.toJSONString());
	            file.flush();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		}
		public static JSONObject getUserJSON(User users) {
			JSONObject userDetails = new JSONObject();
			userDetails.put(USER_USERNAME, users.getuserName());
			userDetails.put(USER_PASSWORD, users.getPassword());
	        return userDetails;
		}
		
		public static void saveTheater() {
			Theater theater= theater.getInstance();
			JSONArray jsonTheater = new JSONArray();
			
			for(int i = 0; i < theater.size(); i++) {
				jsonTheater.add(getTheaterJSON(theater.get(i)));
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
			theaterDetails.put(USER_USERNAME, theater.getName());
			theaterDetails.put(USER_PASSWORD, theater.getLocation());
	        return theaterDetails;
		}
		
		public static void savePlay() {
			Plays play = play.getInstance();
			JSONArray jsonPlay = new JSONArray();
			for (int i = 0; i < play.size(); i++) {
				jsonPlay.add(getPlayJSON(play.get(i)));
			}

			try(FileWriter file = new FileWriter(PLAY_FILE_NAME)){
				file.write(jsonPlay.toJSONString())
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
	}
