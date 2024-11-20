package org.pun2pun.inventory_management_service.repository;

import org.pun2pun.inventory_management_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
