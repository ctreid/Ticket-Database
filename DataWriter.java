
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
		public static JSONObject getPersonJSON(Movie movies) {
			JSONObject movieDetails = new JSONObject();
			movieDetails.put(MOVIE_TITLE, movies.getTitle());
			movieDetails.put(MOVIE_COST_PER_TICKET movies.getCostPerTicket());
			movieDetails.put(MOVIE_DURATION_TIME, movies.getDurationTime());
	        return movieDetails;
		}
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
		public static JSONObject getPersonJSON(Movie movies) {
			JSONObject movieDetails = new JSONObject();
			movieDetails.put(MOVIE_TITLE, movies.getTitle());
			movieDetails.put(MOVIE_COST_PER_TICKET movies.getCostPerTicket());
			movieDetails.put(MOVIE_DURATION_TIME, movies.getDurationTime());
	        return movieDetails;
		}
	}

