package me.duvu.jsoneditor2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.duvu.jsoneditor2.models.JsonSchema;
import me.duvu.jsoneditor2.repositories.JsonSchemaRepository;

@Service
public class JsonSchemaService {
    private final JsonSchemaRepository jsonSchemaRepository;

    @Autowired
    public JsonSchemaService(JsonSchemaRepository jsonSchemaRepository) {
        this.jsonSchemaRepository = jsonSchemaRepository;
    }

    public JsonSchema createJsonSchema(String jsonSchema) {
        JsonSchema jsonSchemaModel = new JsonSchema();
        jsonSchemaModel.setDocument(jsonSchema);
        return jsonSchemaRepository.save(jsonSchemaModel);
    }

    public JsonSchema updateJsonSchema(String id, String jsonSchema) {
        JsonSchema jsonSchemaModel = jsonSchemaRepository.findById(id).get();
        jsonSchemaModel.setDocument(jsonSchema);
        return jsonSchemaRepository.save(jsonSchemaModel);
    }

    public List<JsonSchema> getAllJsonSchemas() {
        return jsonSchemaRepository.findAll();
    }

    public void deleteJsonSchema(String id) {
        jsonSchemaRepository.deleteById(id);
    }

    public void deleteAllJsonSchemas() {
        jsonSchemaRepository.deleteAll();
    }
}
