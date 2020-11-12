package cn.gsdx.service.impl;

import cn.gsdx.dao.UserDao;
import cn.gsdx.service.UserService;

public class UserServiceImp implements UserService {
	
	private UserDao userDao = null;
	public void setUserDao(UserDao userDao){
		this.userDao = userDao ;
	}

	@Override
	public void getUser() {
		// TODO Auto-generated method stub
		userDao.getUser();
	}

}
