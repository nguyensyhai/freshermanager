package com.example.demo.api;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Fresher;
import com.example.demo.service.FresherService;

@RestController
public class FresherApi {
	
	@Autowired
	private FresherService service;
	
	
	@GetMapping("/freshers/list/center/{id}")
	public List<Fresher> listByCenter(@PathVariable("id") Integer centerId){
		return service.listByCenter(centerId);
	}
	
	@GetMapping("/freshers/lists")
    public List<Fresher> list() {
        return service.list();
    }
	
	@PostMapping("/freshers/save")
	public void saveFresher(@RequestBody Fresher fresher) {
		service.createFresher(fresher);
		
	}
	
	@DeleteMapping("/freshers/deldete/{id}")
	public void deldeteFresher(@PathVariable("id") Integer id) {
		service.deleteFresher(id);
	}
	
	@PutMapping("/freshers/update/{id}")
	public void updateFresher(@RequestBody @Valid Fresher fresher, @PathVariable(value = "id") Integer id) {
		service.updateFresher(fresher, id);
	}
	
	
	@GetMapping("/freshers/searchemail")
	public List<Fresher> getFresherByEmail(@RequestParam(value = "email") String email) {
		return service.getFresherEmail(email);
	}
	

	@GetMapping("/freshers/searchname")
	public List<Fresher> getFresherByName(@RequestParam(value = "name") String name) {
		return service.getFresherName(name);
	}
	
	@GetMapping("/freshers/searchpl")
	public List<Fresher> getFresherByPl(@RequestParam(value = "pl") String pl) {
		return service.getFresherPl(pl);
	}
	
	@GetMapping("/freshers/listcountav")
	public List<Fresher> getFresherByPl(@RequestParam(value = "min")float min, @RequestParam(value = "max") float max) {
		return service.getFresherAv(min, max);
	}
	
	@GetMapping("/freshers/countav")
	public Long countByAv(@RequestParam(value="min")float min, @RequestParam(value="max") float max) {
		return service.countbyAv(min, max);
	}
	
	@GetMapping("/freshers/countbycenter/{id}")
	public Long countByCenter(@PathVariable("id") Integer centerId){
		return service.countByCenter(centerId);
}
}
