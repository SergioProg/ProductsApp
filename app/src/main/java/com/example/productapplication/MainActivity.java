package com.example.productapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.example.productapplication.presenter.viewObjects.Product;
import com.example.productapplication.view.fragments.ProductInfoFragment;
import com.example.productapplication.view.fragments.ProductsListFragment;
import com.example.productapplication.view.interfaces.ActivityCamunicator;

public class MainActivity extends AppCompatActivity implements ActivityCamunicator{

    private FragmentManager fragmentManager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(getResources().getString(R.string.title));
            getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        }

        fragmentManager = getSupportFragmentManager();
        replaceFragment(new ProductsListFragment(), false);
    }

    private void replaceFragment(Fragment fragment, boolean addBackStack) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.container, fragment);
        if (addBackStack) transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void showProductInfo(Product product) {
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        toolbar.setTitle(product.getArticle());
        replaceFragment(ProductInfoFragment.newInstance(product), true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                if (getSupportActionBar() != null){
                    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
                }
                fragmentManager.popBackStack();
                toolbar.setTitle(getResources().getString(R.string.title));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
