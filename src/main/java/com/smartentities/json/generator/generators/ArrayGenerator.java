package com.smartentities.json.generator.generators;

import java.util.List;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.Schema;
import org.json.JSONArray;

public class ArrayGenerator extends JsonValueGenerator<JSONArray> {

	public ArrayGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public JSONArray generate() {

		if (schema instanceof ArraySchema) {
			ArraySchema arraySchema = (ArraySchema) schema;

			List<Schema> itemSchemas = arraySchema.getItemSchemas();

			JSONArray jsonArray = new JSONArray();

			if (itemSchemas != null) {
				for (Schema schema : itemSchemas) {

				}
			}

		}

		return new JSONArray();
	}
}
