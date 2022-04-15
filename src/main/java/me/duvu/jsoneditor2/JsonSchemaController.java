package me.duvu.jsoneditor2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.duvu.jsoneditor2.models.JsonSchema;
import me.duvu.jsoneditor2.services.JsonSchemaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/api/json-schemas")
public class JsonSchemaController {
    private final JsonSchemaService jsonSchemaService;

    @Autowired
    public JsonSchemaController(JsonSchemaService jsonSchemaService) {
        this.jsonSchemaService = jsonSchemaService;
    }

    @PostMapping
    public JsonSchema createJsonSchema(@RequestBody String jsonSchema) {
        return jsonSchemaService.createJsonSchema(jsonSchema);
    }

    @GetMapping(value="/all")
    public List<JsonSchema> getAllJsonSchemas() {
        return jsonSchemaService.getAllJsonSchemas();
    }

    @GetMapping(value="/{id}")
    public JsonSchema getJsonSchema(@PathVariable String id) {
        return jsonSchemaService.getJsonSchema(id);
    }
    
}
