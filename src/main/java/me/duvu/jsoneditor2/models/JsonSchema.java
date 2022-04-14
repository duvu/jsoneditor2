package me.duvu.jsoneditor2.models;

import org.springframework.data.annotation.Id;

public class JsonSchema {
    @Id private String id;

    private String document;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
