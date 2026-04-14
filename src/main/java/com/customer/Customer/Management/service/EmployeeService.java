package com.customer.Customer.Management.service;

import com.customer.Customer.Management.entity.Employee;
import com.customer.Customer.Management.exception.EmployeeNotFoundException;
import com.customer.Customer.Management.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee create(Employee emp) {
        return repository.save(emp);
    }

    public List<Employee> getAll() {
        return repository.findAll();
    }

    public Employee getById(Long id) throws EmployeeNotFoundException {
        return repository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException("Employee not found"));
    }

    public Employee update(Long id, Employee emp) throws EmployeeNotFoundException {
        Employee existing = getById(id);
        existing.setName(emp.getName());
        existing.setDepartment(emp.getDepartment());
        existing.setSalary(emp.getSalary());
        return repository.save(existing);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
