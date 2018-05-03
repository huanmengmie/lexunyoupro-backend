package top.huanmengmie.lexunyoupro.model;

/**
 * @description   (用户角色)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:23
 */
public class UserRole {
    private Integer id;
    private String roleName;
    private String detail;
    private Boolean deleted;

    public UserRole() {
    }

    public UserRole(String roleName, String detail) {
        this.roleName = roleName;
        this.detail = detail;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
