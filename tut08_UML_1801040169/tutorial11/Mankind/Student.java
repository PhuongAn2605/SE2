package tutorial11.Mankind;

public class Student extends Human{
	private String facultyNumber;

	public Student(String firstName, String lastName, String facultyNumber) {
		super(firstName, lastName);
		this.setFacultyNumber(facultyNumber);
	}

	public String getFacultyNumber() {
		return facultyNumber;
	}

	protected void setFacultyNumber(String facultyNumber) throws IllegalArgumentException{
		if(facultyNumber.length() <5 || facultyNumber.length() > 10) {
			throw new IllegalArgumentException("Invalid faculty number!");
		}
		this.facultyNumber = facultyNumber;
	}

	@Override
	public String toString() {
		
		String str =  super.toString();
		StringBuilder sb = new StringBuilder();
		sb.append(str)
		.append("Faculty Number: ").append(this.getFacultyNumber())
		.append(System.lineSeparator());
		
		return sb.toString();
	}
	
}
