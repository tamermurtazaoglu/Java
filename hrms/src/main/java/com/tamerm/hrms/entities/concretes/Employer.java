package com.tamerm.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper=false)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "employers")
public class Employer extends User{
	
	@Column(name = "company_name")
	private String companyName;
	
	@Column(name = "web_address")
	private String webAdress;
	
	@Column(name = "phone_number")
	private String phoneNumber;
		
}
