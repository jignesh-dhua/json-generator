package com.smartentities.json.generator.generators;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.Schema;
import org.json.JSONArray;

import com.smartentities.json.generator.GeneratorFactory;

public class ArrayGenerator extends JsonValueGenerator<JSONArray> {

	public ArrayGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public JSONArray generate() {

		if (schema instanceof ArraySchema) {
			ArraySchema arraySchema = (ArraySchema) schema;

			Schema allItemSchema = arraySchema.getAllItemSchema();

			JSONArray jsonArray = new JSONArray();

			jsonArray.put(GeneratorFactory.getGenerator(allItemSchema).generate());

			return jsonArray;
		}
		return new JSONArray();
	}
}