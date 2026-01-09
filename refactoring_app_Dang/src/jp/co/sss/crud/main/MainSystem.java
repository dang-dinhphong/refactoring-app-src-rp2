package jp.co.sss.crud.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;

import jp.co.sss.crud.db.DBController;
import jp.co.sss.crud.util.ConstantMsg;

/**
 * 社員情報管理システム開始クラス 社員情報管理システムはこのクラスから始まる。<br/>
 * メニュー画面を表示する。
 *
 * @author System Shared
 *
 */
public class MainSystem {
	/**
	 * 社員管理システムを起動
	 *
	 * @throws IOException 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int menuNo = 0;

		do {
			// メニューの表示
			System.out.println("=== 社員管理システム ===");
			System.out.println("1.全件表示");
			System.out.println("2.社員名検索");
			System.out.println("3.部署ID検索");
			System.out.println("4.新規登録");
			System.out.println("5.更新");
			System.out.println("6.削除");
			System.out.println("7.終了");
			System.out.print(ConstantMsg.MSG_CHOOSE_MENU_NO);

			// メニュー番号の入力
			String menuNoStr = br.readLine();
			menuNo = Integer.parseInt(menuNoStr);

			// 機能の呼出
			switch (menuNo) {
			case 1:
				// 全件表示機能の呼出
				DBController.findAll();
				break;

			case 2:
				// 社員名検索
				System.out.print(ConstantMsg.MSG_EMP_NAME);

				// 検索機能の呼出
				DBController.findByEmpName();
				break;

			case 3:
				// 検索する部署IDを入力
				System.out.print(ConstantMsg.MSG_DEPT_ID_SEARCH);
				String deptIdName = br.readLine();

				// 検索機能の呼出
				DBController.findByDeptId(deptIdName);
				break;

			case 4:
				// 登録する値を入力
				System.out.print(ConstantMsg.MSG_EMP_NAME);
				String empName = br.readLine();
				System.out.print(ConstantMsg.MSG_GENDER);
				String gender = br.readLine();
				System.out.print(ConstantMsg.MSG_BIRTHDAY);
				String birthday = br.readLine();
				System.out.print(ConstantMsg.MSG_DEPT_ID_SEARCH);
				String deptIdCreate = br.readLine();

				// 登録機能の呼出
				DBController.insert(empName, gender, birthday, deptIdCreate);
				break;

			case 5:
				// 更新する社員IDを入力
				System.out.print(ConstantMsg.MSG_UPDATE);

				// 更新する値を入力する
				String empIdUpdate = br.readLine();
				Integer.parseInt(empIdUpdate);

				// 更新機能の呼出
				DBController.update(empIdUpdate);
				System.out.println(ConstantMsg.MSG_UPDATE_COMPLETE);

				break;

			case 6:
				// 削除する社員IDを入力
				System.out.print(ConstantMsg.MSG_DELETE);

				// 削除機能の呼出
				DBController.delete();
				break;

			}
		} while (menuNo != 7);
		System.out.println(ConstantMsg.MSG_SHUT_DOWN);
	}
}
