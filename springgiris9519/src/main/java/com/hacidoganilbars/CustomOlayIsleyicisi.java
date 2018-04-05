package com.hacidoganilbars;

import org.springframework.context.ApplicationListener;

public class CustomOlayIsleyicisi implements ApplicationListener<CustomOlay> {

	@Override
	public void onApplicationEvent(CustomOlay event) {
		System.out.println(event.toString());

	}

}
