package com.example.productapplication.presenter.viewObjects;

import com.example.productapplication.model.dto.ImageInfoDTO;
import com.example.productapplication.model.dto.ProductInfoDTO;

import rx.functions.Func1;

/**
 * Created by sseleznev on 17.11.2016.
 */

public class ProductInfoMapper implements Func1<ProductInfoDTO, ProductInfo> {

    @Override
    public ProductInfo call(ProductInfoDTO productInfoDTO) {
        ProductInfo prodInfo = new ProductInfo(productInfoDTO.getName(), productInfoDTO.getArticle(), productInfoDTO.getGemDescription(), productInfoDTO.getPrice().get(0).getPrice());
        for(ImageInfoDTO imageInfo:productInfoDTO.getImages()) prodInfo.addImage(imageInfo.getFile());
        return prodInfo;
    }
}
