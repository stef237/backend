package com.MiniProjet.backend.BackendApplication;

import com.MiniProjet.backend.BackendApplication.dao.CategoryDao;
import com.MiniProjet.backend.BackendApplication.dao.ProductDao;
import com.MiniProjet.backend.BackendApplication.entities.Category;
import com.MiniProjet.backend.BackendApplication.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {

    @Autowired
    ProductDao productDao;
    @Autowired
    RepositoryRestConfiguration restConfiguration;
    @Autowired
    CategoryDao categoryDao;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Product.class);
        restConfiguration.exposeIdsFor(Category.class);

    }
}
