package week14.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Song song = new Song("Michael Jackson", "Bad", "Thriller", 10);
        song.setSSN("12342344");
        FileOutputStream fileOut;
        try {
            fileOut = new FileOutputStream("/tmp/song.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(song);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/song.ser");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
