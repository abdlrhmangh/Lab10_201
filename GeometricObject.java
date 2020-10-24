
public class GeometricObject {
	private String color;
	private boolean filled;

	GeometricObject() {

	}

	GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String newColor) {
		this.color = newColor;
	}

	public boolean getFilled() {
		return this.filled;
	}

	public void setFilled(boolean newFilled) {
		this.filled = newFilled;
	}
}
