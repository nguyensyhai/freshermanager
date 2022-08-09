package com.example.demo.api;

import java.util.List;
 
import javax.validation.Valid;
 
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Center;
import com.example.demo.service.CenterService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class CenterApi {
 
    @Autowired
    private CenterService service;
     
    @PostMapping("/centers/save")
    public void createCenter(@RequestBody @Valid Center center) {
    	
    	service.createCenter(center);
    }
     
    @GetMapping("/centers/lists")
    public List<Center> listCenter() {
        return service.list();
    }
    
    @DeleteMapping("/centers/delete/{id}")
    public String deleteCenter(@PathVariable("id") Integer id) {
    	service.deleteCenter(id);
    	return "Delete Successfully id= "+id;
    }
    
    @PutMapping("/centers/update/{id}")
    public void updateCenter(@RequestBody @Valid Center center, @PathVariable(value = "id") Integer id) {
		service.updateCenter(center, id);
	}
    
}