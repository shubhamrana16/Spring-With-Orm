package com.spring.orm.dao;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entity.Employee;

public class EmployeeDao {
	
	 
	private HibernateTemplate hibernateTemplate;
	

	 
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
		
	@Transactional 
	public int insert(Employee employee) {
		
		int  r = Integer.parseInt((String) this.hibernateTemplate.save(employee));
		
		return r;
	
	}

}
