package com.example.productapplication.view.interfaces;

import com.example.productapplication.presenter.viewObjects.Product;

import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public interface ProductsView extends ViewInterface {

    void showProducts(List<Product> products);
    void showProgress();
    void showProductInfo(Product product);
    void showEmpty();
}
