package season.springmvc.dao;

import java.util.List;

import season.springmvc.model.User;

/**
 * 用户信息表的操作
 * @author Administrator
 *
 */
public interface UserDAO {
	public int insertUser(User user);
	public List<User> selectUserByName();
}
