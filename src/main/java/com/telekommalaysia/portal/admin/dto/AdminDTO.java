package com.telekommalaysia.portal.admin.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.telekommalaysia.portal.admin.persist.entity.Permissions;
import com.telekommalaysia.portal.admin.persist.entity.PublicUser;
import com.telekommalaysia.portal.admin.persist.entity.Roles;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminDTO {

	private Integer id;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private String password;
	
	private String sAMAccountName;
	
	public String getsAMAccountName() {
		return sAMAccountName;
	}

	public void setsAMAccountName(String sAMAccountName) {
		this.sAMAccountName = sAMAccountName;
	}

	private String name;

	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date lastLogonF;

	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date lastModifiedF;

	private String lastModifiedBy;

	private boolean status;

	private Set<Roles> roles;

	private List<String> permissions = new ArrayList<>();
	
	private String sessionToken;
	
	private boolean superAdmin;

	public boolean isSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(boolean superAdmin) {
		this.superAdmin = superAdmin;
	}

	public String getSessionToken() {
		return sessionToken;
	}

	public void setSessionToken(String sessionToken) {
		this.sessionToken = sessionToken;
	}


	public Set<Roles> getRoles() {
		return roles;
	}

	public void setRoles(Set<Roles> roles) {
		this.roles = roles;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Date getLastLogonF() {
		return lastLogonF;
	}

	public void setLastLogonF(Date lastLogonF) {
		this.lastLogonF = lastLogonF;
	}

	public Date getLastModifiedF() {
		return lastModifiedF;
	}

	public void setLastModifiedF(Date lastModifiedF) {
		this.lastModifiedF = lastModifiedF;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static AdminDTO convertUserObject(PublicUser user) {
		AdminDTO dto = new AdminDTO();
		dto.setFirstName(user.getFirstName());
		dto.setLastName(user.getLastName());
		dto.setEmail(user.getEmail());
		return dto;
	}

	public List<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}

}
