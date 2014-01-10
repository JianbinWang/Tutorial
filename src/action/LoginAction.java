package action;

import java.util.ArrayList;
import java.util.List;

import pojo.Movie;

import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {

	private String userType;
	private List<Movie> movieList;
	
	public String execute() throws Exception 
	{
		System.out.println("userYType: " + userType);
		if (userType.equals("newUser")) {
			movieList = new ArrayList<Movie>();
			movieList.add(new Movie("movie1"));
			movieList.add(new Movie("movie2"));
			movieList.add(new Movie("movie3"));
			movieList.add(new Movie("movie4"));
			movieList.add(new Movie("movie5"));
			return "newUser";
		} else if (userType.equals("oldUser")){
			return "oldUser";
		} else {
			System.out.println("[Waring] userYType: " + userType);
			return "error";
		}
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

}
