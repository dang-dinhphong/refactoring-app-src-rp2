package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * 部署IDの入力バリデーションチェッククラス
 */
public class EmployeeDeptIdReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_DEPT_ID;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		return inputString.matches(ConstantMsg.REGEX_DEPT_ID);
	}

	@Override
	public boolean isParseInt() {
		return true;
	}

}
