import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;  

public class Main {
	
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		
		Song obj;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the song name");
	    String name = input.nextLine();
		System.out.println("Enter the artist");
		String artist = input.nextLine();
		System.out.println("Enter the duration");
		String duration = input.nextLine();
		
		obj = new Song(name, artist, duration);
		JAXBContext contextObj = JAXBContext.newInstance(Song.class);  
		  
	    Marshaller marshallerObj = contextObj.createMarshaller();  
	    marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	    
	    marshallerObj.marshal(obj, new FileOutputStream("song.xml")); 
	}
	
	
}
