package com.ph.lang.tutorial.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name = "quiz_result")
@DynamicUpdate
public class QuizResult {

	private String quizNo;
	private String studentId;
	private Integer score;
	private Integer failOrPass;
	
	@Id
	@Column(name="quizNo")
	public String getQuizNo() {
		return quizNo;
	}
	
	@Column(name="studentId")
	public String getStudentId() {
		return studentId;
	}
	
	@Column(name="score")
	public Integer getScore() {
		return score;
	}
	
	@Column(name="failOrPass")
	public Integer getFailOrPass() {
		return failOrPass;
	}
	
	public void setQuizNo(String quizNo) {
		this.quizNo = quizNo;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setScore(Integer score) {
		this.score = score;
	}
	
	public void setFailOrPass(Integer failOrPass) {
		this.failOrPass = failOrPass;
	}

}
