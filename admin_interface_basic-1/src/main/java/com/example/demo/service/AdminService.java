package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDto;
import com.example.demo.model.AdminBasicTable;
import com.example.demo.repo.AdminRepository;

import jakarta.servlet.http.HttpSession;
@Service
public class AdminService {


		@Autowired
		AdminRepository repo;
		
		//mapp object
		
		@Autowired
		ModelMapper modelMapper;
		
		@Autowired
		HttpSession session;
		
		public AdminDto entityToDto (AdminBasicTable adminData)
		{
			AdminDto dto= modelMapper.map(adminData,AdminDto.class);
			return dto;
		}
		
		public boolean login(String admin_name,String admin_password) {
			
			if(repo.findByAdminName(admin_name)!=null)
			{
				AdminDto dto=entityToDto(repo.findByAdminName(admin_name));
				if((dto.getAdmin_password().equals(admin_password)) && dto.getAdmin_name().equals(admin_name))
				{
					System.out.println("All matched");
					session.setAttribute("name",admin_name);
					session.setAttribute("password",admin_password);
					//System.out.println(dto.getAdmin_id());
					
					return true;
				}
				
				else {
					System.out.println("all not matched");
					return false;
				}
			}
			else
			{
				System.out.println("All mot matched");
				return false;
			}
		}
}
