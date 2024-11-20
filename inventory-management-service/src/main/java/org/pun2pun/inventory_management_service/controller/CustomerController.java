package org.pun2pun.inventory_management_service.controller;

import org.pun2pun.inventory_management_service.model.Customer;
import org.pun2pun.inventory_management_service.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(path = "/customer")
    public ResponseEntity<Customer> createUser(Customer customer){
        Customer newCustomer =  customerService.createUser(customer);

        return new ResponseEntity<>(newCustomer, HttpStatus.OK);
    }

    @GetMapping(path = "/customers")
    public ResponseEntity<List<Customer>> findAll(){
        List<Customer> customers = customerService.getUsers();
        return  new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @DeleteMapping(path = "/customer/{id}")
    public ResponseEntity<Optional<Customer>> removeUser(@PathVariable("id") String id){
        boolean deleted = customerService.deleteUser(id);

        if(deleted){
            return  new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
