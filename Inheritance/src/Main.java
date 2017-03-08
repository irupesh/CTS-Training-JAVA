import java.util.Scanner;

public class Main {
	
	static void menu(){
		System.out.println("1. Rectangle\n2. Square\n3. Circle\nArea Calculator --- Choose your shape");
	}
	
	public static void main(String[] args){
		menu();
		
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice){
		    case 1 :
		    	 System.out.println("Enter length and breadth:");
		         int len = input.nextInt();
		         int breadth = input.nextInt();
		         Shape s = new Rectangle(len,breadth);
		         System.out.println(String.format( "Area of Rectangle is:%.2f", s.calculateArea() ));
		         break;
		    case 2 :
		    	 System.out.println("Enter side:");
		         int side = input.nextInt();
		         Shape s1 = new Square(side);
		         System.out.println(String.format( "Area of Square is:%.2f", s1.calculateArea() ));
		         break;
		    case 3 :
		    	 System.out.println("Enter Radius:");
		         int r = input.nextInt();
		         Shape s2 = new Circle(r);
		         System.out.println(String.format( "Area of Circle is:%.2f", s2.calculateArea() ));
		         break;        
		}
		input.close();
	}

}
