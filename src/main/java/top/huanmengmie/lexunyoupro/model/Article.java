package top.huanmengmie.lexunyoupro.model;

import java.io.Serializable;

/**
 * @description   (文章评论)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:27
 */
public class Article implements Serializable {
    private Integer id;
    private String title;
    private String content;
    private String province;
    private String city;
    private Integer sceneryId;
    private Integer articleTypeId;
    private Integer authorId;
    private String publishTime;
    private boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Integer sceneryId) {
        this.sceneryId = sceneryId;
    }

    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
