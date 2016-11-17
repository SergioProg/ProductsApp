package com.example.productapplication.model;

import com.example.productapplication.model.api.ApiProduct;
import com.example.productapplication.model.api.ApiProductInterface;
import com.example.productapplication.model.dto.ProductDTO;
import com.example.productapplication.model.dto.ProductInfoDTO;

import java.util.List;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductModel implements Model {

    ApiProductInterface apiInterface = ApiProduct.getApiInterface();

    @Override
    public Observable<List<ProductDTO>> getProducts(String page) {
        return apiInterface.getProducts(page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    @Override
    public Observable<ProductInfoDTO> getProductInfo(String article) {
        return apiInterface.getProductInfo(article)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }
}
