package com.winter.authorityManagementSystem.domain;

import java.util.List;

/*
* 权限表的实体类
* */
public class Permission {
    private Integer id;  //权限表的id,主键,无实际意义
    private String permissionName;  //权限的名称
    private String url;  //资源路径

    private List<Role> roles;  //权限和角色之间是多对多的关系,存放角色的应用的集合

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + id +
                ", permissionName='" + permissionName + '\'' +
                ", url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
