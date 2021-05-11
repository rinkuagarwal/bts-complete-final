package com.ibm;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;


public class DummyEmployeeRepository implements EmployeeRepository {

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Employee> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> List<S> findAll(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> List<S> findAll(Example<S> arg0, Sort arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee save(Employee employee) {
		employee.setId("hsdgsaydf2345");
		return employee;
	}

	public <S extends Employee> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> List<S> saveAll(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Employee> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(Employee arg0) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	public void deleteAll(Iterable<? extends Employee> arg0) {
		// TODO Auto-generated method stub

	}

	public void deleteById(String arg0) {
		// TODO Auto-generated method stub

	}

	public boolean existsById(String arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public Iterable<Employee> findAllById(Iterable<String> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Employee> findById(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> S insert(S arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> long count(Example<S> arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends Employee> boolean exists(Example<S> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public <S extends Employee> Page<S> findAll(Example<S> arg0, Pageable arg1) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends Employee> Optional<S> findOne(Example<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
