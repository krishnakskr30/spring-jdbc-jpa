package com.kskr.springjdbcjpa.springdata;

import com.kskr.springjdbcjpa.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.kskr.springjdbcjpa")
public class SpringDataJpaApplication implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonSpringDataRepository personSpringDataRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("All users: {}", personSpringDataRepository.findAll());
        logger.info("10001: {}", personSpringDataRepository.findById(10001));
        logger.info("Inserting new person-> rows inserted: {}", personSpringDataRepository.save(new Person("KSKR", "JK", "2022-11-05 00:00:00")));
        logger.info("Inserting new person-> rows inserted: {}", personSpringDataRepository.save(new Person(10001, "KSKR", "JK", "2022-11-05 00:00:00")));
        logger.info("Deleting a user");
        personSpringDataRepository.deleteById(1);
    }
}
