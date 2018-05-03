package top.huanmengmie.lexunyoupro.model;

import java.io.Serializable;

/**
 * @description   (用户表)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:28
 */
public class Customer implements Serializable {
    private Integer id;
    private Integer roleId;
    private String customerName;
    private String phone;
    private String password;
    private String sex;
    private String email;
    private String createTime;
    private String dateTime;
    private boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", email='" + email + '\'' +
                ", createTime='" + createTime + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}
