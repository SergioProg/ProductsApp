package com.example.productapplication.model.api;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ApiProduct {

    private static final String BASE_URL = "http://api.lvsl.ru/v1/catalog/";

    public static ApiProductInterface getApiInterface() {

        Retrofit.Builder builder = new Retrofit.Builder().
                baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create());

        return builder.build().create(ApiProductInterface.class);
    }
}
