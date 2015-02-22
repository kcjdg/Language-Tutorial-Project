package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="student")
@DynamicInsert
@DynamicUpdate
public class Student{

	private String studentId;
	private String email;
	private String rating;
	private String levels;
	private Date createTime;
	private Date updateTime;
	
	@Id
	@Column(name="studentId")
	public String getStudentId() {
		return studentId;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	
	@Column(name="rating")
	public String getRating() {
		return rating;
	}
	
	@Column(name="level")
	public String getLevels() {
		return levels;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="updateTime")
	public Date getUpdateTime() {
		return updateTime;
	}
	
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setLevels(String levels) {
		this.levels = levels;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

		
	
}
