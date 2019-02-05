package com.smartentities.json.generator;

import org.everit.json.schema.Schema;

public class BooleanGenerator extends JsonValueGenerator<Boolean> {

	public BooleanGenerator(String propertyName, Schema schema) {
		super(propertyName, schema);
	}

	@Override
	public Boolean generate() {

		return false;
	}
}