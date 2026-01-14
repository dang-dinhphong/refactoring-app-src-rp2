package jp.co.sss.crud.io;

import jp.co.sss.crud.util.ConstantMsg;

/**
 * メニュ表示の入力バリデーションチェッククラス
 */
public class MenuNoReader implements IConsoleReader {

	/**
	 * バリデーションチェック時のエラーメッセージ表示
	 */
	@Override
	public String getErrorMsg() {
		return ConstantMsg.VALID_CHOOSE_MENU_NO;
	}

	/**
	 * 入力した文字列の値が適正かどうかによる実行処理
	 */
	@Override
	public boolean isValid(String inputString) {
		return inputString.matches(ConstantMsg.REGEX_CHOOSE_MENU_NO);
	}

	@Override
	public boolean isParseInt() {
		return true;
	}

}
