package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Term database table.
 * 
 */
@Entity
@NamedQuery(name="Term.findAll", query="SELECT t FROM Term t")
public class Term implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int termId;

	@Column(name="Date_Debut")
	private Date date_Debut;

	@Column(name="Date_Fin")
	private Date date_Fin;

	public Term() {
	}

	public int getTermId() {
		return this.termId;
	}

	public void setTermId(int termId) {
		this.termId = termId;
	}

	public Date getDate_Debut() {
		return date_Debut;
	}

	public void setDate_Debut(Date date_Debut) {
		this.date_Debut = date_Debut;
	}

	public Date getDate_Fin() {
		return date_Fin;
	}

	public void setDate_Fin(Date date_Fin) {
		this.date_Fin = date_Fin;
	}

	

}