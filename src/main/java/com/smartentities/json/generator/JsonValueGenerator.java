package com.smartentities.json.generator;

import org.everit.json.schema.Schema;

public abstract class JsonValueGenerator<T> {

	
	protected String propertyName;
	protected Schema schema;
	
	public JsonValueGenerator(String propertyName, Schema schema) {
		this.propertyName = propertyName;
		this.schema = schema;
	}
	
	public abstract T generate();
}
