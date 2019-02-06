package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;

public class NumberGenerator extends JsonValueGenerator<Integer> {

	public NumberGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public Integer generate() {

		return 1;
	}
}