package com.MiniProjet.backend.BackendApplication.dao;

import com.MiniProjet.backend.BackendApplication.entities.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;


import java.util.List;
// use pour le rest repository
@RepositoryRestResource
@Transactional
@CrossOrigin("*") // permet d'accepter les requests
public interface ProductDao extends JpaRepository<Product, Long> {
    // le nom du path de recherche
    @RestResource(path = "/designation")
    List<Product> findByDescriptionContains(@Param("desc") String desc);

    @RestResource(path = "/pagination")
    Page<Product> findByDescriptionContains(@Param("desc") String desc, Pageable pageable);
    @RestResource(path = "/byCategory")
    Page<Product> findByCategory_Id(@Param("c") long c, Pageable pageable);
}
