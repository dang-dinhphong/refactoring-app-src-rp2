package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;
import jp.co.sss.crud.util.ConstantValue;

/**
 * 社員名の入力バリデーションチェッククラス
 */
public class EmployeeEmpNameReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_EMP_NAME;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		return inputString.length() >= ConstantValue.EMP_NAME_CHAR_MIN
				&& ConstantValue.EMP_NAME_CHAR_MAX >= inputString.length();
	}

	@Override
	public boolean isParseInt() {
		return false;
	}

}
