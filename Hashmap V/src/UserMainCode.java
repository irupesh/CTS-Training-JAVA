import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class UserMainCode {
	
	static TreeMap<String, Character> calculateGrades(HashMap<String, Integer>map1, HashMap<String, Integer> map2){
		TreeMap<String, Character> result = new TreeMap<String, Character>();
		
		for(Map.Entry<String, Integer> entry:map1.entrySet()){
			Character grade;
			String key = entry.getKey();
			int theoryMarks = entry.getValue();
			int labMarks = map2.get(key);
			
			if(labMarks>80 && theoryMarks>80)
				grade = 'A';
			else if(labMarks>80 || theoryMarks>80)
				grade = 'B';
			else
				grade = 'C';
			
			result.put(key, grade);
		}
		return result;
	}

}
