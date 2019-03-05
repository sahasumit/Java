/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycomany.userprofile.Model;

/**
 *
 * @author sumit
 */
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class UserProfile {
    private long ProId;
    private String FName;
    private String LName;
    private String Add;
    public UserProfile() {}
    public UserProfile(long Proid, String Fname, String Lname, String Add){
        this.ProId = Proid;
        this.FName = Fname;
        this.LName = Lname;
        this.Add = Add;
    }
    
    public long getProId() {
        return this.ProId;
    }
    
    public void setProId(long ProId) {
        this.ProId = ProId;
    }
    
    public String getFName() {
        return this.FName;
    }
    
    public void setFName(String FName) {
        this.FName = FName;
    }
    
    public String getLName() {
        return this.LName;
    }
    
    public void setLName(String LName) {
        this.LName = LName;
    }
    
    public String getAdd() {
        return this.Add;
    }
    
    public void setAdd(String Add) {
        this.Add = Add;
    }
    
}
