/**
 * 
 */
package com.hena.microblog.user.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hena.microblog.user.domain.dao.UserDao;
import com.hena.microblog.user.domain.entity.Users;

/**
 * @author hena
 *
 */
@RestController
public class UserController {
	@Autowired
	private UserDao userDao;
	@RequestMapping("/getUserById")
	public Users getUserById(Integer userid) {
		return userDao.getUsers(userid);
	}
}
