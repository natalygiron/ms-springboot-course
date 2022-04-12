package com.ms.store.product;

import com.ms.store.product.entity.Category;
import com.ms.store.product.entity.Product;
import com.ms.store.product.repository.ProductRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Date;
import java.util.List;

@DataJpaTest
public class ProductRepositoryMockTest {

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void whenFindByCategory_thenReturnListProduct() {
        Product product01 = Product.builder()
                .name("computer")
                .category(Category.builder().id(1L).build())
                .description("")
                .stock(Double.parseDouble("18"))
                .price(Double.parseDouble("1250.90"))
                .status("Created")
                .createAt(new Date()).build();
        productRepository.save(product01);
        List<Product> found = productRepository.findByCategory(product01.getCategory());
        Assertions.assertThat(found.size()).isEqualTo(3);
    }
}
