package com.MyMoviePlanBackend.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id;
	    
	   @Column(name="name")
	    private String name;
	   
	   @Column(name="descr")
	    private String descr;
	    
	   @Column(name="category")
	    private String category;
	   
	   @Column(name="showdate")
	    private String showdate;
	   
	   @Column(name="price")
	    private int price;
	   

	   @Column(name="showtimings")
	    private String showtimings;


	public Movies(String name, String descr, String category, String showdate, int price, String showtimings) {
		super();
		
		this.name = name;
		this.descr = descr;
		this.category = category;
		this.showdate = showdate;
		this.price = price;
		this.showtimings = showtimings;
	}


	public Movies() {
		super();
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescr() {
		return descr;
	}


	public void setDescr(String descr) {
		this.descr = descr;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public String getShowdate() {
		return showdate;
	}


	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getShowtimings() {
		return showtimings;
	}


	public void setShowtimings(String showtimings) {
		this.showtimings = showtimings;
	}


	@Override
	public String toString() {
		return "Movies [id=" + id + ", name=" + name + ", descr=" + descr + ", category=" + category + ", showdate="
				+ showdate + ", price=" + price + ", showtimings=" + showtimings + "]";
	}
	   
	 
}
