package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class BannerDTO {
    @SerializedName("sort")
    @Expose
    private Integer sort;
    @SerializedName("mobile_image")
    @Expose
    private String mobileImage;
    @SerializedName("api_url")
    @Expose
    private String apiUrl;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("image")
    @Expose
    private String image;
    @SerializedName("video")
    @Expose
    private String video;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("size")
    @Expose
    private String size;

    /**
     *
     * @return
     * The sort
     */
    public Integer getSort() {
        return sort;
    }

    /**
     *
     * @param sort
     * The sort
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     *
     * @return
     * The mobileImage
     */
    public String getMobileImage() {
        return mobileImage;
    }

    /**
     *
     * @param mobileImage
     * The mobile_image
     */
    public void setMobileImage(String mobileImage) {
        this.mobileImage = mobileImage;
    }

    /**
     *
     * @return
     * The apiUrl
     */
    public String getApiUrl() {
        return apiUrl;
    }

    /**
     *
     * @param apiUrl
     * The api_url
     */
    public void setApiUrl(String apiUrl) {
        this.apiUrl = apiUrl;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The video
     */
    public String getVideo() {
        return video;
    }

    /**
     *
     * @param video
     * The video
     */
    public void setVideo(String video) {
        this.video = video;
    }

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The size
     */
    public String getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(String size) {
        this.size = size;
    }

}

