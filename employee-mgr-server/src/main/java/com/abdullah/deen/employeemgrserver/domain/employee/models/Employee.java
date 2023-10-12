package com.abdullah.deen.employeemgrserver.domain.employee.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity // JPA saves to the database
@NoArgsConstructor //creates a  non argument constructor
@RequiredArgsConstructor // creates a parameterized constructor
@Data // generates getters and setters
public class Employee {

    @Id // a saved space in memory
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id; // getters and setters will be handled by the database

    @NonNull  //lombok knows to generate getters and setters
    private String firstName;

    @NonNull //lombok knows to generate getters and setters
    private String lastName;

    @NonNull //lombok knows to generate getters and setters
    private String email;

    @Override
    public String toString() {
        return String.format("%d %s %s %s", id, firstName, lastName, email);
    }
}
