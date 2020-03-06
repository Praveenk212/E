package com.cg.web.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cg.web.dto.Emp;
import com.cg.web.exception.EmpException;

@Repository
public class EmpDaoImpl implements EmpDaos

{
	@Autowired
	private DataSource dataSource;

	@Override
	public List<Emp> getEmpList() throws EmpException 
	{
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rs=null;
		List<Emp> empList=new ArrayList<Emp>();
		String query="Select empId,empName,salary from employeeSpring";
		try{
		con=dataSource.getConnection();
		stmt=con.createStatement();
		rs=stmt.executeQuery(query);
		while(rs.next())
		{
			int empId=rs.getInt("empId");
			String empName=rs.getString(2);
			int salary=rs.getInt(3);
			
			Emp emp=new Emp(empId,empName,salary);
			System.out.println(emp);
			empList.add(emp);
		}
		}
		catch(Exception e)
		{
			throw new EmpException("Error while retwriving data",e);//Exception chaning
		}
		finally
		{
			try 
			{
				if(rs!=null)
				{
					rs.close();
				}
				if(stmt!=null)
				{
					stmt.close();
				}
				if(con!=null)
				{
					con.close();//It will return connection back to the pool
				}
			} 
		  catch (SQLException e) 
			{
				// TODO Auto-generated catch block
				throw new EmpException("Error while throwing Connection");
			}
		}
		return empList;
	}
	
	
	

}
