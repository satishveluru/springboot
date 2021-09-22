package example.quickstart.jackson.readAnnotations;

import com.fasterxml.jackson.databind.ObjectMapper;

import example.quickstart.model.Canvas;

public class JacksonDesializeDemo {

    public static void main(String[] args) throws Exception
    {
       String jsonContent =
       "{" +
       "   \"color\": \"black\"" +
       "}";
       Canvas canvas =
          new ObjectMapper().readerFor(Canvas.class)
                            .readValue(jsonContent);
       System.out.printf("Color = %s%n", canvas.color);
    }
 }
