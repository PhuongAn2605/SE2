package tutorial11.BookShop;

import java.lang.reflect.Method;
import java.util.Scanner;





public class Test {
	public static void main(String[] args) throws IllegalArgumentException{
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter author: ");
			String author = sc.nextLine();
			System.out.println("Enter title: ");
			String title = sc.nextLine();
			System.out.println("Enter price: ");
			double price = Double.valueOf(sc.nextLine());
			
			Book book = new Book(author, title, price);
			
			GoldenEditionBook goldenEditionBook = new GoldenEditionBook(author, title, price);
			
			Method[] bookDeclareMethods = Book.class.getDeclaredMethods();
			Method[] goldenBookDeclaredMethods = GoldenEditionBook.class.getDeclaredMethods();
			if(goldenBookDeclaredMethods.length > 1) {
				throw new IllegalArgumentException("Code duplication in GoldenEditionBook!");
			}
			System.out.println(book.toString());
			System.out.println(goldenEditionBook.toString());
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
