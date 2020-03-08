package com.nt.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.nt.domain.RestUser;


@Service("service")
public class RestUserServiceImpl implements RestUserService {

	public RestUserServiceImpl() {
		System.out.println("Service class");
	}
	
	private static Map<Integer,RestUser>map=new HashMap();
	@Override
	public boolean add(RestUser user) {
		if(map.containsKey(user.getUid())) {
			return false;
		}
		else {
			map.put(user.getUid(),user);
			return true;
		}
	}

	@Override
	public RestUser get(String uid) {
		RestUser user=new RestUser();
		user.setUid(101);
		user.setUname("wasim");
		user.setGender("male");
		user.setEmail("wasim@91");
		map.put(101, user);
		if(map.containsKey(Integer.parseInt(uid))) {
			return user;
		}
		return null;
	}

	@Override
	public boolean update(String uid, RestUser user) {
		if(map.containsKey(Integer.parseInt(uid))) {
			user.setEmail("wasim@91");
			user.setUname("wasim");
			map.put(Integer.parseInt(uid), user);
			return true;
		}
		return false;
	}

	@Override
	public boolean delete(String uid) {
		RestUser user=new RestUser();
		user.setUid(102);
		user.setUname("wasim haider");
		user.setGender("male");
		user.setEmail("wasim@91");
		map.put(101, user);
		if(map.containsKey(Integer.parseInt(uid))) {
			map.remove(map.get(Integer.parseInt(uid)));
			return true;
		}
		return false;
	}

}
