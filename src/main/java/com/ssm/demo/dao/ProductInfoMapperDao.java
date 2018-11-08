package com.ssm.demo.dao;


import com.ssm.demo.entity.ProductDetail;
import com.ssm.demo.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoMapperDao {

    int addAProductInfo(ProductInfo productInfo);

    int addAProductDetail(ProductDetail productDetail);

    int deleteAProductInfo(String productId);

    int deleteProDetailsById(String productId);

    int updateProductInfo(ProductInfo productInfo);

    int updateProductDetails(ProductDetail productDetail);

    ProductInfo findProductInfoById(String productId);

    List<ProductInfo> findProductsByCode(String productCode);

    List<ProductDetail> findProDetailsById(String productId);
}
