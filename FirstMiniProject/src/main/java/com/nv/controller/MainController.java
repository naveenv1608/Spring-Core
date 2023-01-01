package com.nv.controller;

import com.nv.dto.EmployeeDTO;
import com.nv.service.IEmployeeManagementService;
import com.nv.vo.EmployeeVO;

public class MainController {
	//HAS -A property
		private IEmployeeManagementService service;

		// alt+shift+s, o
		public MainController(IEmployeeManagementService service) {
			System.out.println("MainController.1-param constructor");
			this.service = service;
		}
		public String   processEmployee(EmployeeVO vo)throws Exception{
			//convert EmployeeVO class object to EmployeDTO class obj
			EmployeeDTO dto=new EmployeeDTO();
			dto.setEname(vo.getEname());
			dto.setDesg(vo.getDesg());
			dto.setBasicSalary(Float.parseFloat(vo.getBasicSalary()));
			//use service
			String result=service.registerEmployee(dto);
			
			return result;
		}
		
}
