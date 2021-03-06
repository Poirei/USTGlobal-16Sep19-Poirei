package com.ustglobal.jpawithibernatewebapp.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table
public class Student {
	
	@Id
	@Column(name = "sid")
	private int sId;

	@Column(name = "sname")
	private String sName;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Student_Course", joinColumns = @JoinColumn(name = "sid"),
	inverseJoinColumns = @JoinColumn(name = "cid"))
	private List<Course> courses;

}
