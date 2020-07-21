package com.example.demo.domain;

import lombok.Data;
import lombok.Builder;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import static org.springframework.data.elasticsearch.annotations.FieldType.Keyword;

@Builder
@Data
public class Topic {

    @Field(type = Keyword)
    String name;

    @Field(type = FieldType.Double) double rating;

}