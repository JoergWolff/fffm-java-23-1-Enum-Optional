package de.wolffclan;

import java.util.*;

public class PersonRepository {
    public static final List<Person> personList = new ArrayList<>();

    public void addPerson(Person person){
        personList.add(person);
    }
    public static Optional<Person> getPersonById(int id) {
        for (Person person : personList) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }


    public static Map<Gender, Integer> showGender() {
        Map<Gender, Integer> genderMap = new HashMap<>();
        for (Person person : personList) {
            switch (person.gender()) {
                case MALE ->{
                    if(genderMap.containsKey(Gender.MALE)){
                       Integer integer = genderMap.get(Gender.MALE) + 1;
                       genderMap.put(Gender.MALE,integer);
                    }
                    else {
                        genderMap.put(person.gender(), 1);
                    }
                }
                case DIVERS -> {
                    if(genderMap.containsKey(Gender.DIVERS)){
                        Integer integer = genderMap.get(Gender.DIVERS) + 1;
                        genderMap.put(Gender.DIVERS,integer);
                    }
                    else {
                        genderMap.put(person.gender(), 1);
                    }
                }
                case FEMALE -> {
                    if(genderMap.containsKey(Gender.FEMALE)){
                        Integer integer = genderMap.get(Gender.FEMALE) + 1;
                        genderMap.put(Gender.FEMALE,integer);
                    }
                    else {
                        genderMap.put(person.gender(), 1);
                    }
                }
            }
        }
        return genderMap;
    }
}

