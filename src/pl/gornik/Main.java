package pl.gornik;

import pl.gornik.model.ComparatorBySurname;
import pl.gornik.model.Person;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setHash = new HashSet<>();
        Set<Integer> setLinked = new LinkedHashSet<>();
        Set<Integer> setTree = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

//        for (int i = 0; i < 20; i++){
//            int number = random.nextInt(100);
//            setHash.add(number);
//            setLinked.add(number);
//            setTree.add(number);
//            list.add(number);
//        }

        int i = 0;
        while ( i < 20){
            int number = random.nextInt(100);
            setHash.add(number);
            setLinked.add(number);
            setTree.add(number);
            list.add(number);
            i++;
        }

        Integer[] HashArray = setHash.toArray(new Integer[setHash.size()]);
        System.out.println("Element z HashSet: " + HashArray[2]);

        List<Integer> list1 = new LinkedList<>(setHash);
        System.out.println("Element z LinkedList: " + list1.get(2));

        System.out.println("HashSet\n" + setHash);
        System.out.println("LinkedSet\n" + setLinked);
        System.out.println("TreeSet\n" + setTree);
        System.out.println("Lista\n" + list);
        System.out.println("Długość listy: " + list.size());
        System.out.println("Czy liczba 30 jest w liście: " + list.contains(30));
        System.out.println("Porównanie Listy i HashSet: " + list.containsAll(setHash));

        System.out.println("----------------------------------------");

        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Zbigniew", "Korwin", 69, "21370905202");
        Person person2 = new Person("Janusz", "Korwin", 56, "21370905202");
        Person person3 = new Person("Mateusz", "Morawiecki", 49, "21100905202");
        Person person4 = new Person("Donald", "Tusk", 90, "21030905202");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        for (Person person : persons){
            System.out.println(person);
        }

        System.out.println("----------------------------------------");

        ComparatorBySurname comp = new ComparatorBySurname();
        Set<Person> personTreeSet = new TreeSet<>(comp);
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);

        for (Person person : personTreeSet){
            System.out.println(person);
        }
    }
}