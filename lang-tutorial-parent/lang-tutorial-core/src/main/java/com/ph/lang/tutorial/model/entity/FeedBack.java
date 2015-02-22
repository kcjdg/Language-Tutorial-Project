package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="feedback")
@DynamicInsert
public class FeedBack {
	
	private String classId;
	private String from;
	private String to;
	private Date createTime;
	
	@Id
	@Column(name="classId")
	public String getClassId() {
		return classId;
	}
	
	@Column(name="from")
	public String getFrom() {
		return from;
	}
	
	@Column(name="to")
	public String getTo() {
		return to;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
