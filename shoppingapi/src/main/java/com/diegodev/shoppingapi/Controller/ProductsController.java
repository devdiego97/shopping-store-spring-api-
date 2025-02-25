
package com.diegodev.shoppingapi.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController()
@RequestMapping("/products")
public class ProductsController {

    
    @GetMapping()
    public String getAllProducts(){
        return "produtos lista";
    }
}