package com.simscale.specs.schemagen.testData;

import com.simscale.specs.schemagen.JsonSchemaInject;

@JsonSchemaInject(json = "{\"JsonSchemaInjectOnEnum\":true}")
public enum MyEnum {
    E,B,A,D,C
}
