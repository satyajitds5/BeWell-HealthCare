/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.northeastern.Business.UserAcc;

import edu.northeastern.Business.Roles.Roles;
import edu.northeastern.Business.WorkQueue.WorkQueue;

/**
 *
 * @author satyajitdas
 */
public class UserAcc {
     
    //private Employee employee;
    private Roles role;
    private WorkQueue workQueue;
    private String userName;
    private String pwd;

    public UserAcc() {
        workQueue =  new WorkQueue();
    }


    public Roles getRole() {
        return role;
    }

    public void setRole(Roles role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    @Override
    public String toString() {
        return userName;
    }
    
    
}

