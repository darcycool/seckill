package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.NewSeckillApplication;
import org.seckill.NewSeckillApplicationTests;
import org.seckill.entity.Seckill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

/**
 * Created by darcy on 16/5/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = NewSeckillApplication.class)
@WebAppConfiguration
public class SeckillDaoTest {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void reduceReserve() throws Exception {

    }

    @Test
    public void testQuerySeckillById() throws Exception {
        Seckill seckill = seckillDao.querySeckillById(1000L);
        System.out.println(seckill.getName());
        System.out.println(seckill);
    }

    @Test
    public void queryAllSeckill() throws Exception {

    }

}