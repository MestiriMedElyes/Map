package bean;

import java.io.Serializable;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonReader;

import model.Project;
import services.ProjectConsum;


@ManagedBean(name ="ProjectBean") 
@SessionScoped
public class ProjectBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String Nom;
	//private Date Date_Debut; 
	//private Date Date_Fin;
	
	private int NbrRessourceTotal;  
	private int NbrRessourceLevio;  
	private String Image;
	private int idCompetence;
	private int projectTypes;
	private int Id;
    private int idProject;
    private Integer IdToBeUpdated;

    private Date Date_Debut;
    
    private Date Date_Fin;

    
    
	//DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 00:00:00.0000000");
	//String cur_date = dateFormat.format(Date_Debut);

	public Integer getIdToBeUpdated() {
    	return IdToBeUpdated;
    }


    public void setIdToBeUpdated(Integer IdToBeUpdated) {
    	this.IdToBeUpdated = IdToBeUpdated;
    }
	@EJB
	ProjectConsum ProjectService; 
	private List<Project> projects;
    private Project project; 
    Project projectAjout=new Project();
    
    
    public void addProjet() throws ParseException {
    	Project projectAjout=new Project();
    	projectAjout.setNom(Nom);
    	projectAjout.setDate_Debut(Date_Debut);
    	projectAjout.setDate_Fin(Date_Fin);
    	projectAjout.setNbrRessourceTotal(NbrRessourceTotal);
    	projectAjout.setNbrRessourceLevio(NbrRessourceLevio);
    	projectAjout.setImage(Image);
    	projectAjout.setIdCompetence(idCompetence);
    	projectAjout.setProjectTypes(projectTypes);
    	projectAjout.setIdClient(Id);
    	
    	int response=ProjectService.ajouterProject(projectAjout); }
    
	public List<Project> getProjects() {
		projects = ProjectService.getAllProjects(); 
		return projects;
		} 
	public void deleteProjectById(int idProject)
	{		

		ProjectService.deleteProjectById(idProject);
	}
	
	public void EditProject(Project projectAjout ){
		  
		
    	this.setNom(projectAjout.getNom());
    	this.setDate_Debut(projectAjout.getDate_Debut());
    	this.setDate_Fin(projectAjout.getDate_Fin());
    	this.setNbrRessourceTotal(projectAjout.getNbrRessourceTotal());
    	this.setNbrRessourceLevio(projectAjout.getNbrRessourceLevio());
    	this.setImage(projectAjout.getImage());
    	this.setIdCompetence(projectAjout.getIdCompetence());
    	this.setProjectTypes(projectAjout.getProjectTypes());
    	this.setId(projectAjout.getIdClient());
    	//this.setIdProject(projectAjout.getIdProject());
    	this.setIdToBeUpdated(projectAjout.getIdProject());

    	int response=ProjectService.updateProject(IdToBeUpdated,(new Project(IdToBeUpdated,Nom,Date_Debut,Date_Fin,NbrRessourceTotal,NbrRessourceLevio,Image,idCompetence,projectTypes,Id)));
	}
	public void mettreAjourProject(){
		ProjectService.updateProject(IdToBeUpdated,(new Project(IdToBeUpdated,Nom,Date_Debut,Date_Fin,NbrRessourceTotal,NbrRessourceLevio,Image,idCompetence,projectTypes,Id)));
	}
	
/*	public Date changeDate(String s) throws ParseException{
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		Date date = format.parse(s);
		System.out.println(date);
		return  date;
		}
	public List<Project> doGetListProject() throws Throwable {
		// TODO Auto-generated method stub
		 //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 00:00:00.0000000"); 
		   //String debut =  simpleDateFormat.parse((Date_Debut).toString());
		
		//List<Project> response=ProjectService.testConsume();
		JsonReader jsonReader = Json.createReader
				(new StringReader(ProjectService.testConsume().toString()));
		System.out.println("jsonReader"+jsonReader.toString());
		JsonArray jsonObject = jsonReader.readArray();
		System.out.println("jsonObject"+jsonObject.toString());
		jsonReader.close();
    	List<Project>response = new ArrayList<Project>();

		for (int i = 0; i < jsonObject.size(); i++) {
			Project projectAjou=new Project();
			projectAjou.setNom(jsonObject.getJsonObject(i).getString("Nom").toString());
			projectAjou.setDate_Debut(changeDate((jsonObject.getJsonObject(i).getString("Date_Debut"))));	    	
			projectAjou.setDate_Fin(changeDate((jsonObject.getJsonObject(i).getString("Date_Fin"))));	    	
	    	projectAjou.setNbrRessourceTotal(jsonObject.getJsonObject(i).getInt("NbrRessourceTotal"));
	    	projectAjou.setNbrRessourceLevio(jsonObject.getJsonObject(i).getInt("NbrRessourceLevio"));
	    	projectAjou.setImage(jsonObject.getJsonObject(i).getString("Image").toString());
	    	projectAjou.setIdCompetence(jsonObject.getJsonObject(i).getInt("idCompetence"));
	    	projectAjou.setProjectTypes(jsonObject.getJsonObject(i).getInt("projectTypes"));
	    	projectAjou.setIdClient(jsonObject.getJsonObject(i).getInt("ID"));
	    	response.add(projectAjou);
	    	
		}
		return response;
	}*/

	
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	


	public Date getDate_Debut() {
		return Date_Debut;
	}


	public void setDate_Debut(Date date_Debut) {
		Date_Debut = date_Debut;
	}


	public Date getDate_Fin() {
		return Date_Fin;
	}
	public void setDate_Fin(Date date_Fin) {
		Date_Fin = date_Fin;
	}
	public int getNbrRessourceTotal() {
		return NbrRessourceTotal;
	}
	public void setNbrRessourceTotal(int nbrRessourceTotal) {
		NbrRessourceTotal = nbrRessourceTotal;
	}
	public int getNbrRessourceLevio() {
		return NbrRessourceLevio;
	}
	public void setNbrRessourceLevio(int nbrRessourceLevio) {
		NbrRessourceLevio = nbrRessourceLevio;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	public int getIdCompetence() {
		return idCompetence;
	}
	public void setIdCompetence(int idCompetence) {
		this.idCompetence = idCompetence;
	}
	public int getProjectTypes() {
		return projectTypes;
	}
	public void setProjectTypes(int projectTypes) {
		this.projectTypes = projectTypes;
	}


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getIdProject() {
		return idProject;
	}


	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	
	
	
	

}
	
