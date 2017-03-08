
public class Circle extends Shape {
    
    private Integer radius;

	public Circle(String name, Integer radius) {
		super(name);
		this.radius = radius;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	
	float calculateArea() {
		return 3.14f*radius*radius;
	}

    
    
    
}
