package me.duvu.jsoneditor2.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import me.duvu.jsoneditor2.models.JsonSchema;

@Repository
public interface JsonSchemaRepository extends MongoRepository<JsonSchema, String> {
    Optional<JsonSchema> findById(String id);
}

