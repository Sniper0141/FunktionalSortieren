package ch.bbw.ss;

import ch.bbw.ss.Model.Person;
import org.instancio.Instancio;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var data = GetData();
        System.out.println(data);
    }

    private static List<Person> GetData(){
        List<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var person = Instancio.create(Person.class);
            persons.add(person);
        }
        return persons;
    }
}
