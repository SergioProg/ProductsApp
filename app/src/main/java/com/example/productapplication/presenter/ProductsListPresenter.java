package com.example.productapplication.presenter;

import android.os.Bundle;
import android.util.Log;

import com.example.productapplication.model.dto.ProductsListDTO;
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

    private final static String PRODUCTS = "PROD";
    private final static String PAGE = "PAGE";
    private Subscription subscription = Subscriptions.empty();
    private ProductsListMapper productsMapper = new ProductsListMapper();
    private List<Product> productsList = new ArrayList<>();
    private ProductsView productsView;
    private int currentPage;

    public ProductsListPresenter (ProductsView view){
        this.productsView = view;
        this.currentPage = 0;
    }


    private void loadProducts(String page, boolean retry){
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }

        if (Integer.parseInt(page)>currentPage || retry) {
            subscription = model.getProducts(page)
                    .map(ProductsListDTO::getData)
                    .map(productsMapper)
                    .subscribe(new Observer<List<Product>>() {
                        @Override
                        public void onCompleted() {

                        }

                        @Override
                        public void onError(Throwable e) {
                            productsView.showError(e.getMessage());
                            e.printStackTrace();
                            //Log.e("Request Error: ", )
                        }

                        @Override
                        public void onNext(List<Product> data) {
                            if (data != null && !data.isEmpty()) {
                                currentPage++;
                                productsList.addAll(data);
                                if (currentPage==1) productsView.showProducts(data);
                                else productsView.addProducts(data);
                            } else {
                                if (currentPage==0) productsView.showEmpty();
                            }
                        }
                    });
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            productsList = (List<Product>) savedInstanceState.getSerializable(PRODUCTS);
            currentPage = savedInstanceState.getInt(PAGE);
        }

        if (productsList !=null && !productsList.isEmpty()){
            productsView.showProducts(productsList);
        } else {
            loadProducts("1", false);
        }
    }

    public void loadRetry(){
        loadProducts(Integer.toString(currentPage), true);
    }

    public void loadNext(){
        loadProducts(Integer.toString(currentPage+1), false);
    }

    public void onSaveInstanceState(Bundle outState) {
        if (productsList!=null && !productsList.isEmpty()) {
            outState.putSerializable(PRODUCTS, new ArrayList<>(productsList));
            outState.putInt(PAGE, currentPage);
        }
    }

    public void selectProduct(Product product){
        productsView.showProductInfo(product);
    }
}
