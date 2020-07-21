package com.example.demo.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.List;

import static org.springframework.data.elasticsearch.annotations.FieldType.*;

@Data
@Builder
@Document(indexName = "messages")
public class Message {

    private static final String[] topicNames = {"server", "client"};

    @Id
    @Field(type = Keyword)
    String id;

    @Field(type = Keyword)
    String date;

    @Field(type = Text)
    String text;

    @Field(type = Nested, includeInParent = true)
    List<Topic> handTopics;

    @Field(type = Nested, includeInParent = true)
    List<Topic> predictionTopics;

    @Field(type = FieldType.Integer)
    int valorization;
}