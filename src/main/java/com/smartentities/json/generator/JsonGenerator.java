package com.smartentities.json.generator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.everit.json.schema.ArraySchema;
import org.everit.json.schema.BooleanSchema;
import org.everit.json.schema.NumberSchema;
import org.everit.json.schema.ObjectSchema;
import org.everit.json.schema.Schema;
import org.everit.json.schema.StringSchema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonGenerator {

	public static void main(String[] args) {
		try {
			JSONObject 	jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File("src/main/resources/Schema4.json"))));
			
			Schema schema = SchemaLoader.load(jsonSchema);
			
			if(schema instanceof ObjectSchema) {
				ObjectSchema objectSchema =(ObjectSchema) schema;
				
//				Map<String, Schema> map =  objectSchema.getPropertySchemas();
//				
//				JSONObject object = new JSONObject();
//				for (Entry<String, Schema> entry : map .entrySet()) {
//					String key = entry.getKey();
//					
//					 
//					System.out.println(entry.getValue().getClass());
//					
//					if(entry.getValue() instanceof StringSchema) {
//						System.out.println("String Schema");						
//						
//						
//						object.put(key, new StringGenerator(key, entry.getValue()).generate());
//					} else if(entry.getValue() instanceof NumberSchema) {
//						System.out.println("Number Schema");
//						
//						object.put(key, new NumberGenerator(key, entry.getValue()).generate());
//					} else if(entry.getValue() instanceof BooleanSchema) {
//						System.out.println("Boolean Schema");
//						
//						object.put(key, new BooleanGenerator(key, entry.getValue()).generate());
//						
//					} else if(entry.getValue() instanceof ObjectSchema) {
//						System.out.println("Boolean Schema");
//						
//						object.put(key, new ObjectGenerator(key, entry.getValue()).generate());
//					}
//					
//					
//					
//					
//				}
				JSONObject object = new ObjectGenerator(null, objectSchema).generate();
				System.out.println(object.toString());
				
				
				
				//JSONArray jsonArray = new JSONArray();
				
				//jsonArray.put(object);
				//jsonArray.put(new JSONObject().put("TheKey", "TheValue"));
				
				//System.out.println("*********");
				//System.out.println(jsonArray.toString());
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
