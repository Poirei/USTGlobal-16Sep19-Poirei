package com.ustglobal.jpawithibernatewebapp.onetone;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class VoterCard {
	
	@Id
	@Column(name = "vid")
	private int vId;
	
	@Column(name = "vname")
	private String vName;
	
	@Exclude
	@OneToOne(mappedBy = "voterCard")
	private Person person;
	
}
