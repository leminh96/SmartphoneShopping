package com.leminh.dao;

import java.util.List;
import com.leminh.model.UserInfo;
import com.leminh.entity.User;

public interface UserInfoDAO {
	public UserInfo findUserInfo(String userName);
    public List<String> getUserRoles(String userName);
    public User findUserByUsername(String userName);
}
