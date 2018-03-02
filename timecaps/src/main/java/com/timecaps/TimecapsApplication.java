package com.timecaps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.timecaps.dao")

public class TimecapsApplication {

	public static void main(String[] args) {
		SpringApplication.run(TimecapsApplication.class, args);
	}
}
