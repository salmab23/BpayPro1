package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Niveau implements Serializable{
	@Id  @GeneratedValue
	private Long id_niveau;
	
	@OneToMany(mappedBy="niveau")
	
	private Collection <Client> Clients;
	@OneToMany(mappedBy="niveau") 
	private Collection <Service> service;
	
	@ManyToOne
	@JoinColumn(name="id_niveaucp")
	private Client_pro client_pron;
	public Niveau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId_niveau() {
		return id_niveau;
	}

	public void setId_niveau(Long id_niveau) {
		this.id_niveau = id_niveau;
	}

	public Collection<Client> getClients() {
		return Clients;
	}

	public void setClients(Collection<Client> clients) {
		Clients = clients;
	}

	public Collection<Service> getService() {
		return service;
	}

	public void setService(Collection<Service> service) {
		this.service = service;
	}

	public Client_pro getClient_pron() {
		return client_pron;
	}

	public void setClient_pron(Client_pro client_pron) {
		this.client_pron = client_pron;
	}
	
	
	
}
