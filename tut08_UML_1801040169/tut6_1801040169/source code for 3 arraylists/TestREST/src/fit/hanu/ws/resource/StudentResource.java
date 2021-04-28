package fit.hanu.ws.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fit.hanu.ws.model.Student;
import fit.hanu.ws.service.StudentService;

@Path("/student")
public class StudentResource {
	StudentService studentService = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Student> getStudent(){
		return studentService.getAllStudents();
	}
}
