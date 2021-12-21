package codesignal.interview.hashTables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingDishes {
    static String[][] solution2(String[][] dishes) {
        return Arrays.stream(dishes)
                .flatMap(dish -> Arrays.stream(dish).skip(1).map(i -> new AbstractMap.SimpleEntry(i, dish[0])))
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey, TreeMap::new, Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
                .entrySet()
                .stream()
                .filter(e -> e.getValue().size() > 1)
                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted()).toArray(String[]::new))
                .toArray(String[][]::new);
    }

    static String[][] solution(String[][] dishes) {
        final Map<String, Set<String>> map = new TreeMap<>();

        for (String[] dish : dishes) {
            final String name = dish[0];
            for (int i = 1; i < dish.length; i++) {
                map.computeIfAbsent(dish[i], v -> new TreeSet<>()).add(name);
            }
        }

        return map.entrySet().stream().filter(e -> e.getValue().size() > 1).map(e -> {
            final String[] array = new String[e.getValue().size() + 1];
            array[0] = e.getKey();
            int offset = 1;
            for (String item : e.getValue()) {
                array[offset++] = item;
            }
            return array;
        }).toArray(String[][]::new);
    }
}
