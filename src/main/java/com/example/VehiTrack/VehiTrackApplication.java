package com.example.VehiTrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.EventListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@SpringBootApplication
public class VehiTrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiTrackApplication.class, args);

	}

	@GetMapping("/test")
	public String Home() {
		return "Hello There";

	}

	@EventListener(ApplicationReadyEveny.public class VehiTrackApplication {
		
	})

}
