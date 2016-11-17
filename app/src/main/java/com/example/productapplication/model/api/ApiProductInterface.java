package com.example.productapplication.model.api;

/**
 * Created by sseleznev on 17.11.2016.
 */

import com.example.productapplication.model.dto.ProductDTO;
import com.example.productapplication.model.dto.ProductInfoDTO;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

public interface ApiProductInterface {

    @GET("/product/extended/")
    Observable<List<ProductDTO>> getProducts(@Query("page") String page);

    @GET("/products/")
    Observable<ProductInfoDTO> getProductInfo(@Query("article") String article);
}
