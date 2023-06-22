package com.ericsson.catalogs;

import com.ericsson.services.ws_cil_5.ProductServiceImpl;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ProductCatalog {

    ProductServiceImpl productService = new ProductServiceImpl();

    @WebMethod
    public List<String> getProductCatalog() {
        return productService.getProductCategories();
    }

    @WebMethod
    public List<String> getProducts(String category) {
        return productService.getProducts(category);
    }

    @WebMethod
    public boolean addProduct(String category, String product) {
        return productService.addProduct(category, product);
    }
}
