package org.example.entity;

public class Users {
    private String userID;
    private String userName;
    private String passWord;
    private String sex;
    private String email;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Users() {
    }

    public Users(String userID, String userName, String passWord, String sex, String email) {
        this.userID = userID;
        this.userName = userName;
        this.passWord = passWord;
        this.sex = sex;
        this.email = email;
    }
}