package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "lesson")
@DynamicInsert
@DynamicUpdate
public class Lesson{

	private String lessonId;
	private String teacherId;
	private String courseId;
	private String content;
	private Date createTime;
	private String remarks;
	
	
	@Id
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
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}

	@Column(name="content")
	public String getContent() {
		return content;
	}
	
	@Column(name="remarks")
	public String getRemarks() {
		return remarks;
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
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
	
}
