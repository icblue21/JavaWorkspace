package me.oop.DAOPractice.domain.userinfo.dao.mysql;

import me.oop.DAOPractice.domain.userinfo.Userinfo;
import me.oop.DAOPractice.domain.userinfo.dao.UserinfoDao;

public class UserInfoMySqlDao implements UserinfoDao {
    @Override
    public void insertUserInfo(Userinfo userinfo) {
        System.out.println("Insert into MySQL DB userID = " + userinfo.getUserID());
    }

    @Override
    public void updateUserInfo(Userinfo userinfo) {
        System.out.println("Update into MySQL DB userID = " + userinfo.getUserID());
    }

    @Override
    public void deleteUserInfo(Userinfo userinfo) {
        System.out.println("Delete from MySQL DB userID = " + userinfo.getUserID());
    }
}
