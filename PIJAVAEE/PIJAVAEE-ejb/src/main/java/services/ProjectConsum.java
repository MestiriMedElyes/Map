package services;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.Order;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import model.Project;
import model.User;

@Stateless
@LocalBean
public class ProjectConsum implements IconsumerRemote {
	@PersistenceContext(unitName = "PIJAVAEE-ejb")
	EntityManager em;
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Client client = ClientBuilder.newClient();
//		WebTarget target =client.target("http://localhost:22033/Project/IndexAPI");
//		Response reponse = target.request().get();
//		System.out.println(reponse.readEntity(String.class));
//	
//	}
	public List<Project> testConsume(){
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:22033/api/project/GetProjects");
		Response reponse = target.request().get();
		System.out.println(reponse.readEntity(String.class));
		return null;
	}

	@Override
	public int ajouterProject(Project p) {
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:22033/Restfull/CreateQuestion");
		Invocation.Builder invocationBuilder=target.request(MediaType.APPLICATION_JSON);
		//Response reponse = target.request().get();
		Response response =invocationBuilder.post(Entity.entity(p, MediaType.APPLICATION_JSON));
		System.out.println(response.readEntity(String.class));
		return 0;
	}
	
	@Override
	public void deleteProjectById(int id) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:22033/Restfull/DeleteProject/"+id);
		Response reponse = target.request().delete();
		System.out.println(reponse.readEntity(String.class));
	}

	@Override
	public int updateProject(int idProject,Project p) {
		// TODO Auto-generated method stub
		Client client = ClientBuilder.newClient();
		WebTarget target =client.target("http://localhost:22033/Restfull/EditProject/"+idProject);
		

		Invocation.Builder invocationBuilder=target.request(MediaType.APPLICATION_JSON);
		//Response response = target.request().put(Entity.entity(p,MediaType.APPLICATION_JSON));
		Response response =invocationBuilder.post(Entity.entity(p, MediaType.APPLICATION_JSON));
		System.out.println(response.readEntity(String.class));
		return 0;
	}
	
	public User getProjectByEmailAndPassword(String email, String password) {
		
		TypedQuery<User> query = em.createQuery("select e from User e where e.email=:email AND e.password=:password", User.class); 

		query.setParameter("email", email); 
		query.setParameter("password", password); 

		User project = null; 
		try {project = query.getSingleResult(); }
		catch (Exception e) { System.out.println("Erreur : " + e); }

		return project;
		} 
	
	public List<Project> getAllProjects() {
		List<Project> emp = em.createQuery("Select e from Project e", Project.class).getResultList();
		return emp;
		}

	
	
	//Employe a = em.find( Employe.class, e.getId() );

	/*public int ajouterProjet(Project e){
		
		em.persist(e);
		return 1;
	}*/
	
	/*public void updateProjet(Project e)
	{
		//Employe a = em.find( Employe.class, e.getId() );
	 
		em.merge(e);

	}*/
	
	/*public void deleteProject(int idProject) {
		Project e = em.find(Project.class,idProject);

		em.remove(e);
	}*/
}
