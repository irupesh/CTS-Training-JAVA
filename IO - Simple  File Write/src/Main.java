import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		File file = new File("player.csv");
		OutputStream os = new FileOutputStream(file);

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the name of the player");
		String name = input.nextLine();
		System.out.println("Enter the team name");
		String team = input.nextLine();
		System.out.println("Enter the number of matches played");
		int played = input.nextInt();
		
		String content = name+","+team+","+played;
		byte[] contentInBytes = content.getBytes();
		
		os.write(contentInBytes);
		os.flush();
		os.close();
		input.close();

	}

}
