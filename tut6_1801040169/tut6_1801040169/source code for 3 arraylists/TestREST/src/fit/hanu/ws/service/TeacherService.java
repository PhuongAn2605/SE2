package fit.hanu.ws.service;

import java.util.ArrayList;
import java.util.List;

import fit.hanu.ws.model.Teacher;

public class TeacherService {

	public List<Teacher> getAllTeachers(){
		Teacher t1 = new Teacher(1, "Mr.Longdt", "Hanoi", "094874822");
		Teacher t2 = new Teacher(2, "Mr.Cong", "Hanoi", "094874822");
		
		List<Teacher> list = new ArrayList<Teacher>();
		list.add(t1);
		list.add(t2);
		return list;
	}
}
