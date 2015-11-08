package com.pc_spyrx7.commonadapter.bean;

/**
 * Created by pc-spyrx7 on 2015/11/7.
 * 作者  pc-spyrx7
 * 邮箱 spyhanfeng@qq.com
 */
public class Bean {

    public Bean(String title, String content, String datatime, int imgRes) {
        this.title = title;
        this.content = content;
        this.datatime = datatime;
        this.imgRes = imgRes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String title;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime;
    }

    public int getImgRes() {
        return imgRes;
    }

    public void setImgRes(int imgRes) {
        this.imgRes = imgRes;
    }

    public String content;
    public String datatime;
    public int imgRes;

}
