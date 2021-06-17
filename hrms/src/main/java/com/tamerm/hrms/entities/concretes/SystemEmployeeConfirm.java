package com.tamerm.hrms.entities.concretes;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "systememployee_confirms")
public class SystemEmployeeConfirm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@JoinColumn(name="systememployee_id", referencedColumnName = "id", nullable=false)
	@Column(name = "systememployee_id")
	private int employeeId;
	
	@Column(name = "is_confirmed")
	private boolean isConfirmed;
	
	@Column(name = "confirm_date")
	private Date confirmDate; 
	
}