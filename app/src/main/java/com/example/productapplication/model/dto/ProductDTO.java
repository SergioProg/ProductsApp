package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductDTO {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("type_id")
    @Expose
    private String typeId;
    @SerializedName("gem_description")
    @Expose
    private String gemDescription;
    @SerializedName("price")
    @Expose
    private List<PriceDTO> price = new ArrayList<PriceDTO>();
    @SerializedName("hide_in_catalog")
    @Expose
    private Boolean hideInCatalog;
    @SerializedName("images")
    @Expose
    private List<ImageDTO> images = new ArrayList<ImageDTO>();
    @SerializedName("article")
    @Expose
    private String article;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("absolute_url")
    @Expose
    private String absoluteUrl;
    @SerializedName("two_eq_one")
    @Expose
    private Boolean twoEqOne;
    @SerializedName("is_reserve_available")
    @Expose
    private Boolean isReserveAvailable;
    @SerializedName("gem_title")
    @Expose
    private String gemTitle;
    @SerializedName("published")
    @Expose
    private Boolean published;

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The typeId
     */
    public String getTypeId() {
        return typeId;
    }

    /**
     *
     * @param typeId
     * The type_id
     */
    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    /**
     *
     * @return
     * The gemDescription
     */
    public String getGemDescription() {
        return gemDescription;
    }

    /**
     *
     * @param gemDescription
     * The gem_description
     */
    public void setGemDescription(String gemDescription) {
        this.gemDescription = gemDescription;
    }

    /**
     *
     * @return
     * The price
     */
    public List<PriceDTO> getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(List<PriceDTO> price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The hideInCatalog
     */
    public Boolean getHideInCatalog() {
        return hideInCatalog;
    }

    /**
     *
     * @param hideInCatalog
     * The hide_in_catalog
     */
    public void setHideInCatalog(Boolean hideInCatalog) {
        this.hideInCatalog = hideInCatalog;
    }

    /**
     *
     * @return
     * The images
     */
    public List<ImageDTO> getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(List<ImageDTO> images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The article
     */
    public String getArticle() {
        return article;
    }

    /**
     *
     * @param article
     * The article
     */
    public void setArticle(String article) {
        this.article = article;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The absoluteUrl
     */
    public String getAbsoluteUrl() {
        return absoluteUrl;
    }

    /**
     *
     * @param absoluteUrl
     * The absolute_url
     */
    public void setAbsoluteUrl(String absoluteUrl) {
        this.absoluteUrl = absoluteUrl;
    }

    /**
     *
     * @return
     * The twoEqOne
     */
    public Boolean getTwoEqOne() {
        return twoEqOne;
    }

    /**
     *
     * @param twoEqOne
     * The two_eq_one
     */
    public void setTwoEqOne(Boolean twoEqOne) {
        this.twoEqOne = twoEqOne;
    }

    /**
     *
     * @return
     * The isReserveAvailable
     */
    public Boolean getIsReserveAvailable() {
        return isReserveAvailable;
    }

    /**
     *
     * @param isReserveAvailable
     * The is_reserve_available
     */
    public void setIsReserveAvailable(Boolean isReserveAvailable) {
        this.isReserveAvailable = isReserveAvailable;
    }

    /**
     *
     * @return
     * The gemTitle
     */
    public String getGemTitle() {
        return gemTitle;
    }

    /**
     *
     * @param gemTitle
     * The gem_title
     */
    public void setGemTitle(String gemTitle) {
        this.gemTitle = gemTitle;
    }

    /**
     *
     * @return
     * The published
     */
    public Boolean getPublished() {
        return published;
    }

    /**
     *
     * @param published
     * The published
     */
    public void setPublished(Boolean published) {
        this.published = published;
    }

}
