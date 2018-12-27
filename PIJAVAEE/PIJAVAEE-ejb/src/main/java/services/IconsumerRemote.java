package services;

import java.util.List;

import javax.ejb.Remote;

import model.Project;
import model.User;

@Remote
public interface IconsumerRemote {
	public List<Project> testConsume();
	public int ajouterProject(Project p);
	public void deleteProjectById(int id);
	public int updateProject(int idProject,Project p);
	public User getProjectByEmailAndPassword(String email, String password);
	public List<Project> getAllProjects();
	//public List<Project> doGetListProject(); 
	//public void deleteProject(int idProject);
	/*public int ajouterProjet(Project e);
	public void updateProjet(Project e);*/

}
	
