package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;

public class StringGenerator extends JsonValueGenerator<String> {

	public StringGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public String generate() {
		return "Test";
	}
}