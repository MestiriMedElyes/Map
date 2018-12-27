package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Resume database table.
 * 
 */
@Entity
@NamedQuery(name="Resume.findAll", query="SELECT r FROM Resume r")
public class Resume implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idResume;

	@Column(name="Education")
	private String education;

	@Column(name="Location")
	private String location;

	public Resume() {
	}

	public int getIdResume() {
		return this.idResume;
	}

	public void setIdResume(int idResume) {
		this.idResume = idResume;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	

}