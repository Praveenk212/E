package com.cg.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.web.dao.EmpDaos;
import com.cg.web.dto.Emp;
import com.cg.web.exception.EmpException;


@Service
@Scope("singleton")
public class EmpServicesImpl implements EmpServices{
	
	@Autowired
	public EmpDaos dao;


	@Override
	public String authenticate(String userName,String passWord)
	{

		if(userName.equals("aa") && (passWord.equals("bb")))
		{
			return "aa bb ccc";
		}
		else
			return null;


	}

	@Override
	public List<Emp> getEmpList() throws EmpException 
	{
	    	
		return dao.getEmpList();
	}


}
