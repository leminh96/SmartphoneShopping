package com.leminh.dao.Impl;

import java.util.List;
import com.leminh.dao.UserInfoDAO;
import com.leminh.entity.User;
import com.leminh.model.UserInfo;
import com.leminh.mapper.UserInfoMapper;
import javax.sql.DataSource;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserInfoDAOImpl extends JdbcDaoSupport implements UserInfoDAO {
	@Autowired
    private SessionFactory sessionFactory;
	@Autowired
    public UserInfoDAOImpl(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
  
    @Override
    public UserInfo findUserInfo(String userName) {
        String sql = "Select u.username,u.password"
                + " from users u where u.username = ? ";
        Object[] params = new Object[] { userName };
        UserInfoMapper mapper = new UserInfoMapper();
        try {
            UserInfo userInfo = this.getJdbcTemplate().queryForObject(sql, params, mapper);
            return userInfo;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }
 
    @Override
    public List<String> getUserRoles(String userName) {
        String sql = "Select r.user_role "
                + " from user_roles r where r.username = ? ";        
        Object[] params = new Object[] { userName };     
        List<String> roles = this.getJdbcTemplate().queryForList(sql, params, String.class);        
        return roles;
    }
    
    @Override
    public User findUserByUsername(String userName) {
    	Session session = sessionFactory.getCurrentSession();
    	Criteria crit = session.createCriteria(User.class);
    	crit.add(Restrictions.eq("userName", userName));      
        return (User) crit.uniqueResult();
    }
}
