package com.winter.authorityManagementSystem.domain;

import java.util.List;

/*
* 角色表的实体类
* */
public class Role {
    private Integer id;  //角色的id,主键,无实际意义
    private String roleName;  //角色的名称
    private String roleDesc;  //角色的描述

    private List<Users> usersList;  //角色和用户之间是多对多的关系,这里存放用户的应用的集合
    private List<Permission> permissions;  //一个角色可能包含多个权限,存放权限的应用的集合

    public List<Users> getUsersList() {
        return usersList;
    }

    public void setUsersList(List<Users> usersList) {
        this.usersList = usersList;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                ", roleDesc='" + roleDesc + '\'' +
                ", usersList=" + usersList +
                ", permissions=" + permissions +
                '}';
    }
}
