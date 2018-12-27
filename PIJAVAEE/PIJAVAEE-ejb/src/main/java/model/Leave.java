package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Leave database table.
 * 
 */
@Entity
@NamedQuery(name="Leave.findAll", query="SELECT l FROM Leave l")
public class Leave implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLeave;

	@Column(name="Date_Debut")
	private Date date_Debut;

	@Column(name="Date_Fin")
	private Date date_Fin;

	@Column(name="Purpose")
	private String purpose;

	public Leave() {
	}

	public int getIdLeave() {
		return this.idLeave;
	}

	public void setIdLeave(int idLeave) {
		this.idLeave = idLeave;
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

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	

}