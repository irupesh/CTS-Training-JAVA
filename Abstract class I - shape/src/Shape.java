
abstract public class Shape {
    
    protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
 
	abstract float calculateArea();
    
}
