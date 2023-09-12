package com.jcg.hibernate.maven;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="class_imf")
public class classess {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="cid")
	private int cid;//class id number
	@Column(name="cname")
	private String cname;//class name
	
	
	@CollectionOfElements
	@JoinTable(name= "student",joinColumns=@JoinColumn(name="cid"))
	@IndexColumn(name="stnumber")
	@Column(name="student")
	private List<Integer> student;
	

}
