package com.learning.demo.repository.Exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(Long id) {
        super("Could not find Employee " + id);
    }
}
