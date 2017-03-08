import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) throws Exception {
		 
		 
		String str;
		Scanner input = new Scanner(System.in);
		System.out.println("1)Admin\n2)Teacher\n3)Student\nSelect Option");
		int choice = input.nextInt();
		if(choice == 1)
			str = "Admin";
		else if(choice ==2)
			str = "Teacher";
		else
			str = "Student";
		 
	      for (Method m : User.class.getMethods()) {
	    	  if(m.isAnnotationPresent(Roles.class)){
	    		  for(Role role: m.getAnnotation(Roles.class).value()){
		                 if(role.value().equals(str)){
		                	 System.out.println(m.getName().toString());
		                 }
		             }
	    		  
	    	  }else if(m.isAnnotationPresent(Role.class)){
	    		  if(m.getAnnotation(Role.class).value().equals(str))
	    		    System.out.println(m.getName().toString());
	    	  }
	 
	           
	         
	      }
	   }

}
