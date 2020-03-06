package com.cg.web.dao;

import java.util.List;

import com.cg.web.dto.Emp;
import com.cg.web.exception.EmpException;

public interface EmpDaos {
	
	public List<Emp> getEmpList() throws EmpException;
	
	

}
