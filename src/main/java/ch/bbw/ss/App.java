package ch.bbw.ss;

import ch.bbw.ss.Model.Person;
import ch.bbw.ss.TestData.DataProvider;

import java.util.Collections;
import java.util.Objects;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        var data = new java.util.ArrayList<>(Objects.requireNonNull(DataProvider.GetData()));

        System.out.println("\n---------------Natural Order---------------");
        Collections.sort(data);
        data.forEach(System.out::println);
    }
}
