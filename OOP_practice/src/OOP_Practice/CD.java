package OOP_Practice;

public class CD {

	private String title;
	private String artist;
	private int numofTracks;
	private int playingTime;
	private boolean gotIt = false;
	private String comment;
	
	public CD(String title, String artist, int numofTracks, int playingTime,
			String comment) {
		super();
		this.title = title;
		this.artist = artist;
		this.numofTracks = numofTracks;
		this.playingTime = playingTime;
		this.comment = comment;
	}
	
	public CD() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void print() {
		// TODO Auto-generated method stub
		System.out.println(title + ": " + artist);
	}

}
