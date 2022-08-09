package com.example.demo.service;

import java.nio.file.attribute.FileOwnerAttributeView;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exception.ExistedException;
import com.example.demo.exception.NoDataException;
import com.example.demo.model.Center;
import com.example.demo.model.Fresher;
import com.example.demo.repository.FresherRepository;

@Service
public class FresherService {

	@Autowired 
	private FresherRepository repo;
    
	public Fresher createFresher(Fresher fresher) {
    	if (repo.findFresherByEmail(fresher.getEmail())==null

    			) {
			return repo.save(fresher);
    	}
		 else {
			 throw new ExistedException();
		 }
    }
	
	public List<Fresher> listByCenter(Integer centerId){
		System.out.println("Center ID: "+centerId);
		return repo.findByCenter(new Center(centerId));
	}
     
    public List<Fresher> list() {
    	List<Fresher> freshers=new ArrayList<>();
    	freshers=repo.findAll();
        if(freshers.isEmpty()) {
        	throw new NoDataException();
        }
        else {
    		return repo.findAll();

		}
    }
    
    public String deleteFresher(Integer id) {
    	Optional<Fresher> fresher=repo.findById(id);
    	if(fresher.isEmpty()) {
    		throw new NoDataException();
    	}
    	else {
    		repo.deleteById(id);;
    		return "Delete Successfully id= "+id;
    	}
    }
    
    public void updateFresher(Fresher fresher,Integer id) {
    	Optional<Fresher> tempFresher=repo.findById(id);
    	if(tempFresher.isEmpty()) {
    		throw new NoDataException();
    	}
    	else if(tempFresher.orElseThrow().getName().equals(fresher.getName())
    			&&tempFresher.orElseThrow().getEmail().equals(fresher.getEmail())
    			
    			)
    		throw new ExistedException();
    	
    	else {
    		repo.save(fresher);
    	}
    }
    
    public List<Fresher> getFresherPl(String pl) {
		List<Fresher> freshers = new ArrayList<>();
		freshers = repo.findByPl(pl);
		if (freshers.isEmpty()) {
			throw new NoDataException();
		} else {
			return freshers;
		}
	}

    public List<Fresher> getFresherName(String name) {
		List<Fresher> freshers = new ArrayList<>();
		freshers = repo.findByName(name);
		if (freshers.isEmpty()) {
			throw new NoDataException();
		} else
		{
			return freshers;
		}
    }
    public List<Fresher> getFresherEmail(String email) {
		List<Fresher> freshers = new ArrayList<>();
		freshers = repo.findByEmail(email);
		if (freshers.isEmpty()) {
			throw new NoDataException();
		} else
		{
			return freshers;
		}
	}
    
    public List<Fresher> getFresherAv(float min,float max) {
		List<Fresher> freshers = new ArrayList<>();
		freshers = repo.findByAveragepoint(min, max);
		if (freshers.isEmpty()) {
			throw new NoDataException();
		} else
		{
			return freshers;
		}
	}
    
    public Long countbyAv(float min,float max) {
    	return repo.countByAv(min, max);
    }
	
    public Long countByCenter(Integer centerId){
		System.out.println("Center ID: "+centerId);
		return repo.countByCenter(new Center(centerId));
	}
    
}
