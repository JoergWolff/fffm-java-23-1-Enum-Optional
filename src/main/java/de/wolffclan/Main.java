package de.wolffclan;

import java.util.Optional;

import static de.wolffclan.DaysOfWeek.pruefeWochentag;
import static de.wolffclan.PersonRepository.getPersonById;
import static de.wolffclan.PersonRepository.showGender;

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

        Optional<Person> optionalPerson1 = getPersonById(1);
        giveFeedback(optionalPerson1);
        Optional<Person> optionalPerson2 = getPersonById(2);
        giveFeedback(optionalPerson2);

        // Gender
        System.out.println("Gender");
        System.out.println(showGender());
    }

    private static void giveFeedback(Optional<Person> optionalPerson){
        if(optionalPerson.isPresent()){
            Person p1 = optionalPerson.get();
            System.out.println(p1.name() + " hat den Lieblingstag am " + pruefeWochentag(p1.favoriteDay()));
        }
        else {
            System.out.println("Person is not available");
        }
    }
}