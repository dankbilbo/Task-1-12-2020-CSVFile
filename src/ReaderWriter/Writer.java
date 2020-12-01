package ReaderWriter;
import Entity.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private final String semicolon = ",";
    private final String newLine = "\n";
    public void writeCSV(String fileLocation, Person person) throws IOException {
        File file = new File(fileLocation);
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.append(Integer.toString(person.getId()));
        fileWriter.append(semicolon);
        fileWriter.append(person.getName());
        fileWriter.append(semicolon);
        fileWriter.append(Boolean.toString(person.isGender()));
        fileWriter.append(newLine);
        fileWriter.close();
    }
}
