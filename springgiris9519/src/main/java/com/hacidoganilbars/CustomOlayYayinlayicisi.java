package com.hacidoganilbars;

import org.springframework.context.*;

public class CustomOlayYayinlayicisi implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;

	}

	public void yayinla() {
		CustomOlay customOlay = new CustomOlay(this);
		publisher.publishEvent(customOlay);
	}

}
