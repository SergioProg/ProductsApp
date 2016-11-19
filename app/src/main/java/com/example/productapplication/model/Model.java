package com.example.productapplication.model;

import com.example.productapplication.model.dto.ProductInfoDTO;
import com.example.productapplication.model.dto.ProductsListDTO;

import rx.Observable;

/**
 * Created by sseleznev on 17.11.2016.
 */

public interface Model {

    Observable<ProductsListDTO> getProducts(String page);

    Observable<ProductInfoDTO> getProductInfo(String article);
}
