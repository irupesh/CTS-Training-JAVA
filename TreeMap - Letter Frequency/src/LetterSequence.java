import java.util.Map;
import java.util.TreeMap;

public class LetterSequence {
	
	private String sentence;
	
	public LetterSequence(String sentence) {
		super();
		this.sentence = sentence;
	}

	public TreeMap<Character,Integer> computeFrequency(){
		TreeMap<Character,Integer> result = new TreeMap<Character,Integer>();
		
		for(int i=0;i<sentence.length();i++){
			if(sentence.charAt(i)==' ')
				continue;
			if(result.containsKey(sentence.charAt(i)))
				result.put(sentence.charAt(i), result.get(sentence.charAt(i))+1);
			else
				result.put(sentence.charAt(i), 1);	
		}
		return result;
	}
	
	public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap){
		for(Map.Entry<Character,Integer> entry:frequencyMap.entrySet()){    
	        char key=entry.getKey();  
	        int count=entry.getValue();  
	        System.out.print(key+" : ");
			for(int i=0;i<count;i++)
				System.out.print("*");
			System.out.print("\n"); 
	    }  
	}

	public String getSentence() {
		return sentence;
	}

	public void setSentence(String sentence) {
		this.sentence = sentence;
	}

}
