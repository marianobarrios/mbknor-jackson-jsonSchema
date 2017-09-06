package com.simscale.specs.schemagen.testDataScala

import com.simscale.specs.schemagen.JsonSchemaDefault

case class PojoWithParentScala
(
  pojoValue:Boolean,
  child:ParentScala,

  @JsonSchemaDefault("x")
  stringWithDefault:String,
  @JsonSchemaDefault("12")
  intWithDefault:Int,
  @JsonSchemaDefault("true")
  booleanWithDefault:Boolean
)
