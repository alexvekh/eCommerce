package com.boocrun.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import com.boocrun.domain.User;


@Entity
public class Authority implements GrantedAuthority
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 152042578548697142L;
	private Long id;
	private User user;
	private String role;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getAuthority() {
		return role;
	}
	
	@ManyToOne
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	public void setAuthority(String role) {
		this.role = role;
	}

}
