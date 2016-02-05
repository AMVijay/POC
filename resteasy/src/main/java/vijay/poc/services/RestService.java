package vijay.poc.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/resteasy")
public class RestService {
	
	@GET
	@Path("/{name}")
	public String sayHello(@PathParam("name") String name){
		return "Hello, " + name;
	}

}
