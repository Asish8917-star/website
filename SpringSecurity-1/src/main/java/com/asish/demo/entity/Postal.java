package com.asish.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "POSTAL")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postal {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Column
	private int id;
	@Column
	@NotNull(message = "please write Firstname")
	@NotEmpty
	private String fname;
	@Column
	@NotNull(message = "please write Lastname")
	@NotEmpty
	private String lname;
	@Column
	@NotNull(message = "please write Fathername")
	@NotEmpty
	private String fatherName;
	@Column
	@NotNull(message = "please enter valid dd-mm-yyyy")
	@NotEmpty
	private String dob;
	@Column
	@NotNull(message = "please write Address")
	@NotEmpty
	private String addrs;
	@Column
	@NotNull(message = "please write CountryName")
	@NotEmpty
	private String country;
	@Column
	@NotNull(message = "please write StateName")
	@NotEmpty
	private String state;
	@Column
	@NotNull(message = "please write CityName")
	@NotEmpty
	private String city;
	@Column
	@Min(100000) @Max(999999)
	private int pincode;
	@Column
	@Email(message = "please enter valid email")
	@NotEmpty
	private String email;
	@Column
	@Min(1000000000)
	private long mob;
	

}
