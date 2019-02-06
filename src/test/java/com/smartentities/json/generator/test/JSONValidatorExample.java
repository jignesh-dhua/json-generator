package com.smartentities.json.generator.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONValidatorExample {

	public static void main(String[] args) {

		try {
			JSONObject 	jsonSchema = new JSONObject(new JSONTokener(new FileInputStream(new File("src/test/resources/AuthorSchema.json"))));

			JSONArray jsonSubject = new JSONArray(new JSONTokener(new FileInputStream(new File("src/test/resources/Sample1.json"))));

			Schema schema = SchemaLoader.load(jsonSchema);
			schema.validate(jsonSubject);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ValidationException e) {
			e.printStackTrace();
			e.getCausingExceptions().stream()
		      .map(ValidationException::getMessage)
		      .forEach(System.out::println);
		}
	}
}
