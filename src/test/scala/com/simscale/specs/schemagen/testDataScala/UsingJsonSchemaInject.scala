package com.simscale.specs.schemagen.testDataScala

import java.util.function.Supplier
import com.fasterxml.jackson.databind.{JsonNode, ObjectMapper}

class UserNamesLoader extends Supplier[JsonNode] {
  val _objectMapper = new ObjectMapper()

  override def get(): JsonNode = {
    val schema = _objectMapper.createObjectNode()
    val values = schema.putObject("items").putArray("enum")
    values.add("foo")
    values.add("bar")

    schema
  }
}

class CustomUserNamesLoader(custom:String) extends Supplier[JsonNode] {
  val _objectMapper = new ObjectMapper()

  override def get(): JsonNode = {
    val schema = _objectMapper.createObjectNode()
    val values = schema.putObject("items").putArray("enum")
    values.add("foo_"+custom)
    values.add("bar_"+custom)

    schema
  }
}
  










