package com.ph.lang.tutorial.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="billling")
@DynamicInsert
@DynamicUpdate
public class Billing{
	
	private String billNo;
	private String studentId;
	private Date createTime;
	private Double amount;
	private Boolean isPaid;
	private String paymentMethod;
	private String remarks;
	private Boolean flag;
	
	@Id
	@Column(name="billNo")
	public String getBillNo() {
		return billNo;
	}
	
	@Column(name="studentId")
	public String getStudentId() {
		return studentId;
	}
	
	@Column(name="amount")
	public Date getCreateTime() {
		return createTime;
	}
	
	@Column(name="isPaid")
	public Double getAmount() {
		return amount;
	}
	
	@Column(name="paymentMethod")
	public Boolean getIsPaid() {
		return isPaid;
	}
	
	@Column(name="remarks")
	public String getPaymentMethod() {
		return paymentMethod;
	}
	
	@Column(name="flag")
	public String getRemarks() {
		return remarks;
	}
	
	public Boolean getFlag() {
		return flag;
	}
	
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}

}
