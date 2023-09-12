package com.simplilearn.addmiportal;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="teacherdetail")
public class teacherdetail {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="tid")
	private int tid;
	@Column(name="teacher name")
	private String tname;
	@Column(name="subject name")
	private String subname;
	
	@ManyToMany(mappedBy="teacherdetail")
	Set<classlist>class_table;
	
	
	
	public teacherdetail() {
		super();
		
	}
	public teacherdetail(String tname, String subname) {
		super();
		this.tname = tname;
		this.subname = subname;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	
	public Set<classlist> getClass_table() {
		return class_table;
	}
	public void setClass_table(Set<classlist> class_table) {
		this.class_table = class_table;
	}
	public void setclasslists(Set<classlist> accs1) {
		// TODO Auto-generated method stub
		
	}

}
