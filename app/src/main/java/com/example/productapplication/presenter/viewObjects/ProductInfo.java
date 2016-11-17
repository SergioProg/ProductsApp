package com.example.productapplication.presenter.viewObjects;

import java.io.Serializable;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfo implements Serializable {

    private String name;
    private String article;
    private String description;

    public ProductInfo(String name, String article, String descr){
        this.name = name;
        this.article = article;
        this.description = descr;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String art) {
        this.article = art;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descr) {
        this.description = descr;
    }

}
