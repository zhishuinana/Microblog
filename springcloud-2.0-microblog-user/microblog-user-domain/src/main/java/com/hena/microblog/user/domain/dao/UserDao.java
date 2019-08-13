/**
 * 
 */
package com.hena.microblog.user.domain.dao;

import com.hena.microblog.user.domain.entity.Users;

/**
 * @author hena
 *
 */
public interface UserDao {
	/**
     * 查询所有用户信息
     *
     * @return
     */
    public Users getUsers(Integer id);
}
