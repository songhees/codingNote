package org.zerock.sample;

import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/applicationContext.xml")
@Log4j
public class SampleTests {
    @Setter(onMethod_ = @Autowired)
    private Restaurant res;

    @Test
    public void testExist() {
        assertNotNull(res);

        log.info(res);
        log.info("---------------------------");
        log.info(res.getChef());
    }

}
