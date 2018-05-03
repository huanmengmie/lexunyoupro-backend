package top.huanmengmie.lexunyoupro.model;

import java.io.Serializable;

/**
 * @description   (权限)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:27
 */
public class UserPermission implements Serializable {
    private Integer id;
    private String permissionName;
    private String detail;
    private boolean deleted;

    public UserPermission() {
    }

    public UserPermission(String permissionName, String detail) {
        this.permissionName = permissionName;
        this.detail = detail;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
