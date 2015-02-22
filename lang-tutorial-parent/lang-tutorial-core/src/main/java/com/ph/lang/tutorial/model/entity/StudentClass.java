package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "student_class")
@DynamicInsert
@DynamicUpdate
public class StudentClass {

	private String teacherId;
	private Date createTime;
	private String content;
	private Boolean flag;
	
	
	@Id
	@Column(name="teacherId")
	public String getTeacherId() {
		return teacherId;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="content")
	public String getContent() {
		return content;
	}
	
	@Column(name="flag")
	public Boolean getFlag() {
		return flag;
	}
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}
