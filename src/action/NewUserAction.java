package action;

import java.util.ArrayList;
import java.util.List;

import pojo.Movie;

import com.opensymphony.xwork2.Action;

public class NewUserAction implements Action {

	private List<Movie> movieList = new ArrayList<Movie>();
	
	public String execute() throws Exception 
	{
		for (Movie m: movieList) {
			System.out.println(m.getName());
			System.out.println(m.getScore());
		}
		return "success";
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

}
