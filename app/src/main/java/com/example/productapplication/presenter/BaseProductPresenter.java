package com.example.productapplication.presenter;

import com.example.productapplication.model.Model;
import com.example.productapplication.model.ProductModel;

import rx.Subscription;
import rx.subscriptions.Subscriptions;


/**
 * Created by sseleznev on 17.11.2016.
 */

public class BaseProductPresenter implements Presenter {

    protected Model model = new ProductModel();
    private Subscription subscription = Subscriptions.empty();


    @Override
    public void onStop() {
        if (!subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }
}
