package com.example.demo.model;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "freshers")
public class Fresher {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Integer id;
	@NotNull
	private String name;
	@NotNull
	private Date dob;
	@NotNull
	private String email;
	private Float point1;
	private Float point2;
	private Float point3;
	private Float averagepoint;
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}

	@NotNull
	private String pl;
	
	
	@ManyToOne
	@JoinColumn(name = "center_id")
	private Center center;
	
	public Fresher() {
		
	}
	public Fresher(String name) {
		this.name=name;
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

	public Fresher(String name, Center center) {
		this.name = name;
		this.center = center;
	}

	public Center getCenter() {
		return center;
	}

	public void setCenter(Center center) {
		this.center = center;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPl() {
		return pl;
	}

	public void setPl(String pl) {
		this.pl = pl;
	}
	public Float getPoint1() {
		return point1;
	}
	public void setPoint1(Float point1) {
		this.point1 = point1;
	}
	public Float getPoint2() {
		return point2;
	}
	public void setPoint2(Float point2) {
		this.point2 = point2;
	}
	public Float getPoint3() {
		return point3;
	}
	public void setPoint3(Float point3) {
		this.point3 = point3;
	}
	public Float getAveragepoint() {
		return averagepoint;
	}
	public void setAveragepoint(Float averagepoint) {
		this.averagepoint = averagepoint;
	}


	
	

}
