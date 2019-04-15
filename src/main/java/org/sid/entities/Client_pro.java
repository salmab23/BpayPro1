package org.sid.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Client_pro extends Client{
protected String Radical;

public String getRadical() {
	return Radical;
}

public void setRadical(String radical) {
	Radical = radical;
}

@OneToMany(mappedBy="client_proc")
private Collection<Chargement> chargements;

@OneToMany(mappedBy="client_pron")
private Collection<Niveau> niveaux;




public Client_pro() {
	super();
	// TODO Auto-generated constructor stub
}


}
