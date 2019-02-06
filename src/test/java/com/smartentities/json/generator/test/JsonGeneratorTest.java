package com.smartentities.json.generator.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.GeneratorFactory;

public class JsonGeneratorTest {

	public static void main(String[] args) {
		try {
			//String schemaPath = "src/test/resources/Schema4.json";
			
			String schemaPath = "src/test/resources/AuthorSchema.json";
			
			JSONObject 	jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File(schemaPath))));
			
			Schema schema = SchemaLoader.load(jsonSchema);
			
			System.out.println(GeneratorFactory.getGenerator(schema).generate().toString());
			
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
