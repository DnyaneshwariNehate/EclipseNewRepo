package assign;

import java.util.Objects;

public class DoublyLinkedListExample {
	public static void main(String[] args) {
		MySong ms1 = new MySong("My Heart Will Go On","Titanic","Celine D",1997);
		MySong ms2 = new MySong("Zhingat","Sairat","Ajay Atul",2016);
		MySong ms3 = new MySong("Tanhayee","Dil Chahta Hai","Sonu Nigam",2001);
		MySong ms4 = new MySong("Tadipar","Tadipar","MC",2020);
		MySong ms5 = new MySong("Just do it","CDAC YCP","MySelf",2022);

		DoublyLinkedList dllList = new DoublyLinkedList();
//		dllList.showAllSongs();
		
		dllList.addSong(ms1);
		dllList.addSong(ms2);
		dllList.addSong(ms3);
		dllList.addSong(ms4);
		dllList.addSong(ms5);
		
		dllList.addAtBegining(ms4);
		dllList.showAllSongs();
//		dllList.removeSong(ms3);
//		dllList.insertSongBefore("Besabriyaan", ms5);
	}
}

class MySong
{
	//data part
	String title;
	String album;
	String artist;
	int year;
	
	//link part
	MySong prev;
	MySong next;
	public MySong(String title, String album, String artist, int year) {
		super();
		this.title = title;
		this.album = album;
		this.artist = artist;
		this.year = year;
	}
	@Override
	public String toString() {
		return "MySong [title=" + title + ", album=" + album + ", artist=" + artist + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(album, artist, next, prev, title, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MySong other = (MySong) obj;
		return Objects.equals(album, other.album) && Objects.equals(artist, other.artist)
				&& Objects.equals(next, other.next) && Objects.equals(prev, other.prev)
				&& Objects.equals(title, other.title) && year == other.year;
	}
	
}
class DoublyLinkedList
{
	MySong start = null, ptr,temp;
	
	void addSong(MySong newSong) {
		
		if(start==null) {
			System.out.println("Juke box is empty....");
			start = newSong;
			start.prev = null;
			start.next = null;
			System.out.println("ADDED the FIRST Song.....");
		}
		else if (start.next == null ){
			start.next = newSong;
			newSong.prev = start;
			newSong.next = null;
			System.out.println("ADDED the SECOND Song.....");

		}
		else {
			
			ptr = start.next; // 200
			
			while(ptr.next!=null) { // 200!=null
				ptr=ptr.next;
			}
			
			ptr.next = newSong;
			newSong.prev = ptr;
			newSong.next = null;
			System.out.println("ADDED the INTERNAL Song.....");
		}
	}
	
	void showAllSongs() {
		if(start==null) {
			System.out.println("Juke box is empty....");
		}
		else {
			
			ptr = start;
			
			while(ptr!=null) {
				System.out.println("DATA : "+ptr);
				System.out.println("------------------");
				ptr=ptr.next;
			}
		}
	}
	void addAtBegining(MySong newSong) {
		ptr = start.next;
		if (start != null) {
			System.out.println("This Song is added at the beginning of the existing list of Songs...");
			newSong.prev = null;
			newSong.next = ptr.prev;
			start = newSong;
			// size++;
		} else {
			System.out.println("This is Now the first Song.......");
			start = newSong;
			// size++;
		}
	}
	
//	void insertSongBefore(String Song, MySong newSong) {
//
//		boolean found = false;
//
//		if (start == null) {
//			System.out.println("List is empty...cannot add this object...");
//		} else if (start.title.equals(Song)) {
//			addAtBegining(newSong);
//		} else {
//			ptr = start; // 100
//			while (ptr != null) {
//				if (ptr.title.equals(Song)) {
//					found = true;
//
//					break;
//				}
//				temp = ptr;
//				ptr = ptr.next;
//			}
//			if (found == true) {
//				temp.next = newSong;
//				newSong.next = ptr;
//				// size++;
//				System.out.println("Object INSERTED before....." + Song);
//			} else {
//				System.out.println("Object not found ...." + Song);
//			}
//		}
//
//	}

//	void insertSongAfter(String song, MySong newSong) { 
//
//		boolean found = false;
//
//		if (start == null) {
//			System.out.println("List is empty...cannot add this object...");
//		} else if (start.title.equals(song)) {
//			addAtBegining(newSong);
//		} else {
//			ptr = start; // 100
//			while (ptr != null) {
//				if (ptr.title.equals(song)) {
//					found = true;
//
//					break;
//				}
//				temp = ptr;
//				ptr = ptr.next;
//			}
//			if (found == true) {
//				ptr.next = newSong;
//				newSong.prev = temp.next;
//				// size++;
//				System.out.println("Object INSERTED After....." + song);
//			} else {
//				System.out.println("Object not found ...." + newSong);
//			}
//		}
//
//	}
	
//	void removeSong(MySong deleteSong)
//	{
//		boolean found=false;
//		
//		if(start==null) 
//			System.out.println("List is empty..nothing to search");
//		else 
//		{
//			System.out.println("Searching...");
//			ptr = start;
//			while(ptr!=null) 
//			{
//				if(ptr.equals(deleteSong)) 
//				{
//					System.out.println("Song found : "+ptr);
//					deleteSong.prev = ptr.next;
//					found=true;
//					System.out.println("Song : " +deleteSong +" is deleted successfully");
//					break;
//				}
//				deleteSong.prev = ptr;
//				ptr=ptr.next;
//				
//			}
//						
//			if(found!=true) 
//			{
//				System.out.println("Song not found....");
//			}
//		}
//	}
//
}
