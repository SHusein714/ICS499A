package com.shew.consulting.eagleeye.msp.employee.service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.shew.consulting.eagleeye.msp.employee.service.model.validator.UniqueUsername;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@UniqueUsername
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmployeeUpdate extends Employee {

    @Override
    @NotBlank(message = "Username is required")
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    @NotBlank(message = "First name is required")
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    @NotBlank(message = "Last name is required")
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    @Email(message = "Invalid email format")
    @NotEmpty(message = "Email is required")
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    @NotNull(message = "Security role is required")
    public SecurityRole getSecurityRole() {
        return super.getSecurityRole();
    }

    public Employee getEmployee() {
        Employee employee = new Employee();
        employee.setId(getId());
        employee.setUsername(getUsername());
        employee.setFirstName(getFirstName());
        employee.setLastName(getLastName());
        employee.setEmail(getEmail());
        employee.setSecurityRole(getSecurityRole());
        employee.setPassword(getPassword());
        return employee;
    }

}
