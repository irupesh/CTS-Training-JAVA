
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Circle");
        System.out.println("Square");
        System.out.println("Rectangle");
        System.out.println("Enter the shape name");
        String shapeName = br.readLine();
        Float area;
        if(shapeName.toLowerCase().equals("circle")){
            System.out.println("Enter the radius");
            Integer radius = Integer.parseInt(br.readLine());
            Shape cirIns = new Circle(shapeName,radius);
            area = cirIns.calculateArea();
            System.out.print("Area of Circle is ");
            System.out.printf("%.2f\n",area);
        }else if(shapeName.toLowerCase().equals("square")){
            System.out.println("Enter the side");
            Integer side = Integer.parseInt(br.readLine());
            Shape sqIns = new Square(shapeName,side);
            area = sqIns.calculateArea();
            System.out.print("Area of Square is ");
            System.out.printf("%.2f\n",area);
        }else if(shapeName.toLowerCase().equals("rectangle")){
            System.out.println("Enter the length");
            Integer length = Integer.parseInt(br.readLine());
            System.out.println("Enter the breadth");
            Integer breath = Integer.parseInt(br.readLine());
            Shape recIns = new Rectangle(shapeName,length,breath);
            area = recIns.calculateArea();
            System.out.print("Area of Rectangle is ");
            System.out.printf("%.2f\n",area);
        }else{
            System.out.println("Invalid shape");
        }
        
    }
    
}
