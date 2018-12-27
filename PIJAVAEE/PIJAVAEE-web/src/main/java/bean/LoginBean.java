package bean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import model.Project;
import model.User;
import services.ProjectConsum;



@ManagedBean(name="loginBean") 
@SessionScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String email; 
	private String password; 
	private Project project; 
	private Boolean loggedIn;
	private User user;

	@EJB
	ProjectConsum ProjectService; 
	public String doLogin()
	{
		String navigateTo = "null"; 
		user = ProjectService.getProjectByEmailAndPassword(email, password); 

		/*if (project != null && project.getRole() == Role.ADMINISTRATEUR) {
			navigateTo = "/pages/admin/welcome?faces-redirect=true";
			loggedIn = true; 
		}
		else 
		{
			FacesContext.getCurrentInstance().addMessage("form:btn", new FacesMessage("Bad Credentials"));
		}*/
		navigateTo = "/pages/admin/welcome?faces-redirect=true";
		return navigateTo; 
	}

	public String doLogout()
	{
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/Login?faces-redirect=true";
	}
 
	public LoginBean() {} 
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

	public ProjectConsum getProjectService() {
		return ProjectService;
	}

	public void setProjectService(ProjectConsum projectService) {
		ProjectService = projectService;
	}

	public String getLogin() {return email;}
	public void setLogin(String login) {this.email = email;}
	public String getPassword() {return password;}
	public void setPassword(String password) {this.password = password;}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Boolean getLoggedIn() {return loggedIn;}
	public void setLoggedIn(Boolean loggedIn) {this.loggedIn = loggedIn;}

}

