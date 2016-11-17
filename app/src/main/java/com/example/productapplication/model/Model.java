package com.example.productapplication.model;

import com.example.productapplication.model.dto.ProductDTO;
import com.example.productapplication.model.dto.ProductInfoDTO;

import java.util.List;
import rx.Observable;

/**
 * Created by sseleznev on 17.11.2016.
 */

public interface Model {

    Observable<List<ProductDTO>> getProducts(String page);

    Observable<ProductInfoDTO> getProductInfo(String article);
}
