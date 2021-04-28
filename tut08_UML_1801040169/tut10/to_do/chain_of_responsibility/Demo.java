package tut10.to_do.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import tut10.to_do.chain_of_responsibility.middleware.Middleware;
import tut10.to_do.chain_of_responsibility.middleware.RoleCheckMiddleware;
import tut10.to_do.chain_of_responsibility.middleware.ThrottlingMiddleware;
import tut10.to_do.chain_of_responsibility.middleware.UserExistsMiddleware;
import tut10.to_do.chain_of_responsibility.server.Server;




/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        //TO-DO: Register email & pass for 2 account types: admin & user
        server = new Server();
        server.register("admin@gmail.com", "pass-admin");
        server.register("user@gmail.com", "pass-user");
         

        // All checks are linked. Client can build various chains using the same components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
        	//TO-DO: Ask for email & password then save to suitable variables
        	System.out.println("Enter email: ");
        	String email = reader.readLine();
        	System.out.println("Enter password: ");
        	String password = reader.readLine();
        	success = server.logIn(email, password);
            
        	//TO-DO: Try to login to server with given email & password
        	//then store the result to variable 'success'
            success = false;
        } while (!success);
    }
}
