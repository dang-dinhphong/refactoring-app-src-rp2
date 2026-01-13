package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

public class EmployeeDeptIdReader implements IConsoleReader {

	@Override
	public String getErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return ConstantMsg.VALID_DEPT_ID;
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		return inputString.matches(ConstantMsg.REGEX_DEPT_ID);
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return true;
	}

}
