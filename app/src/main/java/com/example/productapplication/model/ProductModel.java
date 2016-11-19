package com.example.productapplication.model;

import com.example.productapplication.model.api.ApiProduct;
import com.example.productapplication.model.api.ApiProductInterface;
import com.example.productapplication.model.dto.ProductInfoDTO;
import com.example.productapplication.model.dto.ProductsListDTO;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductModel implements Model {

    private ApiProductInterface apiInterface = ApiProduct.getApiInterface();
    private static final String regionId = "91eae2f5-b1d7-442f-bc86-c6c11c581fad";

    @Override
    public Observable<ProductsListDTO> getProducts(String page) {
        return apiInterface.getProducts(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<ProductInfoDTO> getProductInfo(String article) {
        return apiInterface.getProductInfo(article, regionId)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
