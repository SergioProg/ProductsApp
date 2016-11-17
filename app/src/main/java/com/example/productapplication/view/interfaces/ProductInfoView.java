package com.example.productapplication.view.interfaces;

import com.example.productapplication.presenter.viewObjects.ProductInfo;

/**
 * Created by sseleznev on 17.11.2016.
 */

public interface ProductInfoView extends ViewInterface {

    void showProductInfo(ProductInfo productInfo);
    void showProgress();
    void showEmpty();
}
