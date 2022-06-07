package com.maven.EmployeeService1;

import java.util.List;
import java.util.Optional;

import com.maven.dto.Employee;
import com.maven.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      //  System.out.println( "Hello World!" );
    
    EmployeeServiceImpl employeeServiceImpl=new EmployeeServiceImpl();
    Employee employee=new Employee(101,"Sri",10000.0,"java");
    Optional<Employee> addedEmployee=employeeServiceImpl.addEmployee(employee);
    if(addedEmployee.isPresent()) {
    	System.out.println("Employee details added succesfully");
    }
    List<Employee> employees=employeeServiceImpl.getEmployees();
    System.out.println(employees);
    
    Optional<Employee> employee1=employeeServiceImpl.getEmployeeById(employee);
    System.out.println(employee1);
    
    EmployeeServiceImpl employeeService=new EmployeeServiceImpl();
    Employee emp=new Employee(102,"devi",15000.0,"Python");
    Optional<Employee> updateEmployee=employeeServiceImpl.updateemployee(emp);
    if(updateEmployee.isPresent()) {
    	 System.out.println("Employee details updated successfully");  
    }
    else {
    	System.out.println("Employee details not updated successfully");
    }
    
      
      
    
    }
}
