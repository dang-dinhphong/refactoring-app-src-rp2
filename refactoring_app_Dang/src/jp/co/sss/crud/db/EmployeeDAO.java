package jp.co.sss.crud.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import jp.co.sss.crud.dto.Employee;
import jp.co.sss.crud.exception.SystemErrorException;
import jp.co.sss.crud.util.ConstantSQL;
import jp.co.sss.crud.util.ConstantValue;
import jp.co.sss.crud.util.EmployeeUtils;

public class EmployeeDAO implements IEmployeeDAO {

	/**
	 * 全ての社員情報を検索
	 */
	@Override
	public List<Employee> findAll() throws SystemErrorException {
		return DBHelper.execute(connect -> {
			try (PreparedStatement preparedStatement = connect.prepareStatement(ConstantSQL.SQL_ALL_SELECT);
					ResultSet resultSet = preparedStatement.executeQuery()) {
				return EmployeeUtils.resultSetToEmployee(resultSet);
			}
		});
	}

	/**
	 * 社員名に該当する社員情報を検索
	 */
	@Override
	public List<Employee> findByEmployeeName(String searchName) throws SystemErrorException {
		return DBHelper.execute(connect -> {
			String sql = ConstantSQL.SQL_SELECT_BASIC + ConstantSQL.SQL_SELECT_BY_EMP_NAME;
			try (PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
				preparedStatement.setString(ConstantValue.RESULT_NO_ONE, "%" + searchName + "%");
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					return EmployeeUtils.resultSetToEmployee(resultSet);
				}
			}
		});
	}

	/**
	 * 部署IDに該当する社員情報を検索
	 */
	@Override
	public List<Employee> findByDeptId(int deptId) throws SystemErrorException {
		return DBHelper.execute(connect -> {
			String sql = ConstantSQL.SQL_SELECT_BASIC + ConstantSQL.SQL_SELECT_BY_DEPT_ID;
			try (PreparedStatement preparedStatement = connect.prepareStatement(sql)) {
				preparedStatement.setInt(ConstantValue.RESULT_NO_ONE, deptId);
				try (ResultSet resultSet = preparedStatement.executeQuery()) {
					return EmployeeUtils.resultSetToEmployee(resultSet);
				}
			}
		});
	}

	/**
	 * 社員情報を1件登録
	 */
	@Override
	public void insert(Employee employee) throws SystemErrorException {
		DBHelper.execute(connect -> {
			try (PreparedStatement preparedStatement = connect.prepareStatement(ConstantSQL.SQL_INSERT)) {
				EmployeeUtils.setPreparedStatement(preparedStatement, employee);
				preparedStatement.executeUpdate();
				return null;
			}
		});

	}

	/**
	 * 社員情報を1件更新
	 */
	@Override
	public Integer update(Employee employee) throws SystemErrorException {
		return DBHelper.execute(connect -> {
			try (PreparedStatement preparedStatement = connect.prepareStatement(ConstantSQL.SQL_UPDATE)) {
				EmployeeUtils.setPreparedStatement(preparedStatement, employee);
				return preparedStatement.executeUpdate();
			}
		});

	}

	/**
	 * 社員情報を1件削除
	 */
	@Override
	public Integer delete(Integer empId) throws SystemErrorException {
		return DBHelper.execute(connect -> {
			try (PreparedStatement preparedStatement = connect.prepareStatement(ConstantSQL.SQL_DELETE)) {
				preparedStatement.setInt(ConstantValue.RESULT_NO_ONE, empId);
				return preparedStatement.executeUpdate();
			}
		});

	}
}
