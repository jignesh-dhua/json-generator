package com.smartentities.json.generator.generators;

import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;

public class StringGenerator extends JsonValueGenerator<String> {

	String subset = "abcdefghijklmnopqrstuvwxyz";

	public StringGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public String generate() {

		String formatName = ((StringSchema)schema).getFormatValidator().formatName();
		if (formatName != null && formatName.equals("date-time")) {
			return "2019-09-18T22:30:01Z";
		}

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