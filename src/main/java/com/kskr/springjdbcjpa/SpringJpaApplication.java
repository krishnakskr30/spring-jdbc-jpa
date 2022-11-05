package com.kskr.springjdbcjpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJpaRepository personJpaRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        logger.info("All users: {}", personJdbcDao.findAll());
        logger.info("10001: {}", personJpaRepository.findById(10001));
//        logger.info("persons with Krishna as name: {}", personJdbcDao.findByName("Krishna"));
//        logger.info("Deleting 10002-> rows deleted: {}", personJdbcDao.deleteById(10002));
//        logger.info("Inserting 10006-> rows inserted: {}", personJdbcDao.insert(new Person(10006, "KSKR", "JK", "2022-11-05 00:00:00"
//        )));
//        logger.info("Updating 10006-> rows updated: {}", personJdbcDao.update(new Person(10006, "Noob", "Noobistan", "2022-11-05 00:00:00")));
    }
}
