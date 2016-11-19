package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class ProductsListDTO {
    @SerializedName("banners")
    @Expose
    private List<BannerDTO> banners = new ArrayList<BannerDTO>();
    @SerializedName("pages_count")
    @Expose
    private Integer pagesCount;
    @SerializedName("data")
    @Expose
    private List<ProductDTO> data = new ArrayList<ProductDTO>();
    @SerializedName("products_count")
    @Expose
    private Integer productsCount;
    @SerializedName("error")
    @Expose
    private Object error;

    /**
     *
     * @return
     * The banners
     */
    public List<BannerDTO> getBanners() {
        return banners;
    }

    /**
     *
     * @param banners
     * The banners
     */
    public void setBanners(List<BannerDTO> banners) {
        this.banners = banners;
    }

    /**
     *
     * @return
     * The pagesCount
     */
    public Integer getPagesCount() {
        return pagesCount;
    }

    /**
     *
     * @param pagesCount
     * The pages_count
     */
    public void setPagesCount(Integer pagesCount) {
        this.pagesCount = pagesCount;
    }

    /**
     *
     * @return
     * The data
     */
    public List<ProductDTO> getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(List<ProductDTO> data) {
        this.data = data;
    }

    /**
     *
     * @return
     * The productsCount
     */
    public Integer getProductsCount() {
        return productsCount;
    }

    /**
     *
     * @param productsCount
     * The products_count
     */
    public void setProductsCount(Integer productsCount) {
        this.productsCount = productsCount;
    }

    /**
     *
     * @return
     * The error
     */
    public Object getError() {
        return error;
    }

    /**
     *
     * @param error
     * The error
     */
    public void setError(Object error) {
        this.error = error;
    }
}
