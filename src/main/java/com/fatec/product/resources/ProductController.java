package com.fatec.product.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.product.entities.Product;

@RestController
@RequestMapping("products")
public class ProductController {

    @GetMapping
    public List<Product> getProduct() {

        Product p1 = new Product(); // construi um objeto pelo new e p guarda o objeto.
        p1.setId(1);
        p1.setName("luana");
        p1.setPrice(3);
        p1.setQnt(2);
        p1.setDesc("desc");

        Product p2 = new Product();
        p2.setId(2);
        p2.setName("maria");
        p2.setPrice(3);
        p2.setQnt(2);
        p2.setDesc("desc");

        ArrayList<Product> lista = new ArrayList<Product>();
        lista.add(p1);
        ;
        lista.add(p2);

        return lista;
    }

}