package jp.co.sss.crud.util;

public class ConstantMsg {
	private ConstantMsg() {

	}

	public static final String MSG_MENU = "メニュー番号を入力してください：";

	public static final String MSG_COLUMN = "社員ID\t社員名\t性別\t生年月日\t部署名";

	public static final String MSG_EMP_NAME = "社員名:";
	public static final String MSG_DEPT_ID_SEARCH = "部署ID(1:営業部、2:経理部、3:総務部)を入力してください:";
	public static final String MSG_GENDER = "性別(0:その他, 1:男性, 2:女性, 9:回答なし):";
	public static final String MSG_BIRTHDAY = "生年月日(西暦年/月/日):";

	public static final String MSG_CREATE_COMPLETE = "社員情報を登録しました";
	public static final String MSG_UPDATE = "更新する社員の社員IDを入力してください：";
	public static final String MSG_UPDATE_COMPLETE = "社員情報を更新しました";
	public static final String MSG_DELETE = "削除する社員の社員IDを入力してください：";
	public static final String MSG_DELETE_COMPLETE = "社員情報を削除しました";

	public static final String MSG_MENU_END = "システムを終了します。";

	public static final String MSG_INVALID_EMPLOYEE = "該当者はいませんでした";

}
