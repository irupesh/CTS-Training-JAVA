import java.util.ArrayList;
import java.util.List;

public class Scores extends Thread {
	String scoreType;
	int start;
	int end; 
	List<Integer> scoreList;
	public Scores(String scoreType, int start, int end) {
		super();
		scoreList = new ArrayList<Integer>();
		this.scoreType = scoreType;
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run(){
		int intial=start;
		if(scoreType.equals("EVEN")){
			if(start%2==0)
				intial = start;
			else
				intial = start+1;
		}
		else if(scoreType.equals("ODD")){
			if(start%2!=0)
				intial = start;
			else
				intial = start+1;
		}
		
		while(intial<=end){
			scoreList.add(intial);
			intial +=2;
		}
	}
	
	void display(){
		for(Integer score : scoreList)
		    System.out.print(score+" ");
	}
	
	
	

}
