package practice10;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExample {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        readFile();
    }

    public static void readFile() throws IOException, FileNotFoundException {
        // Simulate an exception
        throw new FileNotFoundException("File not found!");
    }
}
