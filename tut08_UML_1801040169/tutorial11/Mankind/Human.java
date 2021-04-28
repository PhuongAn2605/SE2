package tutorial11.Mankind;

public class Human {
	private String firstName;
	private String lastName;
	
	public Human(String firstName, String lastName) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) throws IllegalArgumentException{
		if(!Character.isUpperCase(firstName.charAt(0))) {
			throw new IllegalArgumentException("Expected upper case letter!Argument:firstName: " + firstName);
		}
		if(firstName.length() < 4) {
			throw new IllegalArgumentException("Expected length at least 4 symbols!Argument: firstName: "+ firstName);
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	protected void setLastName(String lastName) {
		if(!Character.isUpperCase(lastName.charAt(0))) {
			throw new IllegalArgumentException("Expected upper case letter!Argument:lastName: " + lastName);
		}
		if(lastName.length() <3) {
			throw new IllegalArgumentException("Expected length at least 3 symbols!Argument: lastName: "+ lastName);
		}
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("Type: ").append(this.getClass().getSimpleName())
		.append(System.lineSeparator())
		.append("First name: ").append(this.getFirstName())
		.append(System.lineSeparator())
		.append("Last name: ").append(this.getLastName())
		.append(System.lineSeparator());
		
		return sb.toString();
	}
	
	
}
