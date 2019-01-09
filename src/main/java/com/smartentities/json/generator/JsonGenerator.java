package com.smartentities.json.generator;

import java.io.InputStream;

import org.everit.json.schema.Schema;

public interface JsonGenerator {
	public InputStream generate(Schema schema);
}