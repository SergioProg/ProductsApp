package com.example.productapplication.view.fragments;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.productapplication.R;
import com.example.productapplication.presenter.BaseProductPresenter;
import com.example.productapplication.presenter.ProductInfoPresenter;
import com.example.productapplication.presenter.viewObjects.Product;
import com.example.productapplication.presenter.viewObjects.ProductInfo;
import com.example.productapplication.view.adapters.ImagesPagerAdapter;
import com.example.productapplication.view.interfaces.ActivityCamunicator;
import com.example.productapplication.view.interfaces.ProductInfoView;

import java.util.List;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfoFragment extends BaseFragment implements ProductInfoView {

    private static final String PROD = "PRODUCT";
    private ProductInfoPresenter productInfoPresenter;
    private ActivityCamunicator comunicator;
    private RelativeLayout mainLayout;
    private TextView textTitle;
    private TextView textDescription;
    private TextView textPrice;
    private LinearLayout dataLayout;
    private ViewPager viewPager;
    private ProgressBar loader;

    public static ProductInfoFragment newInstance(Product product) {
        ProductInfoFragment infoFragment = new ProductInfoFragment();

        Bundle aruments = new Bundle();
        aruments.putSerializable(PROD, product);
        infoFragment.setArguments(aruments);

        return infoFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.product_info_fragment, container, false);
        comunicator = (ActivityCamunicator)getActivity();

        mainLayout = (RelativeLayout)view.findViewById(R.id.main_layout);
        loader = (ProgressBar)view.findViewById(R.id.progressLoad);
        dataLayout = (LinearLayout)view.findViewById(R.id.scrollLayout);
        textTitle = (TextView)view.findViewById(R.id.textTitle);
        textDescription = (TextView)view.findViewById(R.id.textDescription);
        textPrice = (TextView)view.findViewById(R.id.textPrice);
        viewPager = (ViewPager)view.findViewById(R.id.viewpager);

        productInfoPresenter = new ProductInfoPresenter(this, (Product)getArguments().getSerializable(PROD));
        productInfoPresenter.onCreate(savedInstanceState);
        return view;
    }




    @Override
    protected BaseProductPresenter getPresenter() {
        return productInfoPresenter;
    }


    @Override
    public void showProductInfo(ProductInfo productInfo) {
        loader.setVisibility(View.GONE);
        dataLayout.setVisibility(View.VISIBLE);
        textTitle.setText(productInfo.getName());
        textDescription.setText(productInfo.getDescription());
        textPrice.setText(getResources().getString(R.string.price) + " " + productInfo.getPrice());
        viewPager.setAdapter(new ImagesPagerAdapter(getContext(), productInfo.getImages()));
    }

    @Override
    public void showProgress() {
        loader.setVisibility(View.VISIBLE);
    }


    @Override
    public void showEmpty() {
        loader.setVisibility(View.GONE);
        Snackbar.make(mainLayout, R.string.list_empty, Snackbar.LENGTH_SHORT).show();
    }

    @Override
    public void showError(String error) {
        loader.setVisibility(View.GONE);
        Snackbar.make(mainLayout, error, Snackbar.LENGTH_SHORT)
                .setAction(R.string.retry, (view) -> productInfoPresenter.RetryLoadInfo())
                .show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        productInfoPresenter.onSaveInstanceState(outState);
    }
}
