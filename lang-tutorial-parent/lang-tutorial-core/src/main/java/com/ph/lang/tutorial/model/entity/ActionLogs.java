package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name="action_logs")
@DynamicInsert
public class ActionLogs {

	private String actionLogs;
	private String identity;
	private Date createTime;
	
	@Id
	@Column(name="action")
	public String getActionLogs() {
		return actionLogs;
	}
	
	@Column(name="identity")
	public String getIdentity() {
		return identity;
	}
	
	@Column(name="createTime")
	public Date getCreateTime() {
		return createTime;
	}
	
	public void setActionLogs(String actionLogs) {
		this.actionLogs = actionLogs;
	}
	
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
}
