package com.diegodev.shoppingapi.Services;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diegodev.shoppingapi.Dtos.ProductResponseDTO;
import com.diegodev.shoppingapi.Interfaces.IProductService;
import com.diegodev.shoppingapi.Repository.ProductRepository;


@Service
public class ProductService  implements IProductService{


    @Autowired
    private ProductRepository products;

    @Override
    public ProductResponseDTO createProduct(ProductResponseDTO product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createProduct'");
    }

    @Override
    public List<ProductResponseDTO> listProductsAll() {
        return products.findAll().stream().map(p->new ProductResponseDTO(p.getId(), p.getName(), p.getAbout(), p.getCategory(), 
        p.getState(), p.getPrice(), p.getCover(),p.getImgs(), p.getMark(),p.getModel())).collect(Collectors.toList());


      
    }

    @Override
    public ProductResponseDTO getProductFromId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getProductFromId'");
    }

    @Override
    public void deleteProductsFromId(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteProductsFromId'");
    }

}
