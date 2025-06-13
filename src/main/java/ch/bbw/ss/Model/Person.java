package ch.bbw.ss.Model;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public final class Person implements Comparable<Person> {
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

    public String name() {
        return name;
    }

    public Contact contact() {
        return contact;
    }

    public Location location() {
        return location;
    }

    public Date birthDate() {
        return birthDate;
    }

    public List<Contact> friends() {
        return friends;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Person) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.contact, that.contact) &&
                Objects.equals(this.location, that.location) &&
                Objects.equals(this.birthDate, that.birthDate) &&
                Objects.equals(this.friends, that.friends);
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

    @Override
    public int compareTo(Person o) {
        return birthDate.compareTo(o.birthDate);
    }
}
