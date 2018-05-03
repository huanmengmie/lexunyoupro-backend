package top.huanmengmie.lexunyoupro.model;

import java.io.Serializable;

/**
 * @description   (旅游景点评论)
 * @author huanmengmie@163.com
 * @time 2018/4/27 17:27
 */
public class SceneryComment implements Serializable {
    private Integer id;
    private Integer sceneryId;
    private Integer customerId;
    private Double sceneryScore;
    private Integer replyId;
    private String content;
    private String publishTime;
    private boolean deleted;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSceneryId() {
        return sceneryId;
    }

    public void setSceneryId(Integer sceneryId) {
        this.sceneryId = sceneryId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Double getSceneryScore() {
        return sceneryScore;
    }

    public void setSceneryScore(Double sceneryScore) {
        this.sceneryScore = sceneryScore;
    }

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
