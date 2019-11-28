package com.ustglobal.jpawithibernatewebapp.manytone;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table
public class PencilBox {
	
	@Id
	@Column
	private int pbId;
	
	@Column
	private String pbName;
	
	@Exclude
	@OneToMany(mappedBy = "pBox")
	private List<Pencil> pencil;
	
}
