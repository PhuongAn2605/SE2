package fit.hanu.ws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fit.hanu.ws.model.Course;
import fit.hanu.ws.service.CourseService;

@Path("/course")
public class CourseResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Course> getCourse(){
		CourseService courseService = new CourseService();
		return courseService.getAllCourses();
	}
}
