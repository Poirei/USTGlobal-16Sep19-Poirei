package com.ustglobal.jpawithibernatebookapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Books {
	
	@Id
	@Column(name = "bid")
	private int bId;
	
	@Column(name = "isbn_no")
	private long isbnNo;
	
	@Column
	private String name;
	
	@Column
	private String author;
	
	
	
}
