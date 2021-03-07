package com.smartentities.json.generator;

import com.smartentities.json.generator.generators.*;
import org.everit.json.schema.*;

public class GeneratorFactory {

	public static JsonValueGenerator<?> getGenerator(Schema schema) {

		JsonValueGenerator<?> jsonValueGenerator = null;

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
		} else if (schema instanceof EnumSchema) {
			jsonValueGenerator = new EnumGenerator(schema);
		} else if (schema instanceof ReferenceSchema) {
			jsonValueGenerator = new ReferenceGenerator(schema);
		}

		return jsonValueGenerator;
	}
}
