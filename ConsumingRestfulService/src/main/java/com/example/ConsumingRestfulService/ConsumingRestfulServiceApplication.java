package com.example.ConsumingRestfulService;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@SpringBootApplication
public class ConsumingRestfulServiceApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRestfulServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumingRestfulServiceApplication.class, args);
	}
@Bean
	public RestTemplate resttemplate(RestTemplateBuilder builder) {
	
	return builder.build();
}
@Bean
public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
	return args -> {
		Quote quote = restTemplate.getForObject(
				"http://localhost:8080/api/random", Quote.class);
		log.info(quote.toString());
	};

}
}


