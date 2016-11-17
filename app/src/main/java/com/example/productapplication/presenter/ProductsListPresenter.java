package com.example.productapplication.presenter;

import android.os.Bundle;

import com.example.productapplication.presenter.viewObjects.Product;
import com.example.productapplication.presenter.viewObjects.ProductsListMapper;
import com.example.productapplication.view.interfaces.ProductsView;

import java.util.ArrayList;
import java.util.List;

import rx.Observer;
import rx.Subscription;
import rx.subscriptions.Subscriptions;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductsListPresenter extends BaseProductPresenter {

    private Subscription subscription = Subscriptions.empty();
    private ProductsListMapper productsMapper = new ProductsListMapper();
    private List<Product> productsList;
    private ProductsView productsView;
    private int page;

    public ProductsListPresenter (ProductsView view){
        this.productsView = view;
        this.page = 1;
    }


    private void loadProducts(String page){
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }

        subscription = model.getProducts(page)
                .map(productsMapper)
                .subscribe(new Observer<List<Product>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        productsView.showError(e.getMessage());
                    }

                    @Override
                    public void onNext(List<Product> data) {
                        if (data != null && !data.isEmpty()) {
                            productsView.showProducts(data);
                        } else {
                            productsView.showEmpty();
                        }
                    }
                });
    }

    public void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            productsList = (List<Product>) savedInstanceState.getSerializable("PRODUCTS");
            page = savedInstanceState.getInt("PAGE");
        }

        if (productsList !=null && !productsList.isEmpty()){
            productsView.showProducts(productsList);
        } else {
            loadProducts(Integer.toString(page));
        }
    }

    public void loadRetry(){
        loadProducts(Integer.toString(page));
    }

    public void onSaveInstanceState(Bundle outState) {
        if (!productsList.isEmpty()) {
            outState.putSerializable("PRODUCTS", new ArrayList<>(productsList));
            outState.putInt("PAGE", page);
        }
    }

    public void selectProduct(Product product){

    }
}
