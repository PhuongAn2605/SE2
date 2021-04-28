package tutorial11.Person;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter age: ");
		int age = Integer.valueOf(sc.nextLine());
		try {
			Child child = new Child(name, age);
			System.out.println(child.toString());
			String personClassName = Person.class.getSimpleName();
			String childClassName = Child.class.getSimpleName();
		}catch(IllegalArgumentException error) {
			System.out.println(error.getMessage());
		}
	}
}
