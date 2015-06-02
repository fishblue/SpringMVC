package season.springmvc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import season.springmvc.dao.UserDAO;
import season.springmvc.model.User;
import season.springmvc.service.UserService;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
    private UserDAO userDAO;
	
	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}

}
