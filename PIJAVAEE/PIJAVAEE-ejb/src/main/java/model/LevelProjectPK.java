package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the LevelProjects database table.
 * 
 */
@Embeddable
public class LevelProjectPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="Level_LevelId", insertable=false, updatable=false)
	private int level_LevelId;

	@Column(name="Project_idProject", insertable=false, updatable=false)
	private int project_idProject;

	public LevelProjectPK() {
	}
	public int getLevel_LevelId() {
		return this.level_LevelId;
	}
	public void setLevel_LevelId(int level_LevelId) {
		this.level_LevelId = level_LevelId;
	}
	public int getProject_idProject() {
		return this.project_idProject;
	}
	public void setProject_idProject(int project_idProject) {
		this.project_idProject = project_idProject;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LevelProjectPK)) {
			return false;
		}
		LevelProjectPK castOther = (LevelProjectPK)other;
		return 
			(this.level_LevelId == castOther.level_LevelId)
			&& (this.project_idProject == castOther.project_idProject);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.level_LevelId;
		hash = hash * prime + this.project_idProject;
		
		return hash;
	}
}