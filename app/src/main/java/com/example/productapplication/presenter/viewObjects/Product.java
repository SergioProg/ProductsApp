package com.example.productapplication.presenter.viewObjects;

import java.io.Serializable;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class Product implements Serializable {

    private String name;
    private String imgUrl;
    private String article;

    public Product(String name, String img, String article){
        this.name = name;
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
}
