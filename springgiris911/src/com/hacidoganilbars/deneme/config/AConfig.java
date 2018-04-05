package com.hacidoganilbars.deneme.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hacidoganilbars.deneme.A;

@Configuration
public class AConfig {

	@Bean(name = "beana")
	public A yaz() {
		return new A();
	}
}
