package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="class")
@DynamicInsert
@DynamicUpdate
public class Class{

	private String classId;
	private String lessonId;
	private String teacherId;
	private String courseId;
	private Date startTime;
	private Date endTime;
	private Boolean flag;
	private String remarks;
	
	@Id
	@Column(name="classId")
	public String getClassId() {
		return classId;
	}
	
	@Column(name="lessonId")
	public String getLessonId() {
		return lessonId;
	}
	
	@Column(name="teacherId")
	public String getTeacherId() {
		return teacherId;
	}
	
	@Column(name="courseId")
	public String getCourseId() {
		return courseId;
	}
	
	@Column(name="startTime")
	public Date getStartTime() {
		return startTime;
	}
	
	@Column(name="endTime")
	public Date getEndTime() {
		return endTime;
	}
	
	@Column(name="flag")
	public Boolean getFlag() {
		return flag;
	}
	
	@Column(name="remarks")
	public String getRemarks() {
		return remarks;
	}
	
	public void setClassId(String classId) {
		this.classId = classId;
	}
	
	public void setLessonId(String lessonId) {
		this.lessonId = lessonId;
	}
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
