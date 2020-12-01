package Menu;

import Entity.Person;
import ReaderWriter.Reader;
import ReaderWriter.Writer;

import java.io.IOException;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) throws IOException {
        Person p1 = new Person("Nghia", 1, true);
        Person p2 = new Person("John", 2, false);
        Person p3 = new Person("Inflame", 3, false);
        Person p4 = new Person("Mama", 4, true);
        Person p5 = new Person("Whom", 5, true);
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        Reader reader = new Reader();
        Writer writer = new Writer();
        String fileLocation = "Test.csv";
        for (Person person : people) {
            writer.writeCSV(fileLocation,person);
        }
        reader.readCSV(fileLocation);


    }
}
