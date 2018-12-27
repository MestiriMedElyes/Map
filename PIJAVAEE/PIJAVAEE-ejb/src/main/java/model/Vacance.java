package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Vacance database table.
 * 
 */
@Entity
@NamedQuery(name="Vacance.findAll", query="SELECT v FROM Vacance v")
public class Vacance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="VacanceId")
	private int vacanceId;

	@Column(name="Date_Debut")
	private Date date_Debut;

	@Column(name="Date_Fin")
	private Date date_Fin;

	private int idRessource;

	private int typeholiday;

	public Vacance() {
	}

	public int getVacanceId() {
		return this.vacanceId;
	}

	public void setVacanceId(int vacanceId) {
		this.vacanceId = vacanceId;
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

	public int getIdRessource() {
		return this.idRessource;
	}

	public void setIdRessource(int idRessource) {
		this.idRessource = idRessource;
	}

	public int getTypeholiday() {
		return this.typeholiday;
	}

	public void setTypeholiday(int typeholiday) {
		this.typeholiday = typeholiday;
	}

}