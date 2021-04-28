package fit.hanu.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class HelloResourse {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml() {
		return "<html><title>Hello</title>"
				+ "<body><h1>Hello Phuong</h1><body>";
	}
	
	
}
