package com.ejemplo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "datos")
public class datos {

	@Id
	@Column(name = "userid")
	private int userID;
	@Column(name = "username")
	private String userName;
	@Column(name = "userpassword")
	private String userpassword;

	public datos() {
		
	}

	public datos(String userName, String userpassword) {
		super();
		this.userName = userName;
		this.userpassword = userpassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpassword() {
		return userpassword;
	}
}
