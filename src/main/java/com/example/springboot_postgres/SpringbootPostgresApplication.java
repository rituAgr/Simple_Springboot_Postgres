package com.example.springboot_postgres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootPostgresApplication implements CommandLineRunner {

	@Autowired
	StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		studentDao.createTable();

		studentDao.insertData("Ritz", "Lucknow");
		studentDao.insertData("Ritz", "Lucknow");

		studentDao.updateData(1,"Ritu", "Lucknow");

		studentDao.delData(2);
	}
}
