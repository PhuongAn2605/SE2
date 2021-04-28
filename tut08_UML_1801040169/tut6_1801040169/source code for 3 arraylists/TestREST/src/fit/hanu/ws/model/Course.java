package fit.hanu.ws.model;

public class Course {
	private int id;
	private String name;
	private int credit;
	private int semester;
	public Course(int id, String name, int credit, int semester) {
		super();
		this.id = id;
		this.name = name;
		this.credit = credit;
		this.semester = semester;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	
}
