package org.zerock.persistence;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;

import static org.junit.Assert.fail;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@Slf4j
public class DataSourceTests {

    @Setter(onMethod_ = @Autowired)
    private DataSource dataSource;

    @Setter(onMethod_ = @Autowired)
    private SqlSessionFactory factory;

    @Test
    public void testConnection() {
        try(Connection con = dataSource.getConnection()) {
            log.info(con.toString());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void testMybatis() {
        try(SqlSession session = factory.openSession()) {
            Connection con = session.getConnection();
            log.info(session.toString());
            log.info(con.toString());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}

