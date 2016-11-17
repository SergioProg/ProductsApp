package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfoDTO {

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("article")
    @Expose
    private String article;

    @SerializedName("description")
    @Expose
    private String description;

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
