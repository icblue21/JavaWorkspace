package me.oop.DAOPractice.domain.userinfo.dao;

import me.oop.DAOPractice.domain.userinfo.Userinfo;

public interface UserinfoDao {

    void insertUserInfo(Userinfo userinfo);
    void updateUserInfo(Userinfo userinfo);
    void deleteUserInfo(Userinfo userinfo);
}
