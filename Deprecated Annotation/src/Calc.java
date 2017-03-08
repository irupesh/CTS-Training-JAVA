
public class Calc {
	
	@Deprecated
	int quare(int number){
		return number *number;
	};
	int exponential(int base, int power){
		int result=1;
		for(int i=0;i<power;i++)
			result = result * base;
		return result;
	};
}
