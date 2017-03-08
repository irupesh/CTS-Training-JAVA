import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calculator obj = new Calculator();
		System.out.println("1) addition\n2) subtraction\n3) multiplication\n4) division\n5) sine\n6) cosine\n7) tangent\n8) logarithm");
		
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		String methodName="";
		
		switch(choice){
		   case 1: methodName = "addition";
		    break;
		   case 2: methodName = "subtraction";
		    break;
		   case 3: methodName = "multiplication";
		    break;
		   case 4: methodName = "division";
		    break;
		   case 5: methodName = "sine";
		    break;
		   case 6: methodName = "cosine";
		    break;
		   case 7: methodName = "tangent";
		    break;
		   case 8: methodName = "logarithm";
		    break;
		    default:
		    	System.out.println("No annotation found");
		    	System.exit(0);
		}
		
		try {
			  String str;
			  
		      Method method = obj.getClass().getMethod(methodName);
		      if(method.isAnnotationPresent( Arithmetic.class ))
		    	  str = method.getAnnotation(Arithmetic.class).name();
		      else
		    	  str = method.getAnnotation(Scientific.class).name();

		      System.out.println(str);
		    } catch (NoSuchMethodException exc) {
		      System.out.println("Method Not Found.");
		    }

		
	}

}
