package jp.co.sss.crud.dto;

import jp.co.sss.crud.util.ConstantValue;

public class Employee {

	private Integer empId;
	private String empName;
	private int gender;
	private String birthday;
	private Department department;

	private String deptName;

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Employee() {

	}

	public Employee(Integer empId, String empName, int gender, String birthday, String deptName,
			Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		this.birthday = birthday;
		this.deptName = deptName;
		this.department = department;
	}

	@Override
	public String toString() {
		String gender_ja = "";
		if (this.gender == 1) {
			gender_ja = ConstantValue.MALE;
		} else if (this.gender == 2) {
			gender_ja = ConstantValue.FEMALE;
		} else if (this.gender == 0) {
			gender_ja = ConstantValue.UNASWERED;
		} else if (this.gender == 9) {
			gender_ja = ConstantValue.OTHER;
		}

		return empId + "\t" + empName + "\t" + gender_ja + "\t" + birthday
				+ "\t" + department.getDeptName() + "\n";
	}

}
