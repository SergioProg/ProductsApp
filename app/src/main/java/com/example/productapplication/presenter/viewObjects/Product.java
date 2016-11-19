package com.example.productapplication.presenter.viewObjects;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class Product implements Serializable {

    private String name;
    private String imgUrl;
    private String article;
    private String title;
    private String description;

    public Product(String title, String name, String descript, String img, String article){
        this.title = title;
        this.name = name;
        this.description = descript;
        this.imgUrl = img;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imgUrl;
    }

    public void setImageUrl(String url) {
        this.imgUrl = url;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String art) {
        this.article = art;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descr) {
        this.description = descr;
    }
}
