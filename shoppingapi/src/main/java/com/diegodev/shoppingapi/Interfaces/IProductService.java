package com.diegodev.shoppingapi.Interfaces;

import java.util.List;

import com.diegodev.shoppingapi.Dtos.ProductResponseDTO;

public interface IProductService{

    ProductResponseDTO createProduct(ProductResponseDTO product);
    List<ProductResponseDTO> listProductsAll();
    ProductResponseDTO getProductFromId(Long id);
    void deleteProductsFromId(Long id);
    
} 
