package com.simplilearn.addmiportal;


import java.util.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name= "class_table")
public class classlist {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "class name")
	private String name_of_class;
	@Column(name = "students name")
	private List<String> students_of_class;
	
	
	
	@ManyToMany
	//@JoinTable(name = "class_teacher", joinColumns =@JoinColumn(name = "id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "tid", referencedColumnName = "tid"))
	Set<teacherdetail> teacherdetail;// ***

	
	
	
	public classlist() {
		super();
		// TODO Auto-generated constructor stub
	}

	public classlist(String name_of_class, List students_of_class) {
		super();
		this.name_of_class = name_of_class;
		this.students_of_class = students_of_class;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName_of_class() {
		return name_of_class;
	}

	public void setName_of_class(String name_of_class) {
		this.name_of_class = name_of_class;
	}

	

	

	public List<String> getStudents_of_class() {
		return students_of_class;
	}

	public void setStudents_of_class(List<String> students_of_class) {
		this.students_of_class = students_of_class;
	}

	public Set<teacherdetail> getTeacherdetail() {
		return teacherdetail;
	}

	public void setTeacherdetail(Set<teacherdetail> teacherdetail) {
		this.teacherdetail = teacherdetail;
	}
	

}
