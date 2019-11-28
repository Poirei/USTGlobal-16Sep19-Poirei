package com.ustglobal.jpawithibernatewebapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class Course {
	
	@Id
	@Column(name = "cid")
	private int cId;
	
	@Column(name = "cname")
	private String cName;
	
	@Exclude
	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "courses")
	private List<Student> student;
	
}
