package com.smartentities.json.generator.generators;

import java.util.Map;
import java.util.Map.Entry;

import org.everit.json.schema.BooleanSchema;
import org.everit.json.schema.NumberSchema;
import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;
import org.json.JSONObject;

public class ObjectGenerator extends JsonValueGenerator<JSONObject> {

	public ObjectGenerator(Schema schema) {
		super(schema);
	}

	@Override
	public JSONObject generate() {

		if (schema instanceof ObjectSchema) {
			ObjectSchema objectSchema = (ObjectSchema) schema;

			Map<String, Schema> map = objectSchema.getPropertySchemas();

			JSONObject object = new JSONObject();
			for (Entry<String, Schema> entry : map.entrySet()) {
				String key = entry.getKey();

				System.out.println(entry.getValue().getClass());

				if (entry.getValue() instanceof StringSchema) {
					object.put(key, new StringGenerator(entry.getValue()).generate());
				} else if (entry.getValue() instanceof NumberSchema) {
					object.put(key, new NumberGenerator(entry.getValue()).generate());
				} else if (entry.getValue() instanceof BooleanSchema) {
					object.put(key, new BooleanGenerator(entry.getValue()).generate());
				} else if (entry.getValue() instanceof ObjectSchema) {
					object.put(key, new ObjectGenerator(entry.getValue()).generate());
				}

			}
			return object;
		}

		return null;
	}
}
