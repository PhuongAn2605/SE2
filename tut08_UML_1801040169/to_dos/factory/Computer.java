package to_dos.factory;

// Create the Computer class that extends Course abstract class 
class Computer extends Course {
	// TO-DO: Implement getDuration() method: set a specific duration and print value
	public void getDuration() {
		duration = 5;
		System.out.println("Total semesters: " + duration);
 
	}

	// TO-DO: Implement getFeePerSemester() method: set a specific fee and print value
	public void getFeePerSemester() {
		fee = 300;
		System.out.println("Fee for each semester: " + fee);
	}
} 
