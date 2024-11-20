package org.pun2pun.inventory_management_service.repository;

import org.pun2pun.inventory_management_service.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Customer, String> {
}
