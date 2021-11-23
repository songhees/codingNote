package example_10_20.jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Sample1 {
	public static void main(String[] args) {
		try {
			// 0. ������ SQL�� �����Ѵ�.
			String sql = "insert into tb_scores(student_name, kor_score, eng_score, math_score) values(?, ?, ?, ?)";
			
			/*
			 * 1. oracle �ٽ� JDBC ����̹� Ŭ������ JVM �޸𸮿� �ε���Ű��
			 * 	  - oracle �ٽ� JDBC ����̹� Ŭ������ JVM �޸𸮿� �ε���
			 * 	  - oracle �ٽ� JDBC ����̹��� JVM�� ����̹� �������͸��� ��ϵ�
			 * 	  * ����̹� �������͸��� JDBC ����̹� ������ ����Ǵ� ���̴�.
			 * 	  * DriverManager Ŭ������ ����ؼ� ����̹� �������͸��� ��ϵ� JDBC ����̹��� ����� �� �ִ�.
			 */
			Class.forName("oracle.jdbc.OracleDriver");
			
			/*
			 * 2. ����Ŭ �����ͺ��̽� ���� URL�� ���Ӱ����� �����Ѵ�.
			 * 	  - jdbc:oracle:thin�� ����̹� �������͸��� ��ϵ� oracle JDBC ����̹��� �̸��̴�.
			 * 	  - @DESKTOP-FI3HIQG�� RDBMS�� �������� ��ǻ�͸� ���Ѵ�. ���� ȣ��Ʈ�� Ȥ�� ip�ּҷ� ���´�.
			 * 	  - 1521�� RDBMS�� ����ϴ� ��Ʈ��ȣ.
			 * 	  - xe�� �����ͺ��̽� �ĺ��� �̸��̴�.(SID)
			 */
			
			String url = "jdbc:oracle:thin:@DESKTOP-FI3HIQG:1521:xe";
			String username = "hr";
			String password = "zxcv1234";
			
			/*
			 * 3. ����̹� �������͸��� ��ϵ� oracle JDBC ����̹��� �̿��ؼ� RDBMS�� �����ϱ� -> ������ ����ϴ� Connection��ü�� ȹ���
			 * connection�� commit�� �����Ƿ� preparedsataement�� ������ SQL�� commit�� �� �ִ�.
			 */
			Connection connection = DriverManager.getConnection(url, username, password);
			
			/*
			 * 4. SQL�� SQL ���࿡ �ʿ��� ���� RDBMS�� �����ϰ� �������� �޾ƿ��� PreparedStatement��ü ȹ���ϱ�
			 */
			PreparedStatement pstmt = connection.prepareStatement(sql);
			
			/*
			 * 5. SQL�� ?(���ε�����)�� ������ ?�� ������ŭ PreparedStatement��ü�� ���� �����Ѵ�.
			 * 	  insert into tb_scores(student_name, kor_score, eng_score, math_score) values(?, ?, ?, ?)
			 * 							VARCHAR2(20)	  NUMBER(3)	 NUMBER(3)	NUMBER(3)	   ���ڿ�, ����, ����, ����
			 */
			pstmt.setString(1, "����");
			pstmt.setInt(2, 100);
			pstmt.setInt(3, 90);
			pstmt.setInt(4, 90);
			
			/*
			 * 6. PreparedStatement��ü�� ����� SQL�� ���� RDBMS�� �����ϰ� �����Ų��.
			 * 	  - int 			executeUpdate() : INSERT, UPDATE, DELETE SQL�� RDBMS�� ����/�����ų �� ����ϴ� �޼ҵ��.
			 * 										  �߰�/����/������ ���� ������ ��ȯ�Ѵ�.
			 * 	  - ResultSet 		executeQuery()	: SELECT SQL�� RDBMS�� ����/�����ų �� ����ϴ� �޼ҵ��.
			 * 										  ��ȸ����� �����ϰ� �ִ� ResultSet��ü�� ��ȯ�Ѵ�.
			 */
			int rowCount = pstmt.executeUpdate();
			System.out.println(rowCount + "���� ���� �߰��Ǿ����ϴ�.");
			
			/*
			 * 7. �����ͺ��̽� ������ �۾��� �Ϸ�Ǹ� ����ߴ� �ڿ��� ������Ų��.
			 */
			pstmt.close();
			connection.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 	// �־��� ����ó�� �ڵ���. �߻��� ���ܸ� ���, ����� ������ �����.
								 	// ���� �� ����� �ٸ� ������ ȣ���ߴٸ� ���ܰ� �߻��ߴ��� �𸣰� ��
									// throw�� ����� ���� ���ܸ� �߻���Ű����, throws�� ���ܸ� ������� �Ѵ�.
		} catch (SQLException e) {	// �����ͺ��̽� ������ �۾��� �� �� ������ �߻��ϸ� ���� SQLException���ܰ� �߻��ȴ�.
			e.printStackTrace();
		}

		
	}
}
