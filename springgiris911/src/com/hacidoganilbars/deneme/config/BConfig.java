package com.hacidoganilbars.deneme.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hacidoganilbars.deneme.B;

@Configuration
public class BConfig {

	@Bean(name = "beanb")
	public B yaz() {
		return new B();
	}
}
