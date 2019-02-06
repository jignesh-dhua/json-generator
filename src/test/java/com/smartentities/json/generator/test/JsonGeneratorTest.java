package com.smartentities.json.generator.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.smartentities.json.generator.GeneratorFactory;
import com.smartentities.json.generator.generators.ArrayGenerator;
import com.smartentities.json.generator.generators.ObjectGenerator;

public class JsonGeneratorTest {

	public static void main(String[] args) {
		try {
			//String schemaPath = "src/test/resources/Schema4.json";
			
			String schemaPath = "src/test/resources/AuthorSchema.json";
			
			JSONObject 	jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File(schemaPath))));
			
			Schema schema = SchemaLoader.load(jsonSchema);
			
			System.out.println(GeneratorFactory.getGenerator(schema).generate().toString());
			
//			if(schema instanceof ObjectSchema) {
//				ObjectSchema objectSchema =(ObjectSchema) schema;
//				
//				JSONObject object = new ObjectGenerator(objectSchema).generate();
//				System.out.println(object.toString());
//			} else if(schema instanceof ArraySchema) {
//				ArraySchema arraySchema =(ArraySchema) schema;
//				ArrayGenerator arrayGenerator = new ArrayGenerator(arraySchema);
//				JSONArray jsonArray = arrayGenerator.generate();
//				System.out.println(jsonArray.toString());
//			}
			
			System.out.println("Done");
		} catch (JSONException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
