package fit.hanu.ws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fit.hanu.ws.model.Teacher;
import fit.hanu.ws.service.TeacherService;


@Path("/teacher")
public class TeacherResource {
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Teacher> getTeacher() {
		TeacherService teacherService = new TeacherService();
		return teacherService.getAllTeachers();
		
	}
}
