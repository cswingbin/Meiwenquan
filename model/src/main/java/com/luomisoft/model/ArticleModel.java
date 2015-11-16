package com.luomisoft.model;

import java.io.Serializable;

/**
 * @author Lenovo(cswingbin)
 * @datetime 2015-11-16 10:49 GMT+8
 * @email 703998061qq.com
 */
public class ArticleModel implements Serializable{
    private static final long serialVersionUID = 1431995664357550163L;

    private int id;                 //文章id
    private int cat_id;             //文章分类ID
    private String title;           //标题
    private String author;          //作者
    private int add_time;           //添加时间
    private int click;              //点击量
    private String pic_url;         //图片链接
    private String description;     //描述
    private String content;         //内容
    private int sort;               //排序
    private int wz_status;          //文章状态


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCat_id() {
        return cat_id;
    }

    public void setCat_id(int cat_id) {
        this.cat_id = cat_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getAdd_time() {
        return add_time;
    }

    public void setAdd_time(int add_time) {
        this.add_time = add_time;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public int getWz_status() {
        return wz_status;
    }

    public void setWz_status(int wz_status) {
        this.wz_status = wz_status;
    }
}
