
public class Square extends Shape {
    
    private Integer side;

	public Square(String name, Integer side) {
		super(name);
		this.side = side;
	}

	public Integer getSide() {
		return side;
	}

	public void setSide(Integer side) {
		this.side = side;
	}

	@Override
	float calculateArea() {
		return side*side;
	}
	

       
    
}
	
