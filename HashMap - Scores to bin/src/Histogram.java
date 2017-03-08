import java.util.HashMap;

public class Histogram {
	private HashMap<Integer,Integer> bins;
	
	public Histogram() {
		bins = new HashMap<Integer,Integer>();
		bins.put(10, 0);
		bins.put(20, 0);
		bins.put(30, 0);
		bins.put(40, 0);
	}
	
	public void addScore(Integer in){
		if(in>=0 && in<=10){
			int count = bins.get(10);
			bins.put(10, count+1);
		}
		if(in>10 && in<=20){
			int count = bins.get(20);
			bins.put(20, count+1);
		}
		if(in>20 && in<=30){
			int count = bins.get(30);
			bins.put(30, count+1);
		}else  if(in>30 && in<=40){
				int count = bins.get(40);
				bins.put(40, count+1);
		}
		
	}
	
	void displayHistogram(){
		System.out.println("Histogram");
		for(int i=1;i<=4;i++){
			int count = bins.get(i*10);
			System.out.print((i*10)+" : ");
			for(int j=0;j<count;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		
	}
	
}
