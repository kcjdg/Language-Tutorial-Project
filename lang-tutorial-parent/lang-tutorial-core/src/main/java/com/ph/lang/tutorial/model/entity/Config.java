package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="config")
@DynamicUpdate
public class Config {

	private String name;
	private byte[] file;
	private Date createTime;
	private Date updateTime;
	private Boolean flag;
	
	@Id
	@Column(name="file")
	public String getName() {
		return name;
	}
	
	@Column(name="file")
	public byte[] getFile() {
		return file;
	}

	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}

	@Column(name="updateTime")
	public Date getUpdateTime() {
		return updateTime;
	}
	
	@Column(name="flag")
	public Boolean getFlag() {
		return flag;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

}
