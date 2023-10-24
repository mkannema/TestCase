package com.example.ConsumingRestfulService;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Value {
	
	@JsonIgnoreProperties(ignoreUnknown=true)
	public record abc(long id,String quote) {}

}
