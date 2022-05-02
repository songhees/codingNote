package org.zerock.security;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.config.RootConfig;
import org.zerock.config.SecurityConfig;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@ContextConfiguration(classes = {RootConfig.class, SecurityConfig.class})
@RunWith(SpringJUnit4ClassRunner.class)
@Log4j
public class MemberTests {

    @Setter(onMethod_ = @Autowired)
    private PasswordEncoder encoder;

    @Setter(onMethod_ = @Autowired)
    private DataSource dataSource;

    @Test
    public void testInsertMember() {
        String sql = "insert into tbl_member(userid, userpw, username) values(?, ?, ?) ";

        for (int i = 0; i<100; i++) {
            Connection con = null;
            PreparedStatement pstmt = null;

            try {
                con = dataSource.getConnection();
                pstmt = con.prepareStatement(sql);

                pstmt.setString(2, encoder.encode("pw" + i));

                if (i < 80) {
                    pstmt.setString(1, "user" + i);
                    pstmt.setString(3, "일반사용자" + i);
                } else if (i <90) {
                    pstmt.setString(1, "manager" + i);
                    pstmt.setString(3, "운영자" + i);
                } else {
                    pstmt.setString(1, "admin" + i);
                    pstmt.setString(3, "관리자" + i);
                }
                pstmt.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (Exception e) {

                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (Exception e) {

                    }
                }
            }
        }
    }

    @Test
    public void insertAuth() {
        String sql = "insert into tbl_member_auth(userid, auth) values(?, ?) ";


        for (int i = 0; i< 100; i++) {
            Connection con = null;
            PreparedStatement pstmt = null;

            try {
                con = dataSource.getConnection();
                pstmt = con.prepareStatement(sql);

                if (i < 80) {
                    pstmt.setString(1, "user" + i);
                    pstmt.setString(2, "ROLE_USER");
                } else if (i < 90) {
                    pstmt.setString(1, "manager" + i);
                    pstmt.setString(2, "ROLE_MEMBER");
                } else {
                    pstmt.setString(1, "admin" + i);
                    pstmt.setString(2, "ROLE_ADMIN");
                }

                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (pstmt != null) {
                    try {
                        pstmt.close();
                    } catch (Exception e) {

                    }
                }
                if (con != null) {
                    try {
                        con.close();
                    } catch (Exception e) {

                    }
                }
            }

        }
    }
}
