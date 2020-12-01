package ReaderWriter;

import Entity.Person;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private final String semicolon = ",";

    public void readCSV(String fileLocation) throws IOException {
        File file = new File(fileLocation);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] split = line.split(semicolon);
            System.out.println();
            for (String str : split) {
                System.out.print(str + " ");
            }
        }
    }
}

