package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.ph.lang.tutorial.enums.Role;

@Entity
@Table(name="user")
@DynamicInsert
@DynamicUpdate
public class User {

	
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String skype;
	private Role role;
	private Boolean flag;
	private String number;
	private Date birthday;
	private String country;
	private Date createTime;
	private Date updateTime;
	
	@Id
	@Column(name="email")
	public String getEmail() {
		return email;
	}
	
	@Column(name="password")
	public String getPassword() {
		return password;
	}
	
	@Column(name="firstname")
	public String getFirstName() {
		return firstName;
	}
	
	@Column(name="lastname")
	public String getLastName() {
		return lastName;
	}
	
	@Column(name="skype")
	public String getSkype() {
		return skype;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name="role")
	public Role getRole() {
		return role;
	}
	
	@Column(name="flag")
	public Boolean getFlag() {
		return flag;
	}
	
	@Column(name="number")
	public String getNumber() {
		return number;
	}
	
	@Column(name="birthday")
	public Date getBirthday() {
		return birthday;
	}
	
	@Column(name="country")
	public String getCountry() {
		return country;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="updateTime")
	public Date getUpdateTime() {
		return updateTime;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setSkype(String skype) {
		this.skype = skype;
	}
	
	public void setRole(Role role) {
		this.role = role;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	
	
}
