/**
 * 
 */
package com.hena.microblog.user.domain.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.hena.microblog.user.domain.dao.UserDao;
import com.hena.microblog.user.domain.entity.Users;
import com.hena.microblog.user.domain.utils.MybatisSessionUtil;

/**
 * @author hena
 *
 */
@Repository
public class UserDaoImpl implements UserDao {
	
	public SqlSession sqlSession = MybatisSessionUtil.getSession();
	@Override
	public Users getUsers(Integer id) {
		return sqlSession.selectOne("MyMapper.selectUser", id);
	}

}
