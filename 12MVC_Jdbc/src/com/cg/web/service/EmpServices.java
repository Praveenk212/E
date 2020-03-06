package com.cg.web.service;

import java.util.List;

import com.cg.web.dto.Emp;
import com.cg.web.exception.EmpException;

public interface EmpServices {
	
	public String authenticate(String userName,String passWord);
	public List<Emp> getEmpList() throws EmpException ;

}
