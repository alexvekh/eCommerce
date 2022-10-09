package com.boocrun.security;

import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.security.core.userdetails.UserDetails;

import com.boocrun.domain.User;

public class CustomUserDetails extends User implements UserDetails {
	
	private static final long serialVersionUID = 1394266711296237603L;

	public CustomUserDetails (User user){
		BeanUtils.copyProperties(user, this);
		/* =
		this.setAuthorities(user.getAuthorities());
		this.setCart(user.getCart());
		this.setEmail(user.getEmail());
		this.setId(user.getId());
		this.setPassword(user.getPassword());
		this.setProducts(user.getProducts());
		this.setReviews(user.getReviews());
		*/

	}
	
	@Override
	public Set<Authority> getAuthorities() {
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		return super.getPassword();
	}
	
	@Override
	public String getUsername() {
		return super.getEmail();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
