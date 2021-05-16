package com.example.demo.entity;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "MYMONGO")
public class MyMongo {
	@Id
	private int id;
	private String name;
	private String address;
	private long contact;
	
	public MyMongo() {
		// TODO Auto-generated constructor stub
	}
	
	public MyMongo(int id, String name, String address, long contact) {
	
		this.id = id;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "MyMongo [id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + "]";
	}
	

}
