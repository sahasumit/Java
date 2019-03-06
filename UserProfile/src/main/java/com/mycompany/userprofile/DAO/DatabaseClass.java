/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.userprofile.DAO;
import com.mycompany.userprofile.Model.UserProfile;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author sumit
 */
public class DatabaseClass {
    private static Map<Long, UserProfile> messages = new HashMap<Long, UserProfile>();
    public static Map<Long, UserProfile> getUsers() {
        return messages;
    }
}
