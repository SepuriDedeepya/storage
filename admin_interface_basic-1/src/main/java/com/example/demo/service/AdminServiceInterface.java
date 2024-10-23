package com.example.demo.service;

import com.example.demo.dto.AdminDto;
import com.example.demo.model.AdminBasicTable;

public interface AdminServiceInterface {
	public boolean login(String admin_name,String admin_password);

	public AdminDto entityToDto (AdminBasicTable adminData);
	
}
