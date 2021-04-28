package to_dos.abstract_factory;

import java.util.Scanner;

/* Create the AbstractFactoryTest class which uses the FactoryProducer 
 * to get AbstractFactory in order to get factories 
 * of concrete classes by passing an information such as type.
 */

public class AbstractFactoryTest {
	//TO-DO: Implement the main() method for testing purpose
	public static void main(String[] args) {
		// get shape factory
//		System.out.println("Input the type of shape: ");
//		Scanner sc = new Scanner(System.in);
//		String shapeType = sc.nextLine();
		AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
 
		// get an object of Shape Rectangle
//		Shape rec = new Rectangle();
		Shape rec = shapeFactory.getShape("rectangle");
 
		// call draw method of Shape Rectangle
		rec.draw();
 
		// get an object of Shape Square
		Shape square = shapeFactory.getShape("square");
 
		// call draw method of Shape Square
		square.draw();
 
		// get shape factory
		AbstractFactory shapeFactory2 = FactoryProducer.getFactory(true);
 
		// get an object of Shape Rectangle
		Shape rectangle = shapeFactory2.getShape("rectangle");
		
 
		// call draw method of Shape Rectangle
		rectangle.draw();
 
		// get an object of Shape Square
		Shape sq = shapeFactory2.getShape("square");
 
		// call draw method of Shape Square
		sq.draw();

	}
}