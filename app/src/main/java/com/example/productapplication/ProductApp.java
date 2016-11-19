package com.example.productapplication;

import android.app.Application;
import android.graphics.Bitmap;

import com.squareup.picasso.Cache;
import com.squareup.picasso.Picasso;

/**
 * Created by sseleznev on 19.11.2016.
 */

public class ProductApp extends Application {

    @Override
    public void onCreate()
    {
        Picasso.Builder picassoBuilder = new Picasso.Builder(this);
        Picasso picasso = picassoBuilder.build();
        try {
            Picasso.setSingletonInstance(picasso);
        } catch (IllegalStateException ignored) {

        }
    }

}
