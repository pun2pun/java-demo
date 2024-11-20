package org.pun2pun.inventory_management_service.service;

import org.pun2pun.inventory_management_service.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getUsers();

    Customer createUser(Customer customer);

    boolean deleteUser(String uuid);
}
