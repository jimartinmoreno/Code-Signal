package codesignal.interview.hashTables;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.entry;


public class GroupingDishes {
    static String[][] solution2(String[][] dishes) {
        //        Map<Object, List<Object>> map = Arrays.stream(dishes)
        //                .flatMap(dish -> Arrays.stream(dish)
        //                        .skip(1)
        //                        .map(ingredient -> new AbstractMap.SimpleEntry(ingredient, dish[0])))
        //                .collect(Collectors.groupingBy(AbstractMap.SimpleEntry::getKey,
        //                        TreeMap::new,
        //                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
        //
        //        System.out.println("map = " + map);


        Map<String, List<String>> map = Arrays.stream(dishes)
                .flatMap(dish -> Arrays.stream(dish)
                        .skip(1)
                        .map(ingredient -> entry(ingredient, dish[0])))
                .collect(Collectors.groupingBy(Map.Entry::getKey,
                        TreeMap::new,
                        Collectors.mapping(Map.Entry::getValue, Collectors.toList())));

        System.out.println("map = " + map);

        String[][] response = map.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted()).toArray(String[]::new))
                .toArray(String[][]::new);

        Arrays.stream(response).forEachOrdered(strings -> System.out.println(Arrays.toString(strings)));

        //solution3(dishes);


        return response;


        //        return Arrays.stream(dishes)
        //                .flatMap(dish -> Arrays.stream(dish)
        //                        .skip(1)
        //                        .map(ingredient -> new AbstractMap.SimpleEntry(ingredient, dish[0])))
        //                .collect(Collectors.groupingBy(Map.Entry::getKey, TreeMap::new, Collectors.mapping(Map.Entry::getValue, Collectors.toList())))
        //                .entrySet().stream()
        //                .filter(e -> e.getValue().size() > 1)
        //                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted()).toArray(String[]::new))
        //                .toArray(String[][]::new);
    }

    static String[][] solution(String[][] dishes) {
        final Map<String, Set<String>> map = new TreeMap<>();

        for (String[] dish : dishes) {
            final String name = dish[0];
            for (int i = 1; i < dish.length; i++) {
                /**
                 * It returns the calculated value after adding it to the Map if the key wasn’t found; otherwise, it returns
                 * the existing value. You can use it (en este caso con un .add(name))
                 */
                map.computeIfAbsent(dish[i], v -> new TreeSet<>()).add(name); // Utilizo un set para evitar duplicados
            }
        }

        return map.entrySet().stream()
                .filter(e -> e.getValue().size() > 1)
                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted()).toArray(String[]::new))
                .toArray(String[][]::new);


//        return map.entrySet().stream()
//                .filter(e -> e.getValue().size() > 1)
//                .map(e -> {
//                    final String[] array = new String[e.getValue().size() + 1];
//                    array[0] = e.getKey();
//                    int offset = 1;
//                    for (String item : e.getValue()) {
//                        array[offset++] = item;
//                    }
//                    return array;
//                }).toArray(String[][]::new);
    }

    static String[][] solution3(String[][] dishes) {

        List<String> ingredientsList = Arrays.stream(dishes)
                .flatMap(strings -> Arrays.stream(strings).skip(1))
                .distinct()
                .sorted()
                .toList();

        // System.out.println("ingredientsList = " + ingredientsList);

        Map<String, List<String>> disheshMap = Arrays.stream(dishes)
                .collect(Collectors.groupingBy(strings -> strings[0],
                        Collectors.flatMapping(strings -> Arrays.stream(strings).skip(1),
                                Collectors.toList())));

        // System.out.println("disheshMap = " + disheshMap);


        Map<String, List<String>> map = new TreeMap<>();

        ingredientsList.stream()
                .sorted()
                .forEach(ingredient -> {
                            List<String> dishesList = new ArrayList();
                            map.put(ingredient, dishesList);
                            disheshMap.entrySet().stream()
                                    .filter(entry -> entry.getValue().contains(ingredient))
                                    .forEach(entry -> {
                                        dishesList.add(entry.getKey());
                                        map.put(ingredient, dishesList.stream().sorted().toList());
                                    });
                            if (map.get(ingredient).size() <= 1)
                                map.remove(ingredient);
                        }
                );

        // System.out.println("map = " + map);

        String[][] response = map.entrySet().stream()
                .map(e -> Stream.concat(Stream.of(e.getKey()), e.getValue().stream().sorted())
                        .toArray(String[]::new))
                .toArray(String[][]::new);

        Arrays.stream(response).forEachOrdered(strings -> System.out.println(Arrays.toString(strings)));

        return response;
    }
}
