package com.xworkz.application.app.dto;

import java.io.Serializable;

public class ApplicationDto implements Serializable{
	private int id;
	private String name;
	private String devolpedBy;
	private String devolpedAt;
	private String version;
	
	public ApplicationDto(int id, String name, String devolpedBy, String devolpedAt, String version) {
		super();
		this.id = id;
		this.name = name;
		this.devolpedBy = devolpedBy;
		this.devolpedAt = devolpedAt;
		this.version = version;
	}

	public ApplicationDto() {
		super();
	}

	@Override
	public String toString() {
		return "ApplicationDto [id=" + id + ", name=" + name + ", devolpedBy=" + devolpedBy + ", devolpedAt="
				+ devolpedAt + ", version=" + version + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDevolpedBy() {
		return devolpedBy;
	}

	public void setDevolpedBy(String devolpedBy) {
		this.devolpedBy = devolpedBy;
	}

	public String getDevolpedAt() {
		return devolpedAt;
	}

	public void setDevolpedAt(String devolpedAt) {
		this.devolpedAt = devolpedAt;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
}
