package season.springmvc.dao;

import java.util.List;

import season.springmvc.model.User;

/**
 * �û���Ϣ��Ĳ���
 * @author Administrator
 *
 */
public interface UserDAO {
	public int insertUser(User user);
	public List<User> selectUserByName();
}
