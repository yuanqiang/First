package com.timecaps.request;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yuanqiang on 2018/3/2.
 */
public class AddRecordRequest implements Serializable {
    /** 用户ID */
    private int userId;

    /** 标题 */
    private String title;

    /** 内容 */
    private String content;

    /** 附件地址 */
    private String urls;

//    /** 过期时间*/
    private Date expiration_time;


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
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

    public String getUrls() {
        return urls;
    }

    public void setUrls(String urls) {
        this.urls = urls;
    }

    public Date getExpiration_time() {
        return expiration_time;
    }

    public void setExpiration_time(Date expiration_time) {
        this.expiration_time = expiration_time;
    }

}
