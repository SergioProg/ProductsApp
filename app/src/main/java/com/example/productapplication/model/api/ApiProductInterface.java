package com.example.productapplication.model.api;

/**
 * Created by sseleznev on 17.11.2016.
 */

import com.example.productapplication.model.dto.ProductInfoDTO;
import com.example.productapplication.model.dto.ProductsListDTO;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface ApiProductInterface {

    @GET("/v1/catalog/products/")
    Observable<ProductsListDTO> getProducts(@Query("page") String page);

    @GET("/v1/catalog/product/extended/")
    Observable<ProductInfoDTO> getProductInfo(@Query("article") String article, @Query("region_id") String region);
}
