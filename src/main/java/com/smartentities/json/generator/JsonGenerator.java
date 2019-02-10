package com.smartentities.json.generator;

public class JsonGenerator {

	private GeneratorConfig generatorConfig;

		
	public JsonGenerator(GeneratorConfig generatorConfig) {
		this.generatorConfig = generatorConfig;
	}

	public String generate() {
		return GeneratorFactory.getGenerator(generatorConfig.schema).generate().toString();
	}
}