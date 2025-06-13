package ch.bbw.ss.Model;

import java.util.Date;
import java.util.List;

public record Person(String name, Contact contact, Location location, Date birthDate, List<Contact> friends) {
}
