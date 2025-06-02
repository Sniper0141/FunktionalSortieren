package ch.bbw.ss.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Person {

    private final String name;
    private final Contact contact;
    private final Location location;
    private final Date birthDate;
    private final List<Contact> friends;

    public Person(String name, Contact contact, Location location, Date birthDate, List<Contact> friends) {
        this.name = name;
        this.contact = contact;
        this.location = location;
        this.birthDate = birthDate;
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public Contact getContact() {
        return contact;
    }

    public Location getLocation() {
        return location;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public List<Contact> getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return "Person[" +
                "name=" + name + ", " +
                "contact=" + contact + ", " +
                "location=" + location + ", " +
                "birthDate=" + birthDate + ", " +
                "friends=" + friends + ']';
    }
}
