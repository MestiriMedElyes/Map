package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Seniority database table.
 * 
 */
@Entity
@NamedQuery(name="Seniority.findAll", query="SELECT s FROM Seniority s")
public class Seniority implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idSeniority;

	@Column(name="Label")
	private String label;

	public Seniority() {
	}

	public int getIdSeniority() {
		return this.idSeniority;
	}

	public void setIdSeniority(int idSeniority) {
		this.idSeniority = idSeniority;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	

}