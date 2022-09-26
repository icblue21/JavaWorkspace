package me.oop.DAOPractice.domain.userinfo.dao.oracle;

import me.oop.DAOPractice.domain.userinfo.Userinfo;
import me.oop.DAOPractice.domain.userinfo.dao.UserinfoDao;

public class UserInfoOracleDao implements UserinfoDao {
    @Override
    public void insertUserInfo(Userinfo userinfo) {
        System.out.println("Insert into Oracle DB userID = " + userinfo.getUserID());
    }

    @Override
    public void updateUserInfo(Userinfo userinfo) {
        System.out.println("Update into Oracle DB userID = " + userinfo.getUserID());
    }

    @Override
    public void deleteUserInfo(Userinfo userinfo) {
        System.out.println("Delete from Oracle DB userID = " + userinfo.getUserID());
    }
}
