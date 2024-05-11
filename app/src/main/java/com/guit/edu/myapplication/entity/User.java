package com.guit.edu.myapplication.entity;

import cn.bmob.v3.BmobObject;

public class User extends BmobObject {
    String Nickname;  //昵称
    String Signature;  //个性签名
    String Gender;  //性别
    String Username;  //账号
    String Password;  //密码
    int Assignment;  //饮水目标
    int Height;  //身高
    int Weight;  //体重
    int Cupcapacity;  //杯子容量

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getAssignment() {
        return Assignment;
    }

    public void setAssignment(int assignment) {
        Assignment = assignment;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getCupcapacity() {
        return Cupcapacity;
    }

    public void setCupcapacity(int cupcapacity) {
        Cupcapacity = cupcapacity;
    }
}