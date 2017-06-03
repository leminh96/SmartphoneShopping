package com.leminh.dao;

import java.util.List;
import com.leminh.model.UserInfo;

public interface UserInfoDAO {
	public UserInfo findUserInfo(String userName);
    public List<String> getUserRoles(String userName);
}
