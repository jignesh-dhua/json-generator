package com.smartentities.json.generator.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.everit.json.schema.loader.SchemaLoader.SchemaLoaderBuilder;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.GeneratorConfig;
import com.smartentities.json.generator.GeneratorFactory;
import com.smartentities.json.generator.JsonGenerator;

public class JsonGeneratorTest {

	public static void main(String[] args) {
		try {
			String schemaPath = "src/test/resources/Schema4.json";
			
			//String schemaPath = "src/test/resources/AuthorSchema.json";
			
			
			JsonGenerator jsonGenerator = new JsonGenerator(GeneratorConfig.fromSchemaPath(schemaPath));
			System.out.println(jsonGenerator.generate());
			
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
