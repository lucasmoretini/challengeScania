package br.com.app.challenge.scania.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Companies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private Date foundation;
	
	public Companies(int id, String name, Date foundation) {
		super();
		this.id = id;
		this.name = name;
		this.foundation = foundation;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getFoundation() {
		return foundation;
	}
	
	public void setFoundation(Date foundation) {
		this.foundation = foundation;
	}
	
	
	
	
}
