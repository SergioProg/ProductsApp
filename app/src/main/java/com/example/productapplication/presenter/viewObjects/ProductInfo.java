package com.example.productapplication.presenter.viewObjects;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfo implements Serializable {

    private String name;
    private String article;
    private String description;
    private double price;
    private List<String> images = new ArrayList<String>();;

    public ProductInfo(String name, String article, String descr, double price){
        this.name = name;
        this.article = article;
        this.description = descr;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addImage(String img){
        images.add(img);
    }

    public String getImage(int pos){
        return images.get(pos);
    }

    public List<String> getImages(){
        return images;
    }

}
