package com.example.productapplication.model.api;

/**
 * Created by sseleznev on 17.11.2016.
 */

import com.example.productapplication.model.dto.ProductInfoDTO;
import com.example.productapplication.model.dto.ProductsListDTO;


import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface ApiProductInterface {

    @GET("products/")
    Observable<ProductsListDTO> getProducts(@Query("page") String page);

    @GET("product/extended/")
    Observable<ProductInfoDTO> getProductInfo(@Query("article") String article, @Query("region_id") String region);
}
