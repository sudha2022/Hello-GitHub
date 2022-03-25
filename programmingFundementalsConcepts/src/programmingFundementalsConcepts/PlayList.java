package programmingFundementalsConcepts;
import java.util.ArrayList;

public class PlayList {
private static final Song[] splayList = null;
//   Attributes
	static  String name;
	static  ArrayList<Song> splaylist=new  ArrayList<Song>();
	
		//Methods
	//1.PrintAllSongs();
	public static void PrintAllSongs() {
		 //1. printAllSongs() 
		 for(Song song : splaylist) {
		 System.out.println("Each Song in playlist : " + song.getTitle());
		 }
		 }


		 // 2. findSong(String song)
		 public static boolean findSong(String song_name) {
		 boolean returnValue = false;
		 for(Song song : splayList) {
		 String temp_name = song.getTitle();
		 if (temp_name.equalsIgnoreCase(song_name)) {
		 returnValue = true;
		 break;
		 }
		 }
		 return returnValue;
		 }

		 
		
	}
	


