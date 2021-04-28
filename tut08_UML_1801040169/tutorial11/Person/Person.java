package tutorial11.Person;

public class Person {
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	protected void setName(String name) throws IllegalArgumentException {
		if(name.length() < 3) {
			throw new IllegalArgumentException("Name's length should not be less than 3 symbols!");
		}
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	protected void setAge(int age) throws IllegalArgumentException{
		if(age < 0 || age > 200) {
			throw new IllegalArgumentException("Age must be positive!");
		}
		this.age = age;
	}
	public Person(String name, int age) {
		this.setAge(age);
		this.setName(name);
	}
	@Override
	public String toString() {
		final StringBuffer sb = new StringBuffer();
		sb.append(String.format("Name: %s, Age: %d", 
				this.getName(),
				this.getAge()));
		return sb.toString();
	}
	
	

}
