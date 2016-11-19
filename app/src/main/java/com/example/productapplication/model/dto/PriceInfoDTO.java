package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class PriceInfoDTO {
    @SerializedName("discount")
    @Expose
    private Double discount;
    @SerializedName("commission_price")
    @Expose
    private Boolean commissionPrice;
    @SerializedName("price")
    @Expose
    private Double price;
    @SerializedName("discount_price")
    @Expose
    private Double discountPrice;
    @SerializedName("discount_type")
    @Expose
    private Integer discountType;
    @SerializedName("min_discount_price")
    @Expose
    private Double minDiscountPrice;
    @SerializedName("weight_price")
    @Expose
    private Boolean weightPrice;

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

    /**
     *
     * @return
     * The commissionPrice
     */
    public Boolean getCommissionPrice() {
        return commissionPrice;
    }

    /**
     *
     * @param commissionPrice
     * The commission_price
     */
    public void setCommissionPrice(Boolean commissionPrice) {
        this.commissionPrice = commissionPrice;
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
     * The minDiscountPrice
     */
    public Double getMinDiscountPrice() {
        return minDiscountPrice;
    }

    /**
     *
     * @param minDiscountPrice
     * The min_discount_price
     */
    public void setMinDiscountPrice(Double minDiscountPrice) {
        this.minDiscountPrice = minDiscountPrice;
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
}
