package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ExistedException;
import com.example.demo.exception.NoDataException;
import com.example.demo.model.Center;
import com.example.demo.repository.CenterRepository;
import com.example.demo.repository.FresherRepository;

@Service
public class CenterService {
	@Autowired 
	private CenterRepository repo;
    
	public Center createCenter(Center center) {
    	if (repo.findCenterByName(center.getName()) == null) {
			return repo.save(center);
    	}
		 else {
			 throw new ExistedException();
		 }
    }
     
    public List<Center> list() {
    	List<Center> centers=new ArrayList<>();
    	centers=repo.findAll();
        if(centers.isEmpty()) {
        	throw new NoDataException();
        }
        else {
			return repo.findAll();

		}
    }
    
    public String deleteCenter(Integer id) {
    	Optional<Center> center=repo.findById(id);
    	if(center.isEmpty()) {
    		throw new NoDataException();
    	}
    	else {
    		repo.deleteById(id);
    		return "Delete Successfully id= "+id;
    	}
    }
    
    public void updateCenter(Center center,Integer id) {
    	Optional<Center> tempCenter=repo.findById(id);
    	if(tempCenter.isEmpty()) {
    		throw new NoDataException();
    	}
    	else if(tempCenter.orElseThrow().getName().equals(center.getName())
    			&&tempCenter.orElseThrow().getAddress().equals(center.getAddress()))
    		throw new ExistedException();
    	
    	else {
    		repo.save(center);
    	}
    }
}
