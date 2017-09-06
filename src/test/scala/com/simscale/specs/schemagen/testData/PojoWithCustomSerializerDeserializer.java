package com.simscale.specs.schemagen.testData;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;

public class PojoWithCustomSerializerDeserializer extends JsonDeserializer<PojoWithCustomSerializer> {

    @Override
    public PojoWithCustomSerializer deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        String s = p.getText();
        s = s.substring(0, s.length()-2); // Removing the trailing **
        PojoWithCustomSerializer r = new PojoWithCustomSerializer();
        r.myString = s;
        return r;
    }
}
