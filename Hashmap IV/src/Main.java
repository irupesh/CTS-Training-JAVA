import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	HashMap<Integer, String > map1 = new HashMap<Integer, String >();
	HashMap<Integer, Integer > map2 = new HashMap<Integer, Integer >();
	int number = input.nextInt();
	
	for(int i=0;i<number;i++){
		int id = input.nextInt();
		input.nextLine();
		String cls = input.nextLine();
		int marks = input.nextInt();
		map1.put(id, cls);
		map2.put(id, marks);
	}
	input.close();
	
	HashMap<Integer, Integer > result = UserMainCode.increaseMarks(map1, map2);
	
	for(Map.Entry<Integer, Integer> entry:result.entrySet())  
		System.out.println(entry.getKey()+"\n"+entry.getValue());

}
}
