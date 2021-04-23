package com.example.runner;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class MesaageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		org.slf4j.Logger log=LoggerFactory.getLogger(MesaageRunner.class);
		int a=10;
		System.out.println("hello welocmeiewfh");
		
	}

}
