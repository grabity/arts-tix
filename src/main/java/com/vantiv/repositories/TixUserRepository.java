package com.vantiv.repositories;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.vantiv.model.TixUser;

public interface TixUserRepository extends Repository<TixUser, Long> {

	public List<TixUser> findAll();
	public TixUser findById(Long id);
}
