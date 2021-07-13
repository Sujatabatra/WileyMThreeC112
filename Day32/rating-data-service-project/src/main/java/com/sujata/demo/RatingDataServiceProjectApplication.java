package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Rating;
import com.sujata.persistence.RatingDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class RatingDataServiceProjectApplication /*implements CommandLineRunner*/{

//	@Autowired
//	private RatingDao ratingDao;
	
	public static void main(String[] args) {
		SpringApplication.run(RatingDataServiceProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		ratingDao.save(new Rating(1, "U001", "M002", 2));
//		ratingDao.save(new Rating(2, "U001", "M005", 4));
//		ratingDao.save(new Rating(3, "U001", "M008", 5));
//		ratingDao.save(new Rating(4, "U002", "M001", 3));
//		ratingDao.save(new Rating(5, "U002", "M002", 4));
//		ratingDao.save(new Rating(6, "U002", "M005", 5));
//		ratingDao.save(new Rating(7, "U003", "M003", 1));
//		ratingDao.save(new Rating(8, "U003", "M006", 3));
//		ratingDao.save(new Rating(9, "U004", "M007", 5));
//		ratingDao.save(new Rating(10, "U004", "M008", 4));
		
//	}

}
