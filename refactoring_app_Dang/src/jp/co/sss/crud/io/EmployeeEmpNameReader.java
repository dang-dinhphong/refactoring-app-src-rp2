package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;

public class EmployeeEmpNameReader implements IConsoleReader {

	@Override
	public String getErrorMsg() {
		// TODO 自動生成されたメソッド・スタブ
		return ConstantMsg.VALID_EMP_NAME;
	}

	@Override
	public boolean isValid(String inputString) {
		// TODO 自動生成されたメソッド・スタブ
		return inputString.length() >= ConstantValue.EMP_NAME_CHAR_MIN
				&& ConstantValue.EMP_NAME_CHAR_MAX >= inputString.length();
	}

	@Override
	public boolean isParseInt() {
		// TODO 自動生成されたメソッド・スタブ
		return false;
	}

}
