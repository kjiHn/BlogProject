package com.gblog.service;

import java.util.List;

import com.gblog.dto.ProfileDTO;
import com.gblog.dto.UserDTO;

public interface ProfileService {
	public void write(ProfileDTO pdto) throws Exception;
	
	public ProfileDTO read(String user_id) throws Exception;
	
	public void modify(ProfileDTO pdto) throws Exception;
	
	public void remove(String user_id) throws Exception;
	
	public List<ProfileDTO> list() throws Exception;
	
	public void insert(ProfileDTO pdto) throws Exception;
	
}
