package com.wchstrife.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by wangchenghao on 2017/7/31.
 */
@Entity
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "id", columnDefinition = "varchar(64) binary")
    private String id;


    @Column(name = "title")
    private String title;

    @Column(name = "content" , columnDefinition = "text")
    private String content;

    @ManyToOne
    private Category category;


    @Column(name = "summary", columnDefinition = "text")
    private String summary;

    @Column(name = "date", columnDefinition = "varchar(64)")
    private String date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
