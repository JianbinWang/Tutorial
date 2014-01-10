package pojo;

public class Movie {

	private String name;
	private float score;
	
	public Movie()
	{
		
	}
	
	public Movie(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}

}
