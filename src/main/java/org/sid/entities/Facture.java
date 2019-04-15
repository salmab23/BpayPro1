  package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Facture implements Serializable {
	@Id  @GeneratedValue
	private Long id_facture ;
	private String descr ;
	private Date datef ;
	private int montantf ;
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Client getClient() {
		return client;
	}

	public Facture(Long id_facture, String descr, Date datef, int montantf, String num_femetteur, String num_frecepteur,
			Client client) {
		super();
		this.id_facture = id_facture;
		this.descr = descr;
		this.datef = datef;
		this.montantf = montantf;
		this.num_femetteur = num_femetteur;
		this.num_frecepteur = num_frecepteur;
		this.client = client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	private String num_femetteur ;
	private String num_frecepteur ;
	
	@ManyToOne
	@JoinColumn(name="Numero")
	private Client client;
	
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getId_facture() {
		return id_facture;
	}
	public void setId_facture(Long id_facture) {
		this.id_facture = id_facture;
	}
	                                                                                                                                                                                                 public String getDecr() {
		return descr;
	}
	public void setDecr(String decr) {
		this.descr = decr;
	}
	public Date getDatef() {
		return datef;
	}
	public void setDatef(Date datef) {
		this.datef = datef;
	}
	public int getMontantf() {
		return montantf;
	}
	public void setMontantf(int montantf) {
		this.montantf = montantf;
	}
	public String getNum_femetteur() {
		return num_femetteur;
	}
	public void setNum_femetteur(String num_femetteur) {
		this.num_femetteur = num_femetteur;
	}
	public String getNum_frecepteur() {
		return num_frecepteur;
	}
	public void setNum_frecepteur(String num_frecepteur) {
		this.num_frecepteur = num_frecepteur;
	}
	


}
