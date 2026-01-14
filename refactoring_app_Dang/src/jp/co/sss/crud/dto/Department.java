package jp.co.sss.crud.dto;

/**
 * 部署テーブルDTOクラス
 */
public class Department {
	/** 部署情報フィールド */
	private Integer deptId;
	private String deptName;

	/** 上記フィールドの取得・代入用のゲッターセッター */
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
