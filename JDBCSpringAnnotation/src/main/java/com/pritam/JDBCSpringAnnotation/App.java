package com.pritam.JDBCSpringAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    	AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringJDBCConfiguration.class);
 
        EmployeeDAO empDAO = applicationContext.getBean(EmployeeDAO.class);
 
        String empName = empDAO.getEmployeeName(1);
 
        System.out.println("Employee name is as follows: " + empName);
 
        applicationContext.close();
    
    }
}
