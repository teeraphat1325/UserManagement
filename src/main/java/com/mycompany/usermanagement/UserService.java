/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagement;

import java.util.ArrayList;

/**
 *
 * @author teeraphat
 */
public class UserService {

    private static ArrayList<User> userList = new ArrayList<>();
    private static int lastid = 1;

    public static User addUser(User newUser) {
        newUser.setId(lastid++);
        userList.add(newUser);
        return newUser;

    }

    public static ArrayList<User> getUsers() {
        return userList;
    }

    public static User getUser(int index) {
        return userList.get(index);
    }

    public static User getUserById(int id) {
        for (User u : userList) {
            if (u.getId() == id) {
                return u;
            }
        }
        return null;
    }

    public static int getSize() {
        return userList.size();
    }

    public static User updateUser(int index, User user) {
        userList.set(index, user);
        return user;
    }

    public static User deleteUser(int index) {
        return userList.remove(index);
    }

    public static void printList() {
        ArrayList<User> list = UserService.getUsers();
        for (User u : list) {
            System.out.println(u);
        }
    }

}
