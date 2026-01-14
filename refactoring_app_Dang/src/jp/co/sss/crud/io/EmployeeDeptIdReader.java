package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

public class EmployeeDeptIdReader implements IConsoleReader {

	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_DEPT_ID;
	}

	@Override
	public boolean isValid(String inputString) {
		return inputString.matches(ConstantMsg.REGEX_DEPT_ID);
	}

	@Override
	public boolean isParseInt() {
		return true;
	}

}
