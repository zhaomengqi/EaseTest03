package com.ease.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class UserTest{

	@Id
	private Long UserId;
	
	@Size(min=2,max=50)
	private String Username;
	
	@Size(min=3,max=50)
	private String Email;
	
	@Size(min=2,max=50)
	private String Password;
	
	@Column(name="RoleId",columnDefinition="varchar(50) default 0")
	private String RoleId;
	

	public Long getUserId() {
		return UserId;
	}

	public String getRoleId() {
		return RoleId;
	}

	public void setRoleId(String roleId) {
		RoleId = roleId;
	}

	public void setUserId(Long userId) {
		UserId = userId;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
}
