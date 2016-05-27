package org.seckill;

import org.seckill.dao.SeckillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewSeckillApplication implements CommandLineRunner {

	@Autowired
	private SeckillDao seckillDao;

	public static void main(String[] args) {
		SpringApplication.run(NewSeckillApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		// System.out.println(this.testSeckillDao.querySeckillById(1000));
		// System.out.println(seckillDao.querySeckillById(1000));
	}
}
