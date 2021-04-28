package tutorial11.Mankind;

public class Worker extends Human{
	private double weekSalary;
	private int hoursPerDay;

	public Worker(String firstName, String lastName, double weekSalary, int hoursPerDay) {
		super(firstName, lastName);
		this.setWeekSalary(weekSalary);
		this.setHoursPerDay(hoursPerDay);
	}

	@Override
	protected void setLastName(String lastName) throws IllegalArgumentException{
		if(lastName.length() <= 3) {
			throw new IllegalArgumentException("Expected length more than 3 symbols!Argument: lastName: " + lastName);
		}
		super.setLastName(lastName);
	}
	
	public double getWeekSalary() {
		return weekSalary;
	}

	protected void setWeekSalary(double weekSalary) throws IllegalArgumentException{
		if(weekSalary <= 10) {
			throw new IllegalArgumentException("Expected value mismatch!Argument:weekSalary: " + weekSalary);
		}
		this.weekSalary = weekSalary;
	}

	public int getHoursPerDay() {
		return hoursPerDay;
	}

	protected double calculateSalaryPerHour() {
		return Math.round(getWeekSalary() / (getHoursPerDay()*7));
		
	}
	protected void setHoursPerDay(int hourPerDay) throws IllegalArgumentException{
		if(hourPerDay < 1 || hourPerDay > 12) {
			throw new IllegalArgumentException("Expected value mismatch!Argument:workHoursPerDay: " + hourPerDay);
		}
		this.hoursPerDay = hourPerDay;
	}

	@Override
	public String toString() {
		String str = super.toString();
		StringBuilder sb = new StringBuilder();
		sb.append(str)
		.append("Week Salary: ").append(this.getWeekSalary())
		.append(System.lineSeparator())
		.append("Hours Per Day: ").append(this.getHoursPerDay())
		.append(System.lineSeparator())
		.append("Salary per hour: ").append(this.calculateSalaryPerHour())
		.append(System.lineSeparator());
		
		return sb.toString();
	}
	
}
