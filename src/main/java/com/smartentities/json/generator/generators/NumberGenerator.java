package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;

public class NumberGenerator extends JsonValueGenerator<Number> {

	public NumberGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public Number generate() {

		return 1;
	}
}