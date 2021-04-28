package to_dos;

public class BagTest {

	public static void main(String[] args) {
		BagInterface<String> colorBag = new ArrayBag<String>();
		
		System.out.println("Bag is empty: " + colorBag.isEmpty());
		
		colorBag.add("red");
		colorBag.add("black");
		colorBag.add("purple");
		colorBag.add("white");
		colorBag.add("white");
		colorBag.add("white");
		colorBag.add("white");
		colorBag.add("blue");
		colorBag.add("green");
		colorBag.add("pink");
		
		System.out.println("Size of bag after adding 7 colors: " + colorBag.getCurrentSize());
		
		System.out.println("Remove green from bag" + colorBag.remove("green"));
		System.out.println("Remove the last color: " + colorBag.remove());
		
		System.out.println("Frequency of \"white\": " + colorBag.getFrequencyOf("white"));
		System.out.println("Bag contains blue? " + colorBag.contains("blue"));
		System.out.println("Bag contains yellow? " + colorBag.contains("yellow"));
		
//		colorBag.clear();
		System.out.println("After clearing bag, bag is empty?  " + colorBag.isEmpty());
		colorBag.clear();
		System.out.println("After clearing bag, bag is empty?  " + colorBag.isEmpty());
		
	}
}
