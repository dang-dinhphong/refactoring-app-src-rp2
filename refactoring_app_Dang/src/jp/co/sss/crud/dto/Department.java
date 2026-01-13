package jp.co.sss.crud.dto;

/**
 * 部署テーブルDTOクラス
 */
public class Department {
	private Integer deptId;
	private String deptName;

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Department() {

	}

}
