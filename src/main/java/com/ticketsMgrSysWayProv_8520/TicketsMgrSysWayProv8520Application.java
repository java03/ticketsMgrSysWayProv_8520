package com.ticketsMgrSysWayProv_8520;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TicketsMgrSysWayProv8520Application {

	public static void main(String[] args) {
		SpringApplication.run(TicketsMgrSysWayProv8520Application.class, args);
	}

}
