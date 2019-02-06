package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;

public abstract class JsonValueGenerator<T> {

	protected Schema schema;

	public JsonValueGenerator(Schema schema) {
		this.schema = schema;
	}

	public abstract T generate();
}
