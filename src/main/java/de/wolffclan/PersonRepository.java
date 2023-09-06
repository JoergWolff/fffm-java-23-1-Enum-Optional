package de.wolffclan;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonRepository {
    public static final List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }
    public Optional<Person> getPersonById(int id) {
        for (Person person : personList) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }
}

