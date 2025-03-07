package com.osintech.jobservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Document
@NoArgsConstructor
@AllArgsConstructor(staticName = "create")
public class Job {

    @Id
    private String id;
    private String description;
    private String company;
    private Set<String> skills;
    private Integer salary;
    private Boolean isRemote;



}
