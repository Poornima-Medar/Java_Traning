package encora.employee.app.view;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import encora.employee.app.controller.EmployeeHandler;

public class EmployeeFrame extends Frame {
	private Label employeeIdLabel;
	private TextField employeeIdText;
	private Label employeeNameLabel;
	private TextField employeeNameText;
	private Label employeeGenderLabel;
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private CheckboxGroup genderGroup;
	private Label employeePerkLabel;
	private Checkbox pfOption;
	private Checkbox graduityOption;
	private Checkbox mealcardOption;
	private Checkbox npsOption;
	private Checkbox mediclaimOption;
	private Label employeeOfficeLocationLabel;
	private Choice officeLocation;
	private Label employeeAddressLabel;
	private TextArea employeeAddressTextArea;
	private Label employeeSalaryLabel;
	private TextField employeeSalaryText;
	private Button saveButton;
	private Button searchButton;
	private Button updateButton;
	private Button deleteButton;
	private Button firstButton;
	private Button nextButton;
	private Button prevButton;
	private Button lastButton;

	public EmployeeFrame() {
		setBounds(50, 50, 800, 500);
		setTitle("Employee Information");
		setVisible(true);
		setLayout(null);

		genderGroup = new CheckboxGroup();

		employeeIdLabel = new Label("Employee Id");
		employeeIdLabel.setBounds(20, 50, 100, 20);
		add(employeeIdLabel);

		employeeIdText = new TextField();
		employeeIdText.setBounds(140, 50, 100, 20);
		add(employeeIdText);

		employeeNameLabel = new Label("Employee Name");
		employeeNameLabel.setBounds(20, 90, 100, 20);
		add(employeeNameLabel);

		employeeNameText = new TextField();
		employeeNameText.setBounds(140, 90, 100, 20);
		add(employeeNameText);

		employeeGenderLabel = new Label("Employee Gender");
		employeeGenderLabel.setBounds(20, 130, 100, 20);
		add(employeeGenderLabel);

		maleOption = new Checkbox("Male", true, genderGroup);
		maleOption.setBounds(190, 130, 80, 20);
		add(maleOption);

		femaleOption = new Checkbox("Female", false, genderGroup);
		femaleOption.setBounds(290, 130, 80, 20);
		add(femaleOption);

		otherOption = new Checkbox("Other", false, genderGroup);
		otherOption.setBounds(390, 130, 80, 20);
		add(otherOption);

		employeePerkLabel = new Label("Employee Perk");
		employeePerkLabel.setBounds(20, 170, 100, 20);
		add(employeePerkLabel);

		pfOption = new Checkbox("PF");
		pfOption.setBounds(140, 170, 60, 20);
		add(pfOption);

		graduityOption = new Checkbox("Graduity");
		graduityOption.setBounds(220, 170, 120, 20);
		add(graduityOption);

		mealcardOption = new Checkbox("Meal card");
		mealcardOption.setBounds(360, 170, 120, 20);
		add(mealcardOption);

		npsOption = new Checkbox("NPS");
		npsOption.setBounds(500, 170, 120, 20);
		add(npsOption);

		mediclaimOption = new Checkbox("Mediclaim");
		mediclaimOption.setBounds(640, 170, 120, 20);
		add(mediclaimOption);

		employeeOfficeLocationLabel = new Label("Employee Office Location");
		employeeOfficeLocationLabel.setBounds(20, 210, 100, 20);
		add(employeeOfficeLocationLabel);

		officeLocation = new Choice();
		officeLocation.setBounds(140, 210, 100, 20);

		officeLocation.add("Pune");
		officeLocation.add("Hyderabad");
		officeLocation.add("Banglore");
		officeLocation.add("Hubali");
		officeLocation.add("Chennai");

		add(officeLocation);

		employeeAddressLabel = new Label("Employee Address");
		employeeAddressLabel.setBounds(260, 210, 120, 20);
		add(employeeAddressLabel);

		employeeAddressTextArea = new TextArea(5, 10);
		employeeAddressTextArea.setBounds(400, 210, 300, 100);
		add(employeeAddressTextArea);

		employeeSalaryLabel = new Label("Employee Salary");
		employeeSalaryLabel.setBounds(20, 330, 110, 20);
		add(employeeSalaryLabel);

		employeeSalaryText = new TextField();
		employeeSalaryText.setBounds(140, 330, 100, 20);
		add(employeeSalaryText);

		saveButton = new Button("Save");
		saveButton.setBounds(120, 370, 100, 30);
		add(saveButton);
		saveButton.addActionListener(new EmployeeHandler(this));

		searchButton = new Button("Search");
		searchButton.setBounds(240, 370, 100, 30);
		add(searchButton);
		searchButton.addActionListener(new EmployeeHandler(this));

		updateButton = new Button("Update");
		updateButton.setBounds(360, 370, 100, 30);
		add(updateButton);
		updateButton.addActionListener(new EmployeeHandler(this));

		deleteButton = new Button("Delete");
		deleteButton.setBounds(480, 370, 100, 30);
		add(deleteButton);
		deleteButton.addActionListener(new EmployeeHandler(this));

		firstButton = new Button("First");
		firstButton.setBounds(120, 420, 100, 30);
		add(firstButton);
		firstButton.addActionListener(new EmployeeHandler(this));

		nextButton = new Button("Next");
		nextButton.setBounds(240, 420, 100, 30);
		add(nextButton);
		nextButton.addActionListener(new EmployeeHandler(this));

		prevButton = new Button("Prev");
		prevButton.setBounds(360, 420, 100, 30);
		add(prevButton);
		prevButton.addActionListener(new EmployeeHandler(this));

		lastButton = new Button("Last");
		lastButton.setBounds(480, 420, 100, 30);
		add(lastButton);
		lastButton.addActionListener(new EmployeeHandler(this));

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				EmployeeFrame ef = (EmployeeFrame) e.getSource();
				ef.dispose();
			}
		});

	}

	public TextField getEmployeeIdText() {
		return employeeIdText;
	}

	public void setEmployeeIdText(TextField employeeIdText) {
		this.employeeIdText = employeeIdText;
	}

	public TextField getEmployeeNameText() {
		return employeeNameText;
	}

	public void setEmployeeNameText(TextField employeeNameText) {
		this.employeeNameText = employeeNameText;
	}

	public Checkbox getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		this.maleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return femaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		this.femaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		this.otherOption = otherOption;
	}

	public CheckboxGroup getGenderGroup() {
		return genderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		this.genderGroup = genderGroup;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGraduityOption() {
		return graduityOption;
	}

	public void setGraduityOption(Checkbox graduityOption) {
		this.graduityOption = graduityOption;
	}

	public Checkbox getMealcardOption() {
		return mealcardOption;
	}

	public void setMealcardOption(Checkbox mealcardOption) {
		this.mealcardOption = mealcardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediclaimOption() {
		return mediclaimOption;
	}

	public void setMediclaimOption(Checkbox mediclaimOption) {
		this.mediclaimOption = mediclaimOption;
	}

	public Choice getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(Choice officeLocation) {
		this.officeLocation = officeLocation;
	}

	public TextArea getEmployeeAddressTextArea() {
		return employeeAddressTextArea;
	}

	public void setEmployeeAddressTextArea(TextArea employeeAddressTextArea) {
		this.employeeAddressTextArea = employeeAddressTextArea;
	}

	public TextField getEmployeeSalaryText() {
		return employeeSalaryText;
	}

	public void setEmployeeSalaryText(TextField employeeSalaryText) {
		this.employeeSalaryText = employeeSalaryText;
	}

	public Button getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(Button updateButton) {
		this.updateButton = updateButton;
	}

	public Button getDeleteButton() {
		return deleteButton;
	}

	public void setDeleteButton(Button deleteButton) {
		this.deleteButton = deleteButton;
	}

	public Button getFirstButton() {
		return firstButton;
	}

	public void setFirstButton(Button firstButton) {
		this.firstButton = firstButton;
	}

	public Button getNextButton() {
		return nextButton;
	}

	public void setNextButton(Button nextButton) {
		this.nextButton = nextButton;
	}

	public Button getPrevButton() {
		return prevButton;
	}

	public void setPrevButton(Button prevButton) {
		this.prevButton = prevButton;
	}

	public Button getLastButton() {
		return lastButton;
	}

	public void setLastButton(Button lastButton) {
		this.lastButton = lastButton;
	}

}
