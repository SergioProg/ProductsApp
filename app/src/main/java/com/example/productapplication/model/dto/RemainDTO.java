package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class RemainDTO {
    @SerializedName("available")
    @Expose
    private Boolean available;
    @SerializedName("count")
    @Expose
    private Object count;
    @SerializedName("outlet_id")
    @Expose
    private String outletId;
    @SerializedName("two_eq_one")
    @Expose
    private Boolean twoEqOne;
    @SerializedName("size")
    @Expose
    private Double size;
    @SerializedName("pickup_full")
    @Expose
    private String pickupFull;
    @SerializedName("pickup")
    @Expose
    private String pickup;

    /**
     *
     * @return
     * The available
     */
    public Boolean getAvailable() {
        return available;
    }

    /**
     *
     * @param available
     * The available
     */
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     *
     * @return
     * The count
     */
    public Object getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Object count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The outletId
     */
    public String getOutletId() {
        return outletId;
    }

    /**
     *
     * @param outletId
     * The outlet_id
     */
    public void setOutletId(String outletId) {
        this.outletId = outletId;
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
     * The size
     */
    public Double getSize() {
        return size;
    }

    /**
     *
     * @param size
     * The size
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     *
     * @return
     * The pickupFull
     */
    public String getPickupFull() {
        return pickupFull;
    }

    /**
     *
     * @param pickupFull
     * The pickup_full
     */
    public void setPickupFull(String pickupFull) {
        this.pickupFull = pickupFull;
    }

    /**
     *
     * @return
     * The pickup
     */
    public String getPickup() {
        return pickup;
    }

    /**
     *
     * @param pickup
     * The pickup
     */
    public void setPickup(String pickup) {
        this.pickup = pickup;
    }
}
