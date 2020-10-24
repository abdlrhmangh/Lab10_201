
public class Triangle extends GeometricObject {

	private double S, side1, side2, side3, area;
	private String color;
	private boolean filled;

	Triangle() {
	}

	Triangle(double side1, double side2, double side3, String color, boolean filled) throws IllegalTriangleException {

		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;

		this.color = color;
		this.filled = filled;

		this.S = (side1 + side2 + side3) / 2;
		
		setArea();
		if (side1 + side2 < side3 | side1 + side3 < side2 | side3 + side2 < side1) {
			throw new IllegalTriangleException("two sides are bigger than one of the sides");
		}

	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double newSide2) {
		this.side2 = newSide2;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double newSide1) {
		this.side1 = newSide1;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double newSide3) {
		this.side3 = newSide3;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public double getArea() {

		return this.area;
	}

	public void setArea() {
	
		this.area = Math.sqrt((S * (S - side1) * (S - side2) * (S - side3)));
	}

	public double getPerimeter() {
		return side1 + side2 + side3;
	}

	public String toString() {
		return "the area is :" + getArea() + "\tthe perimeter :" + getPerimeter() + ".\nThe color is :" + getColor()
				+ "\tfilled or not : " + getFilled();
	}

}
