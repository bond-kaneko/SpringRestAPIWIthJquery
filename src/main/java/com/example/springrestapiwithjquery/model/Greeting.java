package com.example.springrestapiwithjquery.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class Greeting {
    @JsonProperty("id")
    private int id;
    @JsonProperty("content")
    private String content;

    public Greeting(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
