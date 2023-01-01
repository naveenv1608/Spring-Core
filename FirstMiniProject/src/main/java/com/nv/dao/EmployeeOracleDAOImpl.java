package com.nv.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nv.bo.EmployeeBO;

public class EmployeeOracleDAOImpl implements IEmployeeDAO{
	private final String  INSERT_INTO_REALTIMEDI_EMPLOYEE="INSERT INTO REALTIMEDI_SPRING_EMPLOYEE VALUES(ENO_SEQ.NEXTVAL,?,?,?,?,?)";
	//Injecting datasource object to dao

	 private  DataSource ds;
	 
	 public EmployeeOracleDAOImpl(DataSource ds) {
		 System.out.println("EmployeeOracleDAOImpl.EmployeeOracleDAOImpl()");
			this.ds=ds;
		}
		

	@Override
	public int insertEmployee(EmployeeBO bo) throws Exception {
		System.out.println("EmployeeDAOImpl.insertEmployee()");
		int result=0;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(INSERT_INTO_REALTIMEDI_EMPLOYEE);
				){
			//set values to query params
			ps.setString(1,bo.getEname());
			ps.setString(2, bo.getDesg());
			ps.setFloat(3, bo.getBasicSalary());
			ps.setFloat(4, bo.getGrossSalary());
			ps.setFloat(5, bo.getNetSalary());
			//execute the Query
			 result=ps.executeUpdate();
		}//try
		catch(SQLException se) {
			se.printStackTrace();
			throw se; //exception rethrowing
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e; //exception rethrowing
		}
		
		return result;
		
	 
	
	  
		
	}

}
