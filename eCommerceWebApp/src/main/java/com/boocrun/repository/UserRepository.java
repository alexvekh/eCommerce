package com.boocrun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.boocrun.domain.User;

public interface UserRepository extends JpaRepository<User, Long>
{
	public User findByEmail (@Param(value="email") String email);
}
