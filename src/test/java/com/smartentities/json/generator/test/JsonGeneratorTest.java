package com.smartentities.json.generator.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.generators.ObjectGenerator;

public class JsonGeneratorTest {

	public static void main(String[] args) {
		try {
			JSONObject 	jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File("src/test/resources/Schema4.json"))));
			
			Schema schema = SchemaLoader.load(jsonSchema);
			
			if(schema instanceof ObjectSchema) {
				ObjectSchema objectSchema =(ObjectSchema) schema;
				
				JSONObject object = new ObjectGenerator(/* null, */objectSchema).generate();
				System.out.println(object.toString());
			}
			else if(schema instanceof ArraySchema) {
				ArraySchema arraySchema =(ArraySchema) schema;
				
				List<Schema> itemSchemas =  arraySchema.getItemSchemas();
				
				
				
			}
			
			System.out.println("Done");
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
