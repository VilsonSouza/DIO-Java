package com.eumemu.repository;

import org.springframework.data.

import org.springframework.stereotype.Repository;

import com.eumemu.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	public void deletaDados() {
		System.out.println("Apagando dados");
	}

}
