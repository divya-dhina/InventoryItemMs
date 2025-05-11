package com.cloudkitchen.inventoryitem_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.cloudkitchen.inventoryitem_ms.external")

public class InventoryitemMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryitemMsApplication.class, args);
	}

}
