package week14.serialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonSerializationDemo {
    public static void main(String [] args) throws JsonProcessingException {
        Song song = new Song("Taylor Swift", "Exile", "Folklore", 20);
        song.setSSN("234234234");
        ObjectMapper objectMapper = new ObjectMapper();
        String serializedCharacter = objectMapper.writeValueAsString(song);
        System.out.println("serializedCharacter = " + serializedCharacter);
        Song deserializedCharacter = objectMapper.readValue(serializedCharacter, Song.class);
        System.out.println("deserializedCharacter = " + deserializedCharacter.toString());

    }
}
