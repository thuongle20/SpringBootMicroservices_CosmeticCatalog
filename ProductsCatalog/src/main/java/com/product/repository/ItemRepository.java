package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.product.module.Item;
@RepositoryRestResource
public interface ItemRepository extends JpaRepository<Item, Long> {

}
