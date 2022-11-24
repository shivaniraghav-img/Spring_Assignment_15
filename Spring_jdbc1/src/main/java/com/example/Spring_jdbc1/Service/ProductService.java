package com.example.Spring_jdbc1.Service;

/*Annotations*/
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@PostConstruct
	public void execute()
	{
	    /*Create Table GrocerItems77*/
		
		jdbcTemplate.execute("Create Table GroceryItems77 (Pid int primary key, Pname varchar(24),Pprice float,Pquantity int)");
		
		/*Insert items into table*/
		
		jdbcTemplate.update("Insert into  GroceryItems77 values(1001,'Basmati Rice',100.50,200)");
		jdbcTemplate.update("Insert into  GroceryItems77 values(1002,'Gooday Biscuit',10,500)");
		jdbcTemplate.update("Insert into  GroceryItems77 values(1003,'Rajdhani Beasn',70.50,200)");
		jdbcTemplate.update("Insert into  GroceryItems77 values(1004,'Maccain Aloo Tikki',115.70,300)");
		jdbcTemplate.update("Insert into  GroceryItems77 values(1005,'Sugar',150.60,150)");
		
		
		/*Delete a item from table*/
		
		jdbcTemplate.update("Delete from GroceryItems77 where Pid=1004"); 
		
		/*Update a item price into table */
		
		jdbcTemplate.update("Update GroceryItems77 SET Pprice=200 Where Pid = 1005");
	   
	}
}
