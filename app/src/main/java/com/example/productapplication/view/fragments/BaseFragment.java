package com.example.productapplication.view.fragments;

import android.support.v4.app.Fragment;

import com.example.productapplication.presenter.BaseProductPresenter;

/**
 * Created by sseleznev on 17.11.2016.
 */

public abstract class BaseFragment extends Fragment {

    protected abstract BaseProductPresenter getPresenter();

    @Override
    public void onStop(){
        super.onStop();
        if (getPresenter()!=null) getPresenter().onStop();
    }
}
