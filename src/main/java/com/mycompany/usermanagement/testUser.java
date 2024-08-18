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
public class testUser {
    public static void main(String[] args) {
        User admin = new User(1, "admin", "Administrator", "pass01234", 'M', 'A');
        User user1 = new User(2, "user1", "User 1", "pass01234", 'F', 'U');
        User user2 = new User(3, "user2", "User2", "pass01234", 'M', 'U');
        ArrayList<User> userList = new ArrayList<>();
        userList.add(admin);
        userList.add(user1);
        userList.add(user2);
        for(int i=0;i<userList.size();i++){
            System.out.println(userList.get(i));
            
        }
        
        UserService.addUser(admin);
        UserService.addUser(user1);
        UserService.addUser(user2);
        System.out.println("*************************************");
        UserService.printList();
        
        System.out.println(UserService.getUserById(3));
    }
}
