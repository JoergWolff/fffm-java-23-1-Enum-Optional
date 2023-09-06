package de.wolffclan;

import java.util.Optional;

import static de.wolffclan.DaysOfWeek.pruefeWochentag;
import static de.wolffclan.PersonRepository.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enum and Optionals");
        System.out.println("-------------------");

        PersonRepository personRepository = new PersonRepository();
        Person person1 = new Person(1, "Franz", DaysOfWeek.MONDAY, Gender.MALE);
        Person person2 = new Person(3, "Heidi", DaysOfWeek.FRIDAY, Gender.FEMALE);
        Person person3 = new Person(4, "Klaus-Bärbel", DaysOfWeek.SATURDAY, Gender.DIVERS);
        Person person4 = new Person(5, "Hugo", DaysOfWeek.SATURDAY, Gender.MALE);
        System.out.println(person1);
        personRepository.addPerson(person1);
        personRepository.addPerson(person2);
        personRepository.addPerson(person3);
        personRepository.addPerson(person4);
        // person with id 2 is not available
        System.out.println(getPersonById(2));

        // Optional id
        showOptionalPersonById(2); // Not available
        showOptionalPersonById(3);
        // Gender
        System.out.println("\nGender\n---------");
        System.out.println(showGender());
        // Optional Name
        showOptionalPersonByName("Klaus-Bärbel");
        showOptionalPersonByName("Hans-Jürgen");// Not available
    }


    private static void showOptionalPersonById(int id) {
        System.out.println("\nshowOptionalPersonById(int id)\n----------------------");
        Optional<Person> optionalPerson = getPersonById(id);
        if (optionalPerson.isPresent()) {
            Person person = optionalPerson.get();
            System.out.println(person.name() + " hat den Lieblingstag am " + pruefeWochentag(person.favoriteDay()));
        } else {
            System.out.println("Person is not available");
        }
    }

    private static void showOptionalPersonByName(String name) {
        System.out.println("\nshowOptionalPersonByName(String name)\n-----------------");
        Optional<Person> optionalPerson = getPersonByName(name);
        if (optionalPerson.isPresent()) {
            Person p = optionalPerson.get();
            System.out.println("Id: " + p.id() + "\nName: " + p.name() + "\nSpezial Day: " + p.favoriteDay() + "\nGender: " + p.gender());
        } else {
            System.out.println("No entry found...");
        }
    }
}