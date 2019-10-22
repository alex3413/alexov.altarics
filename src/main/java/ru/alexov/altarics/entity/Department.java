package ru.alexov.altarics.entity;

import java.util.Date;

public class Department {
	int id;
	int subid;
	private String depName;
	private Date createdate;
	Department subdeaprtment;
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
}
