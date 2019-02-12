package com.smartentities.json.generator.test;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.everit.json.schema.loader.SchemaLoader.SchemaLoaderBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.GeneratorConfig;
import com.smartentities.json.generator.GeneratorFactory;
import com.smartentities.json.generator.JsonGenerator;

public class JsonGeneratorTest {

	public static void main(String[] args) {
		try {
			//String schemaPath = "src/test/resources/Schema4.json";
			
			String schemaPath = "src/test/resources/AuthorSchema.json";
			GeneratorConfig generatorConfig= GeneratorConfig.fromSchemaPath(schemaPath);
			
			JsonGenerator jsonGenerator = new JsonGenerator(generatorConfig);
			
			String json = jsonGenerator.generate();
			System.out.println(json);
			
			
			//Validate generated message
			JSONArray jsonSubject = new JSONArray(new JSONTokener(new ByteArrayInputStream(json.getBytes(Charset.defaultCharset()))));

			Schema schema = SchemaLoader.load(generatorConfig.getJsonSchema());
			schema.validate(jsonSubject);
			
			
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
