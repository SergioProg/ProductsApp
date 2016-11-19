package com.example.productapplication.presenter;

import android.os.Bundle;

import com.example.productapplication.presenter.viewObjects.Product;
import com.example.productapplication.presenter.viewObjects.ProductInfo;
import com.example.productapplication.presenter.viewObjects.ProductInfoMapper;
import com.example.productapplication.view.interfaces.ProductInfoView;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfoPresenter extends BaseProductPresenter {

    private final static String PRODUCT_INFO = "PRODUCT_INFO";
    private final static String PRODUCT = "PRODUCT";
    private Subscription subscription = Subscriptions.empty();
    private ProductInfoView productInfoView;
    private ProductInfoMapper productInfoMapper = new ProductInfoMapper();
    private ProductInfo productInfo;
    private Product product;

    public ProductInfoPresenter (ProductInfoView view, Product prod){
        this.productInfoView = view;
        this.product = prod;
    }

    private void loadProductInfo(String article){
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }

        productInfoView.showProgress();

        subscription = model.getProductInfo(article)
                .map(productInfoMapper)
                .subscribe(new Observer<ProductInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        productInfoView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(ProductInfo product_data) {
                        if (product_data != null) {
                            productInfoView.showProductInfo(product_data);
                        } else {
                            productInfoView.showEmpty();
                        }
                    }
                });
    }

    public void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            productInfo = (ProductInfo) savedInstanceState.getSerializable(PRODUCT_INFO);
            product = (Product) savedInstanceState.getSerializable(PRODUCT);
        }

        if (productInfo !=null){
            productInfoView.showProductInfo(productInfo);
        } else {
            if (product!=null) loadProductInfo(product.getArticle());
        }
    }

    public void RetryLoadInfo(){
        if (product!=null) loadProductInfo(product.getArticle());
    }

    public void onSaveInstanceState(Bundle outState) {
        if (productInfo != null) {
            outState.putSerializable(PRODUCT_INFO, productInfo);
            outState.putSerializable(PRODUCT, product);
        }
    }

}
