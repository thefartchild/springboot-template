package com.adtech.data.entity;

/**
 * @author ：wx
 * @date ：2020/1/7 16:33
 * @description：
 */
public class User extends Entity{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public String getTableName() {
        return "user";
    }

    @Override
    public String getPrimaryKey() {
        return null;
    }
}
