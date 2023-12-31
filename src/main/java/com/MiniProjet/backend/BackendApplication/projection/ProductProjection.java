package com.MiniProjet.backend.BackendApplication.projection;

import com.MiniProjet.backend.BackendApplication.entities.Product;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "p1", types = Product.class)
public interface ProductProjection {
    public double getPrice();

    public String getDescription();
}
