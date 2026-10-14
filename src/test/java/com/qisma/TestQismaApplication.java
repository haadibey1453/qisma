package com.qisma;

import org.springframework.boot.SpringApplication;

public class TestQismaApplication {

	public static void main(String[] args) {
		SpringApplication.from(QismaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
