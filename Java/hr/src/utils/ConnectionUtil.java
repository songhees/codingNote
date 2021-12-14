package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * JDBMS ����̹��� ����ϰ�, RDBMS�� ����� Connection ��ü�� �����ϴ� ��ƿ��Ƽ Ŭ������.
 * @author OhSong
 *
 */
public class ConnectionUtil {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER_NAME = "hr";
	private static final String PASSWORD = "zxcv1234";

	/*
	 *  ���� �ʱ�ȭ ���  
	 *  ��ü ������ ������� Ŭ������ �޸𸮿� �ε��� �� ��� ����ȴ�.
	 *  Ŭ������ �޸𸮿� �ε��Ǵ� ������ ���๮�� Ŭ���� �̸��� �����ϴ� �����̴�.
	 *  ���� �ʱ�ȭ ����� Ŭ������ �ϻ����� �� �ѹ��� ����ȴ�.
	 *  - JDBC ����̹��� JVM�� ����̹� ������Ʈ���� ����ϴ� �۾��� �� �ѹ��� ��ϵǸ� �Ǳ� ������ ���� �ʱ�ȭ ������� �ۼ��Ͽ���
	 */
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * RDBMS�� ����� ���ο� Connection ��ü�� ��ȯ�Ѵ�.
	 * @return RDBMS�� ������ ����ϴ� Conncetion ��ü
	 * @throws SQLException RDBMS���� ������ �����ϴ� ��� ���ܰ� ��������.
	 */
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
	}
}
