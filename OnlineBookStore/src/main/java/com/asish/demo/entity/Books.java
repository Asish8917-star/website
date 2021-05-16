package com.asish.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "BOOKS")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private int id;
	@Column
	
	  @NotNull(message = "Book name Mandatory")
	  
	  @NotEmpty(message = "Book Name can't be empty")
	 
	private String bookName;
	@Column
	
	  @NotNull(message = "Author name Mandatory")
	  
	  @NotEmpty(message = "Author Name can't be empty")
	 
	private String authorName;
	@Column
	@NotEmpty(message = "status required")
	private String status;
	@Column
	@Max(1000) 
	private double price;
	@Column
	@Min(100000) @Max(10000000)
	private int isbn;
	
	

}
