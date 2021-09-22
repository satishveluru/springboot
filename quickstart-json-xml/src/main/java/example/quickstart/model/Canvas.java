package example.quickstart.model;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import example.quickstart.enums.Color;

public class Canvas {
    @JsonDeserialize(using = ColorDeserializer.class)
    public Color color;
 }
 
class ColorDeserializer extends JsonDeserializer<Color>
 {
    @Override
    public Color deserialize(JsonParser jsonParser,
                             DeserializationContext
                             deserializationContext)
       throws IOException, JsonProcessingException
    {
       switch (jsonParser.getText().toLowerCase())
       {
          case "black":
             return Color.BLACK;
          default:
             return Color.UNKNOWN;
       }
    }
 }
