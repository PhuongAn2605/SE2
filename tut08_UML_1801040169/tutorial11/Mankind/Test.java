package tutorial11.Mankind;

import java.lang.reflect.Method;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter first name: ");
			String firstName = sc.nextLine();
			
			System.out.println("Enter last name: ");
			String lastName = sc.nextLine();
			
			System.out.println("Enter faculty number: ");
			String facultyNumber = sc.nextLine();
			
			System.out.println("Enter week salary: ");
			double weekSalary = Double.valueOf(sc.nextLine());
			
			System.out.println("Enter hours per day: ");
			int hoursPerDay = Integer.valueOf(sc.nextLine());
			
			Human human = new Human(firstName, lastName);
			Student student = new Student(firstName, lastName, facultyNumber);
			Worker worker = new Worker(firstName, lastName, weekSalary, hoursPerDay);
			
			//get all declared method excluding inherited method
			Method[] humanDeclaredMethods = Human.class.getDeclaredMethods();
			Method[] studentDeclaredMethods = Student.class.getDeclaredMethods();
//			Method[] workerDeclaredMethods = Worker.class.getDeclaredMethods();
			
			if(studentDeclaredMethods.length > 3) {
				throw new IllegalArgumentException("Code duplication in Student!");
			}
//			if( workerDeclaredMethods.length > 6) {
//				throw new IllegalArgumentException("Code duplication in Worker!");
//			}
			
			System.out.println(human.toString());
			System.out.println(student.toString());
			System.out.println(worker.toString());
			
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
