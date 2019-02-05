package com.smartentities.json.generator;

import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;
import org.json.JSONArray;
import org.json.JSONObject;

public class StringJsonGenerator {

	private String propertyName;
	private Schema stringSchema;
	
	public StringJsonGenerator(String propertyName, Schema schema) {
		
	}
	public JSONObject generate() {

		JSONObject jsonObject = new JSONObject();
		
		
		jsonObject.put(propertyName, "Test");

		return jsonObject;
	}
}