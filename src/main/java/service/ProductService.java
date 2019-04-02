/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import models.Product;

/**
 *
 * @author George.Pasparakis
 */
public interface ProductService {
        Product findById(long id);
        void saveProduct(Product product);
        void updateProduct(Product product);
        void deleteProductById(long id);
        List<Product> findAllProducts();
}
