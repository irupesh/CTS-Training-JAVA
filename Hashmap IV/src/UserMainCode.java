import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UserMainCode {
	
	
	static ArrayList<Integer> getKey(HashMap<Integer, String>map1){
		ArrayList<Integer> keys = new ArrayList<Integer>();
		
		for(Map.Entry<Integer, String> entry:map1.entrySet())   
	        if("BE-CSE".equals(entry.getValue()))
	        	keys.add(entry.getKey());
	    return keys;	
	}
	
	static HashMap<Integer, Integer> increaseMarks(HashMap<Integer, String>map1, HashMap<Integer, Integer> map2){
		HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
		
		ArrayList<Integer> keys = getKey(map1);
		
		for(Integer key : keys)
			result.put(key, map2.get(key)+5);
		
		return result;
	}

}
