package com.study.example.entity.user;

/**
 * @program: example
 * @description: entity
 * @author: Hui.Wang
 * @Time: $
 * @create: 2019-05-02 22:50
 **/
public class User {

    public int Id;
    public String userName;
    public String address;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "user{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
