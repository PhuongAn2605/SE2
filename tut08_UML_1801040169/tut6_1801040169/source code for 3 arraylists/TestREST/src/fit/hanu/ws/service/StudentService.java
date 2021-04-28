package fit.hanu.ws.service;

import java.util.ArrayList;
import java.util.List;

import fit.hanu.ws.model.Student;

public class StudentService {

	public List<Student> getAllStudents() {
		Student s1 = new Student ("Hoang Tuan","Ha Noi", "0912345678");
		Student s2 = new Student ("Phuong Linh","Hai Duong", "0986868686");
		List<Student> list = new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		return list;
	}
}
