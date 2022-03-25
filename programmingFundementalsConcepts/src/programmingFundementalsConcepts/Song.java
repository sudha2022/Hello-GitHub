/*This question would involve following basic OOP principles and coding principles like single-responsibility, 
 * DRY and YAGNI principles. Each entity will be created in it's own class. main method will be i
 * n a seperate class and that'll be the one interacting with the user
 * 
 * 
 * */

package programmingFundementalsConcepts;

public class Song {
	//atttributes
	String title;
	double duration;
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public double getDuration() {
		return duration;
	}


	public void setDuration(double duration) {
		this.duration = duration;
	}


	public Song(String title, double duration) {
		super();
		this.title = title;
		this.duration = duration;
	}

	
	public static void main(String[] args) {
		
		
	}

}
