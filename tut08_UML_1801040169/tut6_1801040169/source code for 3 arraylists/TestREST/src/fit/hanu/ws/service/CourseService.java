package fit.hanu.ws.service;

import java.util.ArrayList;
import java.util.List;

import fit.hanu.ws.model.Course;

public class CourseService {

	public List<Course> getAllCourses(){
		List<Course> list = new ArrayList<Course>();
		Course c1 = new Course(1, "SE2", 3, 2);
		Course c2 = new Course(2, "MPR", 3, 2);
		list.add(c1);
		list.add(c2);
		return list;
	}
}
