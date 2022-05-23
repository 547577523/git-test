package org.example.entity;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

public class Users {
    private String userID;

    private String passWord;


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }



    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }



    public Users() {
    }

    public Users(String userID,String passWord) {
        this.userID = userID;

        this.passWord = passWord;

    }
}