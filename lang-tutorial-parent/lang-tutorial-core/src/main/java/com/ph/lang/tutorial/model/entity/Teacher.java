package com.ph.lang.tutorial.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="teacher")
@DynamicInsert
@DynamicUpdate
public class Teacher{

	private String teacherId;
	private String email;
	private Double baseSalary;
	private String rating;
	private byte[] profilePic;
	private String background;
	
	
	@Id
	@Column(name="teacherId")
	public String getTeacherId() {
		return teacherId;
	}
	
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	
	@Column(name="baseSalary")
	public Double getBaseSalary() {
		return baseSalary;
	}
	
	@Column(name="rating")
	public String getRating() {
		return rating;
	}
	
	@Column(name="profilePic",columnDefinition="blob")
	public byte[] getProfilePic() {
		return profilePic;
	}
	
	@Column(name="background")
	public String getBackground() {
		return background;
	}
	
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	
	public void setBackground(String background) {
		this.background = background;
	}
	
	
	
}
