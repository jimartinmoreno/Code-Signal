package codesignal.interview.arrays;

import java.util.*;
import java.util.stream.Collectors;

public class IsCryptSolution {
    static boolean solution(String[] crypt, char[][] solution) {

        Map<String, String> solutionMap = Arrays.stream(solution)
                .collect(Collectors.toMap(chars -> String.valueOf(chars[0]), chars -> String.valueOf(chars[1])));
        System.out.println("solutionMap = " + solutionMap);

        List<String> lista = Arrays.stream(crypt)
                .map(s -> Arrays.stream(s.split(""))
                        .reduce("", (s1, s2) -> s1 + solutionMap.get(s2))
                ).toList();

        System.out.println("lista = " + lista);

        Optional<String> leadingZeroes = lista.stream()
                .filter(s -> s.length() != 1 && s.charAt(0) == '0').findAny();
        System.out.println("NO leadingZeroes = " + leadingZeroes.isEmpty());
        System.out.println((Long.parseLong(lista.get(0)) + Long.parseLong(lista.get(1))) + " == " + lista.get(2));
        return leadingZeroes.isEmpty() && Long.parseLong(lista.get(0)) + Long.parseLong(lista.get(1)) == Long.parseLong(lista.get(2));
    }

    static boolean solution2(String[] crypt, char[][] solution) {
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < solution.length; i++) {
            map.put(solution[i][0], solution[i][1]);
        }
        List<String> list = new ArrayList<>();
        for (String str : crypt) {
            if (map.get(str.charAt(0)) == '0' && str.length() > 1) return false;
            StringBuilder s = new StringBuilder();
            for (char c : str.toCharArray()) {
                s.append(map.get(c) + "");
            }
            list.add(s.toString());
        }

        double num1 = Double.parseDouble(list.get(0));
        double num2 = Double.parseDouble(list.get(1));
        double num3 = Double.parseDouble(list.get(2));

        return num1 + num2 == num3;
    }

}
