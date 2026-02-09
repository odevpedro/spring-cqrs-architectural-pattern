package com.course.cqrs.proto_api.models;

import lombok.Builder;

import java.util.Date;

@Builder
public class Person {

private String id;
private String fullName;
private Date birthDate;
private Integer age;

}
