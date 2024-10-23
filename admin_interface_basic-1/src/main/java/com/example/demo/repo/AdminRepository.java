package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.AdminBasicTable;
@EnableJpaRepositories
public interface AdminRepository  extends JpaRepository<AdminBasicTable,Long>{
	@Query(value="select * from admin_basic_table a where a.admin_name=:admin_name",nativeQuery=true)
	AdminBasicTable findByAdminName(@Param("admin_name") String admin_name);

}
