package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LevelProjects database table.
 * 
 */
@Entity
@Table(name="LevelProjects")
@NamedQuery(name="LevelProject.findAll", query="SELECT l FROM LevelProject l")
public class LevelProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LevelProjectPK id;

	public LevelProject() {
	}

	public LevelProjectPK getId() {
		return this.id;
	}

	public void setId(LevelProjectPK id) {
		this.id = id;
	}

}