 
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  

@XmlRootElement 
public class Song {
	String name;
	String artist;
	String duration;
	
	Song(){}
	
	@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@XmlElement
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
	@XmlElement
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Song(String name, String artist, String duration) {
		super();
		this.name = name;
		this.artist = artist;
		this.duration = duration;
	}

}
