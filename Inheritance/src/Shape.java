class Shape{
  protected String shapeName;
  
  Shape(){
	  shapeName = null;
  }
  
  double calculateArea (){
	  return 0;
  }

public String getShapeName() {
	return shapeName;
}

public void setShapeName(String shapeName) {
	this.shapeName = shapeName;
}
}

class Square extends Shape{
	private int side;
	Square(int side) {
		shapeName = "Square";
		this.side = side;
		
	}
	double calculateArea (){
		  return side*side;
	  }
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
}

class Rectangle extends Shape{
	private int length;
	private int breadth;
	public Rectangle(int length, int breadth) {
		shapeName = "Rectangle";
		this.length = length;
		this.breadth = breadth;
	}
	double calculateArea (){
		  return length*breadth;
	  }
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
}

class Circle extends Shape{
	private int radius;

	public Circle(int radius) {
		shapeName = "Circle";
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	double calculateArea () {
		  return 3.1416*radius*radius;
	  }
}


