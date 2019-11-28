package com.ustglobal.jpawithibernatewebapp.onetone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Person {
	
	@Id
	@Column(name = "pid")
	private int pId;
	
	@Column(name = "pname")
	private String pName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "vid")
	private VoterCard voterCard;
	
}
