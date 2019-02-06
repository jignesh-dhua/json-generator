package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;

public class BooleanGenerator extends JsonValueGenerator<Boolean> {

	public BooleanGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public Boolean generate() {

		return false;
	}
}