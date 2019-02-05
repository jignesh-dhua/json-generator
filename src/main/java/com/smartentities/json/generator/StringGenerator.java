package com.smartentities.json.generator;

import org.everit.json.schema.Schema;

public class StringGenerator extends JsonValueGenerator<String> {

	
	public StringGenerator(String propertyName, Schema schema) {
		super(propertyName, schema);
	}
	@Override
	public String generate() {
		return "Test";
	}
}