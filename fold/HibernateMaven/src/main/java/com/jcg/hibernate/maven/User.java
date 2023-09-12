package com.jcg.hibernate.maven;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="user_table")
public class User {
	@Id
	@Column(name="user_id")
 private int userid;
	@Column(name="user_name")
 private String username;
	@Column(name="create_By")
 private String createdBy;
	@Column(name="creat_date")
 private String createdate;
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public void setCreatedDate(Date date) {
		// TODO Auto-generated method stub
		
	}
	
}



