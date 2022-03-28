//package com.codegym.casestudy.model;
//
//import javax.persistence.Entity;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class UserRole {
//    public UserRole() {
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Role getRole() {
//        return role;
//    }
//
//    public void setRole(Role role) {
//        this.role = role;
//    }
//
//    @ManyToOne(targetEntity = User.class)
//    @JoinColumn(name="username", nullable=false)
//    private User user;
//
//    @ManyToOne(targetEntity = Role.class)
//    @JoinColumn(name="role_id", nullable=false)
//    private Role role;
//}
