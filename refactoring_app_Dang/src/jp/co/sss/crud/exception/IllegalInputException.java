package jp.co.sss.crud.exception;

/**
 * 例外をまとめて送出する独自例外クラス
 */
public class IllegalInputException extends Exception {

	/**
	 * 独自例外送出
	 * @param errorMsg
	 */
	public IllegalInputException(String errorMsg) {
		super(errorMsg);
	}
}
