package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


@Entity
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProject")
	private int idProject;

	@Column(name="Nom")
	private String Nom;


	@Column(name="Date_Debut")
	private Date Date_Debut;

	@Column(name="Date_Fin")
	private Date Date_Fin;
	
	@Column(name="NbrRessourceTotal")
	private int NbrRessourceTotal;

	@Column(name="NbrRessourceLevio")
	private int NbrRessourceLevio;

	@Column(name="Image")
	private String Image;

	@Column(name="idCompetence")
	private int idCompetence;
	
	@Column(name="projectTypes")
	private int projectTypes;
	
	@Column(name="IdClient")
	private int IdClient;
	
	
	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public int getIdProject() {
		return idProject;
	}

	public void setIdProject(int idProject) {
		this.idProject = idProject;
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


	public int getIdClient() {
		return IdClient;
	}

	public void setIdClient(int idClient) {
		IdClient = idClient;
	}

	public Project(String nom, Date date_Debut, Date date_Fin, int nbrRessourceTotal,
			int nbrRessourceLevio, String image, int IdCompetence, int ProjectTypes, int idClient) {
		super();
		Nom = nom;
		Date_Debut = date_Debut;
		Date_Fin = date_Fin;
		NbrRessourceTotal = nbrRessourceTotal;
		NbrRessourceLevio = nbrRessourceLevio;
		Image = image;
		idCompetence = IdCompetence;
		projectTypes = ProjectTypes;
		IdClient = idClient;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int idProject, String nom, Date date_Debut, Date date_Fin, int nbrRessourceTotal,
			int nbrRessourceLevio, String image, int idCompetence, int projectTypes, int idClient) {
		super();
		this.idProject = idProject;
		Nom = nom;
		Date_Debut = date_Debut;
		Date_Fin = date_Fin;
		NbrRessourceTotal = nbrRessourceTotal;
		NbrRessourceLevio = nbrRessourceLevio;
		Image = image;
		this.idCompetence = idCompetence;
		this.projectTypes = projectTypes;
		IdClient = idClient;
	}

	
	

	}
	
	