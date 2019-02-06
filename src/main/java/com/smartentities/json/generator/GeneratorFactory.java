package com.smartentities.json.generator;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.BooleanSchema;
import org.everit.json.schema.NumberSchema;
import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;

import com.smartentities.json.generator.generators.ArrayGenerator;
import com.smartentities.json.generator.generators.BooleanGenerator;
import com.smartentities.json.generator.generators.JsonValueGenerator;
import com.smartentities.json.generator.generators.NumberGenerator;
import com.smartentities.json.generator.generators.ObjectGenerator;
import com.smartentities.json.generator.generators.StringGenerator;

public class GeneratorFactory {

	public static JsonValueGenerator getGenerator(Schema schema) {

		JsonValueGenerator jsonValueGenerator = null;

		if (schema instanceof StringSchema) {
			jsonValueGenerator = new StringGenerator(schema);
		} else if (schema instanceof NumberSchema) {
			jsonValueGenerator = new NumberGenerator(schema);
		} else if (schema instanceof BooleanSchema) {
			jsonValueGenerator = new BooleanGenerator(schema);
		} else if (schema instanceof ObjectSchema) {
			jsonValueGenerator = new ObjectGenerator(schema);
		} else if (schema instanceof ArraySchema) {
			jsonValueGenerator = new ArrayGenerator(schema);
		}

		return jsonValueGenerator;
	}
}
