/*package model;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ServiceConsommation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client= ClientBuilder.newClient();
		WebTarget target=client.target("http://localhost:22033/api/project/GetProjects");
		
		Response response=target.request().get();
		String result = response.readEntity(String.class);
		System.out.println(result);
		response.close();
	}

}
*/