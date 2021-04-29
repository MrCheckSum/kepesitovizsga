package hu.nive.ujratervezes.kepesitovizsga.phonebook;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class PhoneBook {


    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null || contacts == null) {
            throw new IllegalArgumentException("Wrong folder");
        }

        Path path = Path.of(output);
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {

            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");

            }

        } catch (IOException ioException) {
            throw new IllegalStateException("File is non-writeable")
        }
    }
}