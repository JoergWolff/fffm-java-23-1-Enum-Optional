package de.wolffclan;

import java.util.Optional;

import static de.wolffclan.DaysOfWeek.pruefeWochentag;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enum and Optionals");
        System.out.println("-------------------");

        PersonRepository personRepository = new PersonRepository();
        Person person1 = new Person(1, "Franz", DaysOfWeek.FRIDAY);
        System.out.println(person1);
        personRepository.addPerson(person1);
        // person with id 2 is not available
        System.out.println(personRepository.getPersonById(2));

        Optional<Person> optionalPerson1 = personRepository.getPersonById(1);
        giveFeedback(optionalPerson1);
        Optional<Person> optionalPerson2 = personRepository.getPersonById(2);
        giveFeedback(optionalPerson2);
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