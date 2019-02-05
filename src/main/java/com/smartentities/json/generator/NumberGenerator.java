package com.smartentities.json.generator;

import org.everit.json.schema.Schema;

public class NumberGenerator extends JsonValueGenerator<Integer> {

	public NumberGenerator(String propertyName, Schema schema) {
		super(propertyName, schema);
	}

	@Override
	public Integer generate() {

		return 1;
	}
}