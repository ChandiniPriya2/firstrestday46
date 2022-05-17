package com.jobiak.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobiak.rest.model.Mobile;
import com.jobiak.rest.repository.MobileRepository;

@Service
public class MobileService {
@Autowired
MobileRepository repo;
public Mobile addMobile(Mobile mobile) {
	Mobile ref=repo.save(mobile);
	return ref;
}
public Mobile modifyMobile(Mobile mobile) {
	// TODO Auto-generated method stub
	return repo.save(mobile);
}
public void removeProduct(Long mid) {
	repo.deleteById(mid);
	
}
public List<Mobile> getAll() {
	// TODO Auto-generated method stub
	return repo.findAll();
}
public Optional<Mobile> show(Long mid) {
	// TODO Auto-generated method stub
	return repo.findById(mid);
}


}
