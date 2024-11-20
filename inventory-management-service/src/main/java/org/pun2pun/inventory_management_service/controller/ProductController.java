package org.pun2pun.inventory_management_service.controller;

import org.pun2pun.inventory_management_service.model.Product;
import org.pun2pun.inventory_management_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path = "/products")
    public ResponseEntity<List<Product>> findAll() {

        List<Product> products = productService.findAll();

        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @PostMapping(path = "/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product body) {

        Product product = productService.addProduct(body);

        return new ResponseEntity<>(product, HttpStatus.OK);

    }

    @DeleteMapping(path = "/product/{id}")
    public ResponseEntity<Optional<Product>> removeProduct(@PathVariable("id") Long productId) {

        Optional<Product> deletedProduct = productService.findOneById(productId);

        if (deletedProduct.isPresent()) {
            productService.removeProduct(productId);

            return new ResponseEntity<>(deletedProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }
}
