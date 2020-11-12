package cn.gsdx.service.imp;

import cn.gsdx.dao.UserDao;
import cn.gsdx.service.UserService;

public class UserServiceImp implements UserService{
//     UserDao userDao= new UserDaoMysqlImp();  这里程序依然没有摆脱 对象的依赖  而ioc的原理就是解耦
    UserDao userDao = null ;
    public void  setUserDao(UserDao userDao){
        this.userDao = userDao;
    }
    public void getUser() {
        userDao.getUser();
    }
}
