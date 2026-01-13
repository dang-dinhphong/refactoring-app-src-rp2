package jp.co.sss.crud.dto;

import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;

/**
 * 社員テーブルDTOクラス
 */
public class Employee {

	/** 社員情報 */
	private Integer empId;
	private String empName;
	private int gender;
	private String birthday;

	/** 外部参照（部署テーブル） */
	private Department department;
	private String deptName;

	/** 上記フィールドの取得・代入用のゲッターセッター */
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public Integer getEmpId() {
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

	/** Stringクラスのオーバライドメソッド、取得した値をレコード毎に返す */
	@Override
	public String toString() {
		String gender_ja = "";
		if (this.gender == ConstantValue.GENDER_MALE_NO) {
			gender_ja = ConstantMsg.GENDER_MALE;
		} else if (this.gender == ConstantValue.GENDER_FEMALE_NO) {
			gender_ja = ConstantMsg.GENDER_FEMALE;
		} else if (this.gender == ConstantValue.GENDER_UNANSWERED_NO) {
			gender_ja = ConstantMsg.GENDER_UNANSWERED;
		} else if (this.gender == ConstantValue.GENDER_OTHER_NO) {
			gender_ja = ConstantMsg.GENDER_OTHER;
		}

		return empId + "\t" + empName + "\t" + gender_ja + "\t" + birthday
				+ "\t" + department.getDeptName() + "\n";
	}

}
