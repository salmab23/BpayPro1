package org.sid.entities;

import javax.persistence.Entity;

@Entity
public class SSD extends Client{

protected int Pt_fidelites;

public int getPt_fidelites() {
	return Pt_fidelites;
}

public void setPt_fidelites(int pt_fidelites) {
	Pt_fidelites = pt_fidelites;
}

public SSD() {
	super();
	// TODO Auto-generated constructor stub
	
}


}
