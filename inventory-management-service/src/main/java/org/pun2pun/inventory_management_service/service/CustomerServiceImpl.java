package org.pun2pun.inventory_management_service.service;

import org.pun2pun.inventory_management_service.model.Customer;
import org.pun2pun.inventory_management_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<Customer> getUsers() {
        return repository.findAll();
    }

    @Override
    public Customer createUser(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public boolean deleteUser(String uuid) {
        Optional<Customer> deletedUser = repository.findById(uuid);

        if (deletedUser.isPresent()) {
            repository.deleteById(uuid);
            return true;
        } else {
            return false;
        }
    }
}
