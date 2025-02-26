
package com.diegodev.shoppingapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diegodev.shoppingapi.Dtos.ProductResponseDTO;
import com.diegodev.shoppingapi.Services.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public ResponseEntity<List<ProductResponseDTO>> getAllProducts(){
        List<ProductResponseDTO> listproducts=productService.listProductsAll();
        return new ResponseEntity<>(listproducts,HttpStatus.OK);

        
    }
}