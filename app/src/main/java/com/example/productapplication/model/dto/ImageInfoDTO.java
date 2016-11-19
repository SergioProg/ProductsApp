package com.example.productapplication.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by sseleznev on 18.11.2016.
 */

public class ImageInfoDTO {
    @SerializedName("sort")
    @Expose
    private Integer sort;
    @SerializedName("is_primary")
    @Expose
    private Boolean isPrimary;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("file")
    @Expose
    private String file;

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
     * The isPrimary
     */
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    /**
     *
     * @param isPrimary
     * The is_primary
     */
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The file
     */
    public String getFile() {
        return file;
    }

    /**
     *
     * @param file
     * The file
     */
    public void setFile(String file) {
        this.file = file;
    }
}
