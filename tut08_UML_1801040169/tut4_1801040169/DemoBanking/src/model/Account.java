package model;

public class Account {

	protected String accountNumber;
	private String name;
	private String address;
	private String dob;
	private String phone;
	private String email;
	
	public Account() {
		super();
	}

	public Account(String accountNumber, String name, String address, String dob, String phone, String email) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = address;
		this.dob = dob;
		this.phone = phone;
		this.email = email;
	}

	public String getaccountNumber() {
		return accountNumber;
	}

	public void setaccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
