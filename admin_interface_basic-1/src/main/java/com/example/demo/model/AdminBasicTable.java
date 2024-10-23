package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class AdminBasicTable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long admin_id;
	@Column(nullable=false)
	private String admin_name;
	@Column(nullable=false)
	private String admin_password;
}
