package com.MiniProjet.backend.BackendApplication.dao;

import com.MiniProjet.backend.BackendApplication.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;



@Transactional
@RepositoryRestResource
@CrossOrigin("*") // permet d'accepter les requests
public interface CategoryDao extends JpaRepository<Category,Long> {
    // on peut ajouter les toutes operations qu'on veut...
}
