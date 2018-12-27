package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Test database table.
 * 
 */
@Entity
@NamedQuery(name="Test.findAll", query="SELECT t FROM Test t")
public class Test implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;

	@Column(name="TypeTest")
	private String typeTest;

	@Column(name="Version")
	private String version;

	public Test() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeTest() {
		return typeTest;
	}

	public void setTypeTest(String typeTest) {
		this.typeTest = typeTest;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	

}