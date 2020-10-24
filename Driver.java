import java.util.Scanner;

public class Driver {

	public static void main(String[] args) throws IllegalTriangleException {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		System.out.println(
				"Enter three sides of the triangle and a color, and whether\nit's filled or not using (1=true/2=false).");

		double side1, side2, side3, filledInt;
		String color;
		boolean filled = false;

		side1 = kb.nextDouble();
		side2 = kb.nextDouble();
		side3 = kb.nextDouble();
		color = kb.next();
		filledInt = kb.nextInt();

		if (filledInt == 1) {
			filled = true;
		} else if (filledInt == 2) {
			filled = false;
		}

		Triangle triangle1 = new Triangle(side1, side2, side3, color, filled);
		
		System.out.println(triangle1);

		kb.close();
	}

}
