package top.huanmengmie.lexunyoupro.model;

import java.io.Serializable;

/**
 * @description   (景点信息)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:27
 */
public class SceneryInfo implements Serializable {
    private Integer id;
    private String sceneryName;
    private Double sceneryScore;
    private String sceneryIntro;
    private String province;
    private String city;
    private String content;
    private Double price;
    private Integer authorId;
    private String publishTime;
    private boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSceneryName() {
        return sceneryName;
    }

    public void setSceneryName(String sceneryName) {
        this.sceneryName = sceneryName;
    }

    public Double getSceneryScore() {
        return sceneryScore;
    }

    public void setSceneryScore(Double sceneryScore) {
        this.sceneryScore = sceneryScore;
    }

    public String getSceneryIntro() {
        return sceneryIntro;
    }

    public void setSceneryIntro(String sceneryIntro) {
        this.sceneryIntro = sceneryIntro;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
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
