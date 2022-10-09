package com.boocrun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.boocrun.domain.User;
import com.boocrun.repository.UserRepository;
import com.boocrun.security.CustomUserDetails;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDetails loadUserByUsername (String email) throws UsernameNotFoundException
	{
		User user = userRepo.findByEmail(email);

		if (user == null)
			throw new UsernameNotFoundException("User with email: " + email + "was not found.");
		
		return new CustomUserDetails(user);
	}

}
