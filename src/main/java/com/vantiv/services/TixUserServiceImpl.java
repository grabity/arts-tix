package com.vantiv.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vantiv.model.TixUser;
import com.vantiv.repositories.TixUserRepository;

@Service
public class TixUserServiceImpl implements TixUserService {
	private static Map<Long,TixUser> userMap = new HashMap<Long,TixUser>();
	{
		TixUser tixUser1 = new TixUser();
		tixUser1.setId(113080425918691L);
		tixUser1.setUserName("Al Bob Jim");
		tixUser1.setEmail("al_xeccctp_jim@tfbnw.net");
		userMap.put(tixUser1.getId(), tixUser1);

		TixUser tixUser2 = new TixUser();
		tixUser2.setId(101394593760993L);
		tixUser2.setUserName("Joe Rich Hill");
		tixUser2.setEmail("joe_ynemkzh_hill@tfbnw.net");
		userMap.put(tixUser2.getId(), tixUser2);

		TixUser tixUser3 = new TixUser();
		tixUser3.setId(111709336056896L);
		tixUser3.setUserName("Parvin Lee Bob");
		tixUser3.setEmail("parvin_hlppilv_bob@tfbnw.net");
		userMap.put(tixUser3.getId(), tixUser3);

		TixUser tixUser4 = new TixUser();
		tixUser4.setId(109938419568697L);
		tixUser4.setUserName("Open Graph Test User");
		tixUser4.setEmail("open_vhjarfr_user@tfbnw.net");
		userMap.put(tixUser4.getId(), tixUser4);
	}
	@Autowired
	private TixUserRepository tixUserRepository;

	public List<TixUser> findAll() {
		List<TixUser> tixUsers = new ArrayList<TixUser>();
		tixUsers.addAll(userMap.values());
		
		tixUsers.addAll(tixUserRepository.findAll());
			
		return tixUsers;
	};
	
	public TixUser findById(Long tixUserId) {
		return userMap.get(tixUserId);
	}
}
