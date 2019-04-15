package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transfert implements Serializable {
	@Id  @GeneratedValue
	private Long id_transfert ;
	private int num_temetteur ;
	private int num_trecepteur ;
	private Date datet ;
	@ManyToOne
	@JoinColumn(name="Numero")
	private Client client;
	public Transfert() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}


	public Transfert(Long id_transfert, int num_temetteur, int num_trecepteur, Date datet, Client client) {
		super();
		this.id_transfert = id_transfert;
		this.num_temetteur = num_temetteur;
		this.num_trecepteur = num_trecepteur;
		this.datet = datet;
		this.client = client;
	}



	public Long getId_transfert() {
		return id_transfert;
	}
	public void setId_transfert(Long id_transfert) {
		this.id_transfert = id_transfert;
	}
	public int getNum_temetteur() {
		return num_temetteur;
	}
	public void setNum_temetteur(int num_temetteur) {
		this.num_temetteur = num_temetteur;
	}
	public int getNum_trecepteur() {
		return num_trecepteur;
	}
	public void setNum_trecepteur(int num_trecepteur) {
		this.num_trecepteur = num_trecepteur;
	}
	public Date getDatet() {
		return datet;
	}
	public void setDatet(Date datet) {
		this.datet = datet;
	}
	
	
	

	
	

}
