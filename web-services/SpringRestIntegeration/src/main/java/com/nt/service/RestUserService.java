package com.nt.service;

import com.nt.domain.RestUser;

public interface RestUserService {
	
	public boolean add(RestUser user);
	public RestUser get(String uid);
	public boolean update(String uid,RestUser user);
	public boolean delete(String uid);
}
