package org.sid.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Service {
	@Id  @GeneratedValue
	private long id_service;
	private String titre;
	@ManyToOne
	@JoinColumn(name="id_niveau")
	private Niveau niveau;
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Service(String titre) {
		super();
		this.titre = titre;
	}
	public long getId_service() {
		return id_service;
	}
	public void setId_service(long id_service) {
		this.id_service = id_service;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	

	

}
