package me.oop.DAOPractice.userinfo.web;

import me.oop.DAOPractice.domain.userinfo.Userinfo;
import me.oop.DAOPractice.domain.userinfo.dao.UserinfoDao;
import me.oop.DAOPractice.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import me.oop.DAOPractice.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        Userinfo userinfo = new Userinfo();
        userinfo.setUserID("1234");
        userinfo.setUserName("Kim");
        userinfo.setPassword("123123");

        UserinfoDao userinfoDao = null;

        if( dbType.equals("ORACLE")){
            userinfoDao = new UserInfoOracleDao();
        } else if( dbType.equals("MYSQL")){
            userinfoDao = new UserInfoMySqlDao();
        } else {
            System.out.println("db error");
        }

        userinfoDao.insertUserInfo(userinfo);
        userinfoDao.updateUserInfo(userinfo);
        userinfoDao.deleteUserInfo(userinfo);


    }
}
