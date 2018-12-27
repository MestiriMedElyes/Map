package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Level database table.
 * 
 */
@Entity
@NamedQuery(name="Level.findAll", query="SELECT l FROM Level l")
public class Level implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LevelId")
	private int levelId;

	@Column(name="NbrAnnéesExperience")
	private int nbrAnnéesExperience;

	@Column(name="Niveau")
	private int niveau;

	
	
	public Level() {
	}

	public int getLevelId() {
		return this.levelId;
	}

	public void setLevelId(int levelId) {
		this.levelId = levelId;
	}

	public int getNbrAnnéesExperience() {
		return this.nbrAnnéesExperience;
	}

	public void setNbrAnnéesExperience(int nbrAnnéesExperience) {
		this.nbrAnnéesExperience = nbrAnnéesExperience;
	}

	public int getNiveau() {
		return this.niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

}