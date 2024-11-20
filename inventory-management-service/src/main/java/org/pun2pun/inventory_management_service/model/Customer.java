package org.pun2pun.inventory_management_service.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customer")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uuid;

    private String username;
    private String password;

    private String firstName;
    protected String lastName;

    private String phoneNumber;
}
