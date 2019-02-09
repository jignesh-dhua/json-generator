package com.smartentities.json.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class GeneratorConfig {

	Schema schema;

	String schemaPath;

	JSONObject jsonSchema;

	private GeneratorConfig(String schemaPath) throws JSONException, FileNotFoundException {
		jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File(schemaPath))));
		schema = SchemaLoader.load(jsonSchema);
	}

	private GeneratorConfig(Schema schema) {
		this.schema = schema;
	}

	
	public static GeneratorConfig fromSchemaPath(String schemaPath) throws JSONException, FileNotFoundException {
		return new GeneratorConfig(schemaPath);
	}
	public static GeneratorConfig fromJsonSchema(Schema schema) throws JSONException, FileNotFoundException {
		return new GeneratorConfig(schema);
	}
}