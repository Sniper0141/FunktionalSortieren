package ch.bbw.ss.Model;

import java.util.Comparator;
import java.util.Date;
import java.util.List;

public record Person(String name, Contact contact, Location location, Date birthDate, List<Contact> friends)
        implements Comparable {
    @Override
    public int compareTo(Object o) {
        var p = (Person)o;
        return birthDate.compareTo(p.birthDate);
    }
}
