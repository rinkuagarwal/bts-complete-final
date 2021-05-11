package com.ibm;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public class DummyBugRepository implements BugRepository {

	
	public <S extends Bug> List<S> saveAll(Iterable<S> entities) {
		return null;
	}

	
	public List<Bug> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Bug> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Bug> List<S> insert(Iterable<S> arg0) {
		// TODO Auto-generated method stub
		return null;
	}


	public Bug save(Bug bug) {
		bug.setId("hsdgsaydf2345");
		bug.setStatus(STATUS.VERIFIED);
		return bug;
	}


	public <S extends Bug> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Bug> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public Page<Bug> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}


	public <S extends Bug> S insert(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Optional<Bug> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public Iterable<Bug> findAllById(Iterable<String> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	public void delete(Bug entity) {
		// TODO Auto-generated method stub

	}

	
	public void deleteAll(Iterable<? extends Bug> entities) {
		// TODO Auto-generated method stub

	}


	public void deleteAll() {
		// TODO Auto-generated method stub

	}


	public <S extends Bug> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Bug> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <S extends Bug> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	public <S extends Bug> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}


	

	@Override
	public List<Bug> findByStatus(STATUS status) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Bug> findByNameIgnoreCase(String bugName) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Bug> findByStatusAndNameIgnoreCase(STATUS status, String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Optional<Bug> findByName(String bugName) {
		// TODO Auto-generated method stub
		return null;
	}


	
}