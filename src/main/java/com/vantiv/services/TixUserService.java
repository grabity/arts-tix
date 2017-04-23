package com.vantiv.services;

import java.util.List;

import com.vantiv.model.TixUser;

public interface TixUserService {

	public List<TixUser> findAll();
	
	public TixUser findById(Long tixUserId);
}
