package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="inquiry")
@DynamicInsert
public class Inquiry {

	private String email;
	private String subject;
	private String message;
	private String skype;
	private String country;
	private String name;
	private Date createTime;
	
	@Id
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	
	@Column(name="subject")
	public String getSubject() {
		return subject;
	}
	
	@Column(name="message")
	public String getMessage() {
		return message;
	}
	
	@Column(name="skype")
	public String getSkype() {
		return skype;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	
	@Column(name="name")
	public String getName() {
		return name;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setSkype(String skype) {
		this.skype = skype;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
