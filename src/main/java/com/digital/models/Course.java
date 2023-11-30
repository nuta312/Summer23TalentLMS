package com.digital.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonIgnoreProperties( ignoreUnknown = true)
@JsonInclude (JsonInclude.Include.NON_NULL)
public class Course extends BaseEntity {
    private String id;
    private String name;
    private int code;
    @JsonProperty(value = "creator_id")
    private int creatorId;
    private String description;
    private String price;



}
