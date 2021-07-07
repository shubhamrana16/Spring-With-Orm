package com.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.EmployeeDao;
import com.spring.orm.entity.Employee;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("OrmXml.xml");
    	
    	EmployeeDao employeeDao = (EmployeeDao)context.getBean("employeeDao");
    	
    	Employee employee1 = new Employee("05","debdeep", "kolkata", "frontend developer", 60000);
    	
    	int i = employeeDao.insert(employee1);
    	
    	System.out.println(i+" row created ");
    	
    	
    	((AbstractApplicationContext)context).close();
     
    }
}
