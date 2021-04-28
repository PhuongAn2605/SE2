package to_dos.prototype;

/* Create the ShapeDraw class which uses ShapeCache class 
to get clones of shapes stored in a Hashtable. */
public class ShapeDraw {
	// TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// run loadCache() method
		ShapeCache.loadCache();
		

		/*
		 * create 3 cloned shapes with 3 different types Hint: use getShape() &
		 * getType() methods
		 */
		Shape circle = ShapeCache.getShape("C1");
		Shape rectangle = ShapeCache.getShape("R1");
		Shape square = ShapeCache.getShape("S1");
		
		System.out.println("Circle: " + circle.getType() + ", ID: " + circle.getId());
		System.out.println("Rectangle: " + rectangle.getType() + ", ID: " + rectangle.getId());
		System.out.println("Square: " + square.getType() + ", ID: " + square.getId());
		

	}
}