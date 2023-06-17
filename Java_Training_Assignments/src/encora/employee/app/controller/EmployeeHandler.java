package encora.employee.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import encora.employee.app.dto.EmployeeDto;
import encora.employee.app.service.EmployeeService;
import encora.employee.app.service.impl.EmployeeServiceImpl;
import encora.employee.app.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {

	EmployeeService employeeService;
	EmployeeFrame ef;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
		employeeService = new EmployeeServiceImpl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		EmployeeDto dto = getEmployeeData(ef);
		switch (action) {
		case "save":
			employeeService.saveEmployee(dto);
			System.out.println("Save is clicked");
			getEmployeeData(ef);
			break;
		case "search":
			System.out.println("Search is clicked");
			break;
		case "update":
			employeeService.updateEmployee(dto);
			System.out.println("Update is clicked");
			getEmployeeData(ef);
			break;
		case "delete":
			System.out.println("delete is clicked");
			break;

		case "first":
			break;

		case "next":
			break;

		case "prev":
			break;

		case "last":
			break;

		}

	}

	public EmployeeDto getEmployeeData(EmployeeFrame ef) {
		EmployeeDto empDTO = new EmployeeDto();
		empDTO.setEmployeeID(Integer.parseInt(ef.getEmployeeIdText().getText()));
		empDTO.setEmployeeName(ef.getEmployeeNameText().getText());
		empDTO.setGender((ef.getGenderGroup().getSelectedCheckbox().getLabel()));
		empDTO.setPf(ef.getPfOption().getState());
		empDTO.setGraduity(ef.getGraduityOption().getState());
		empDTO.setMealCard(ef.getMealcardOption().getState());
		empDTO.setNps(ef.getNpsOption().getState());
		empDTO.setMediclaim(ef.getMediclaimOption().getState());
		empDTO.setOfficeLocation(ef.getOfficeLocation().getSelectedItem());
		empDTO.setEmployeeAddress(ef.getEmployeeAddressTextArea().getText());
		empDTO.setEmployeeSalary(Integer.parseInt(ef.getEmployeeSalaryText().getText()));
		System.out.println(empDTO);
		return empDTO;
	}
}
