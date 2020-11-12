package cn.gsdx.text;

import cn.gsdx.dao.imp.UserDaoMysqlImp;
import cn.gsdx.dao.imp.UserDaoOrcalImp;
import cn.gsdx.service.UserService;
import cn.gsdx.service.imp.UserServiceImp;

public class Text {
    public static void main(String[] args) {
        UserServiceImp userService = new UserServiceImp();
        userService.setUserDao(new UserDaoMysqlImp());
        userService.getUser();
        System.out.println("---------------");
        userService.setUserDao(new UserDaoOrcalImp());
        userService.getUser();
    }
}
