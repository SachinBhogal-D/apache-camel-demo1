package com.example.integrator.client;

import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}

	@Bean
    public XmlJsonDataFormat xmlJsonBean(){
	    return new XmlJsonDataFormat();
    }
}
