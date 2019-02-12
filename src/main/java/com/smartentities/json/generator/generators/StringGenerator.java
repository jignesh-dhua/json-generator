package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;

public class StringGenerator extends JsonValueGenerator<String> {

	String subset = "abcdefghijklmnopqrstuvwxyz";

	public StringGenerator(Schema schema) {
		super(schema);
		StringSchema stringSchema = (StringSchema) schema;
	}

	@Override
	public String generate() {
		int length = 7;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < length; i++) {
			int index = random.nextInt(subset.length());
			char c = subset.charAt(index);
			sb.append(c);
		}
		return sb.toString();
	}
}