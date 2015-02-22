package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="quiz")
@DynamicInsert
@DynamicUpdate
public class Quiz {

	private Integer quizNo;
	private String classId;
	private String courseId;
	private byte[] file;
	private Date startTime;
	private Date endTime;
	
	@Id
	@Column(name="quizNo")
	public Integer getQuizNo() {
		return quizNo;
	}
	
	@Column(name="classId")
	public String getClassId() {
		return classId;
	}
	
	@Column(name="courseId")
	public String getCourseId() {
		return courseId;
	}
	
	@Column(name="file")
	public byte[] getFile() {
		return file;
	}
	
	@Column(name="startTime")
	public Date getStartTime() {
		return startTime;
	}
	
	@Column(name="endTime")
	public Date getEndTime() {
		return endTime;
	}
	
	public void setQuizNo(Integer quizNo) {
		this.quizNo = quizNo;
	}
	
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public void setFile(byte[] file) {
		this.file = file;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
}
