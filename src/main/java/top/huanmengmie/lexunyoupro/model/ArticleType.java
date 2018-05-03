package top.huanmengmie.lexunyoupro.model;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.io.Serializable;

/**
 * @description   (文章类型)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:28
 */
public class ArticleType implements Serializable {
    private Integer id;
    private String typeName;
    private String publishTime;
    private Boolean deleted;

    public ArticleType() {
    }

    public ArticleType(String typeName, String publishTime) {
        this.typeName = typeName;
        this.publishTime = publishTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
