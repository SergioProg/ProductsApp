package com.example.productapplication.view.fragments;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.example.productapplication.R;
import com.example.productapplication.presenter.BaseProductPresenter;
import com.example.productapplication.presenter.ProductsListPresenter;
import com.example.productapplication.presenter.viewObjects.Product;
import com.example.productapplication.view.adapters.ProductsAdapter;
import com.example.productapplication.view.interfaces.ActivityCamunicator;
import com.example.productapplication.view.interfaces.ProductsView;

import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductsListFragment extends BaseFragment implements ProductsView{

    private ProductsListPresenter productsPresenter = new ProductsListPresenter(this);
    private ActivityCamunicator comunicator;
    private RelativeLayout mainLayout;
    private RecyclerView productsView;
    private ProductsAdapter adapter;
    private ProgressBar loader;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.products_fragment, container, false);
        comunicator = (ActivityCamunicator)getActivity();

        mainLayout = (RelativeLayout)view.findViewById(R.id.main_layout);
        loader = (ProgressBar)view.findViewById(R.id.progressLoad);
        productsView = (RecyclerView)view.findViewById(R.id.productsView);
        GridLayoutManager recyclerLayout = new GridLayoutManager(getContext(), 2);
        productsView.setLayoutManager(recyclerLayout);

        productsPresenter.onCreate(savedInstanceState);
        return view;
    }


    @Override
    protected BaseProductPresenter getPresenter() {
        return productsPresenter;
    }

    @Override
    public void showProducts(List<Product> products) {
        loader.setVisibility(View.GONE);
        adapter = new ProductsAdapter(getContext(), products, productsPresenter);
        productsView.setAdapter(adapter);
    }

    @Override
    public void addProducts(List<Product> products) {
        adapter.add(products);
        adapter.setNext(true);
    }

    @Override
    public void showProgress() {
        loader.setVisibility(View.VISIBLE);
    }

    @Override
    public void showProductInfo(Product product) {
        comunicator.showProductInfo(product);
    }

    @Override
    public void showEmpty() {
        loader.setVisibility(View.GONE);
        Snackbar.make(mainLayout, R.string.list_empty, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        loader.setVisibility(View.GONE);
        Snackbar.make(mainLayout, error, Snackbar.LENGTH_INDEFINITE)
                .setAction(R.string.retry, (view) -> productsPresenter.loadRetry())
                .show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        productsPresenter.onSaveInstanceState(outState);
    }
}
