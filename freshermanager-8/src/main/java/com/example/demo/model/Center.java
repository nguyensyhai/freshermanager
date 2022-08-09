package com.example.demo.model;

import java.util.Set;

import javax.persistence.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
 
import org.hibernate.validator.constraints.Length;
 
@Entity
@Table(name = "centers")
public class Center {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    @Column(nullable = false, length = 128)
    @NotNull @Length(min = 1, max = 128)
    private String name;
     
    @NotNull @Length(min=1, max=200)
    private String address;
    
    @OneToMany(mappedBy = "center")
    private Set<Fresher> freshers;

    
    public Center() {
    	
    }
	public Center(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	

	
	public Center(Integer id) {
		super();
		this.id = id;
	}
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

 
    
}