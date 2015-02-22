package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="course")
@DynamicInsert
@DynamicUpdate
public class Course{

	private String courseId;
	private String courseName;
	private String courseDesc;
	private Integer durationHours;
	private Date createTime;
	private Boolean flag;
	
	@Id
	@Column(name="courseId")
	public String getCourseId() {
		return courseId;
	}

	@Column(name="courseName")
	public String getCourseName() {
		return courseName;
	}

	@Column(name="courseDesc")
	public String getCourseDesc() {
		return courseDesc;
	}
	
	@Column(name="durationHours")
	public Integer getDurationHours() {
		return durationHours;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="flag")
	public Boolean getFlag() {
		return flag;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}
	
	public void setDurationHours(Integer durationHours) {
		this.durationHours = durationHours;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	
}
