package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class PriceDTO {
    @SerializedName("discount_type")
    @Expose
    private Integer discountType;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("weight_price")
    @Expose
    private Boolean weightPrice;
    @SerializedName("discount_price")
    @Expose
    private Double discountPrice;
    @SerializedName("discount")
    @Expose
    private Double discount;

    /**
     *
     * @return
     * The discountType
     */
    public Integer getDiscountType() {
        return discountType;
    }

    /**
     *
     * @param discountType
     * The discount_type
     */
    public void setDiscountType(Integer discountType) {
        this.discountType = discountType;
    }

    /**
     *
     * @return
     * The price
     */
    public Double getPrice() {
        return price;
    }

    /**
     *
     * @param price
     * The price
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     *
     * @return
     * The weightPrice
     */
    public Boolean getWeightPrice() {
        return weightPrice;
    }

    /**
     *
     * @param weightPrice
     * The weight_price
     */
    public void setWeightPrice(Boolean weightPrice) {
        this.weightPrice = weightPrice;
    }

    /**
     *
     * @return
     * The discountPrice
     */
    public Double getDiscountPrice() {
        return discountPrice;
    }

    /**
     *
     * @param discountPrice
     * The discount_price
     */
    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    /**
     *
     * @return
     * The discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     *
     * @param discount
     * The discount
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
}
