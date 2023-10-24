package com.example.ConsumingRestfulService;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Quote {
	
	@JsonIgnoreProperties(ignoreUnknown=true)

	public record Greeting(String type, Value value) {}
}
