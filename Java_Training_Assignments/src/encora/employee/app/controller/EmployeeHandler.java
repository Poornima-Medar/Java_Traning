package encora.employee.app.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import encora.employee.app.dto.EmployeeDto;
import encora.employee.app.view.EmployeeFrame;

public class EmployeeHandler implements ActionListener {

	EmployeeFrame ef;

	public EmployeeHandler(EmployeeFrame employeeFrame) {
		ef = employeeFrame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand().toLowerCase();
		switch (action) {
		case "save":
			getEmployeeData(ef);
			break;
		case "search":
			break;
		case "update":
			getEmployeeData(ef);
			break;
		case "delete":
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
		empDTO.setMedilcaim(ef.getMediclaimOption().getState());
		empDTO.setOfficeLocation(ef.getOfficeLocation().getSelectedItem());
		empDTO.setEmployeeAddress(ef.getEmployeeAddressTextArea().getText());
		empDTO.setEmployeeSalary(Integer.parseInt(ef.getEmployeeSalaryText().getText()));
		System.out.println(empDTO);
		return empDTO;
	}
}
