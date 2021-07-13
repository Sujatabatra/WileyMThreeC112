package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.sujata.bean.Movie;
import com.sujata.persistence.MovieDao;

@SpringBootApplication(scanBasePackages = "com.sujata")
@EntityScan(basePackages = "com.sujata.bean")
@EnableJpaRepositories(basePackages = "com.sujata.persistence")
public class MovieInfoServiceProjectApplication/* implements CommandLineRunner*/ {

//	@Autowired
//	private MovieDao movieDao;
	
	public static void main(String[] args) {
		SpringApplication.run(MovieInfoServiceProjectApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		movieDao.save(new Movie("M001", "Dangal"));
//		movieDao.save(new Movie("M002", "Radhe"));
//		movieDao.save(new Movie("M003", "Jab We Met"));
//		movieDao.save(new Movie("M004", "Edge of Tomorrow"));
//		movieDao.save(new Movie("M005", "Wolf of the Wall Street"));
//		movieDao.save(new Movie("M006", "Satya"));
//		movieDao.save(new Movie("M007", "Social Networking"));
//		movieDao.save(new Movie("M008", "Shawshant Redemption"));
//		
//	}
	
	

}
