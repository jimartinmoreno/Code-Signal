package mytests;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.AbstractMap.Entry;
import static java.util.AbstractMap.SimpleEntry;
import static java.util.Map.entry;

public class Map {



    public static void main(String[] args) {
//        extracted();
//        extracted1();

        List<String> list = new ArrayList<>();
        list.add("String 1");

        List<String> list2 = Collections.unmodifiableList(list);
        list2.set(0, "String 2");

        List<String> list3 = list.stream().toList();
        list3.add("String 2");

    }


    private static void extracted1() {
        Entry entry1 = entry("ingredient", "value1");
        Entry entry2 = entry("ingredient", "value2");

        java.util.Map myMap2 = Stream.of(entry1, entry2)
                .collect(Collectors.groupingBy(Entry::getKey,
                        HashMap::new,
                        Collectors.mapping(Entry::getValue, Collectors.toList())));

        System.out.println("myMap = " + myMap2);
    }

    private static void extracted() {
        Entry entry1 = new SimpleEntry("ingredient", "value1");
        Entry entry2 = new SimpleEntry("ingredient", "value2");

        java.util.Map myMap = Stream.of(entry1, entry2)
                .collect(Collectors.groupingBy(Entry::getKey,
                TreeMap::new,
                Collectors.mapping(Entry::getValue, Collectors.toList())));

        System.out.println("myMap = " + myMap);
    }
}
