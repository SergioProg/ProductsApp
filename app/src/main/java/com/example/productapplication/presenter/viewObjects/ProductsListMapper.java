package com.example.productapplication.presenter.viewObjects;

import com.example.productapplication.model.dto.ProductDTO;

import java.util.List;

import rx.Observable;
import rx.functions.Func1;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductsListMapper implements Func1<List<ProductDTO>, List<Product>> {
    @Override
    public List<Product> call(List<ProductDTO> productDTOs) {
        List<Product> productList = Observable.from(productDTOs)
                .map(productDTO -> new Product(productDTO.getName(), productDTO.getImageUrl(), productDTO.getArticle()))
                .toList()
                .toBlocking()
                .first();
        return productList;
    }
}
