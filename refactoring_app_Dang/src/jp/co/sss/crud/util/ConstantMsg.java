package jp.co.sss.crud.util;

public class ConstantMsg {
	private ConstantMsg() {

	}

	/** メニューメッセージ表示 */
	public static final String MSG_CHOOSE_MENU_NO = "メニュー番号を入力してください：";

	public static final String MSG_MENU_SYSTEM_NAME = "=== 社員管理システム ===";
	public static final String MSG_MENU_FIND_ALL = "1.全件表示";
	public static final String MSG_MENU_FIND_BY_EMP_NAME = "2.社員名検索";
	public static final String MSG_MENU_FIND_BY_DEPT_ID = "3.部署ID検索";
	public static final String MSG_MENU_CREATE = "4.新規登録";
	public static final String MSG_MENU_UPDATE = "5.更新";
	public static final String MSG_MENU_DELETE = "6.削除";
	public static final String MSG_MENU_SHUT_DOWN = "7.終了";

	public static final String MSG_SHUT_DOWN = "システムを終了します。";

	/** 出力用レコードのヘッド */
	public static final String MSG_RESULT_HEADER = "社員ID\t社員名\t性別\t生年月日\t部署名";

	/** 社員名検索 */
	public static final String FIND_BY_EMP_NAME = "社員名を入力してください: ";

	/** 部署検索 */
	public static final String FIND_BY_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";

	/** 新規登録 */
	public static final String INPUT_EMP_NAME = "社員名:";

	public static final String INPUT_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	public static final String GENDER_MALE = "男性";
	public static final String GENDER_FEMALE = "女性";
	public static final String GENDER_OTHER = "その他";
	public static final String GENDER_UNANSWERED = "回答なし";

	public static final String INPUT_BIRTHDAY = "生年月日(西暦年/月/日):";

	public static final String INPUT_DEPT_ID = "部署ID(1:営業部、2:経理部、3:総務部)：";
	public static final String DEPT_SALES = "営業部";
	public static final String DEPT_ACCOUNTING = "経理部";
	public static final String DEPT_GA = "総務部";

	public static final String MSG_CREATE_COMPLETE = "社員情報を登録しました";

	/** 更新 */
	public static final String UPDATE_INPUT_EMP_ID = "更新する社員の社員IDを入力してください：";
	public static final String MSG_UPDATE_COMPLETE = "社員情報を更新しました";
	//他の更新項目は新規登録の項目を再利用

	/** 削除 */
	public static final String DELETE_INPUT_EMP_ID = "削除する社員の社員IDを入力してください：";
	public static final String MSG_DELETE_COMPLETE = "社員情報を削除しました";

	/** エラーメッセージ */
	public static final String MSG_INVALID_EMPLOYEE = "該当者はいませんでした";
	public static final String MSG_SYS_ERROR = "予期せぬエラーが発生しました。";
	public static final String MSG_UPDATE_ERROR = "更新処理に失敗しました。";
	public static final String MSG_DELETE_ERROR = "削除処理に失敗しました。";

	/** バリデーションのチェック */
	/** メニュー番号入力チェック */
	public static final String VALID_CHOOSE_MENU_NO = "1～7までの整数を入力してください";
	/** 社員ID入力チェック */
	public static final String VALID_EMP_ID = "1以上9999以下の整数を入力してください";
	/** 社員名入力チェック */
	public static final String VALID_EMP_NAME = "1文字以上30文字以下の文字列を入力してください";
	/** 部署ID入力チェック */
	public static final String VALID_DEPT_ID = "1以上3以下の整数を入力してください";
	/** 日付入力チェック */
	public static final String VALID_DATE = "正しい形式（西暦年/月/日）で日付を入力してください";
	/** 性別入力チェック */
	public static final String VALID_GENDER = "（0・1・2・9）のいずれの整数を入力してください";

	/** 正規表現 */
	/** メニュー番号正規表現 */
	public static final String REGEX_CHOOSE_MENU_NO = "^[1-7１-７]{1}$";
	/** 社員ID正規表現 */
	public static final String REGEX_EMP_ID = "^[1-9１-９]{1}[0-9１-９]{0,3}$";
	/** 部署ID正規表現 */
	public static final String REGEX_DEPT_ID = "^[1-3１-３]{1}$";
	/** 性別正規表現 */
	public static final String REGEX_GENDER = "^|[0129０１２９]{1}$";
	public static final String REGEX_DATE = "yyyy/MM/dd";

}
