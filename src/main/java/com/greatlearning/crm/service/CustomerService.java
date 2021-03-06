package com.greatlearning.crm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.crm.entity.Customer;

@Service
public interface CustomerService {
	List<Customer> findAll();

	Customer findById(int id);

	public void save(Customer customer);

	public void deleteById(int id);



}