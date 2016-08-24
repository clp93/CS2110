/** Class houses a static procedure main and a static function              
 * that calculates the area of a circle. */
public class First {
	/** Print out "hello World and */
	public static void main(String[] pars) {
		System.out.println("Hello World");
		System.out.println("Area of circle with radius 5 is " +
				area(5));
	}
	/** Return the area of a circle with radius r */
	public static double area(double r) {
		return Math.PI * r * r;
	}
}
