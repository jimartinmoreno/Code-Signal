package codesignal.arcade.intro;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * https://app.codesignal.com/arcade/intro/level-12/sqZ9qDTFHXBNrQeLC
 */

public class FileNaming {
    static String[] solution(String[] names) {
        List<String> result = new ArrayList<>();
        for (String s : names) { //Itera sobre los nombres
            if (result.contains(s)) { // Comprobamos si existe
                int i = 1;
                while (result.contains(s + "(" + i + ")")) i++; //Comprobamos si existe el nuevo nombre a asignar
                //for (; result.contains(s + "(" + i + ")"); i++) ; //Comprobamos si existe el nuevo nombre a asignar
                s += "(" + i + ")"; // generamos el nuevo nombre
            }
            result.add(s); // Añadimos el nuevo nombre a la lista
        }
        return result.toArray(String[]::new);
    }

    static String[] solution2(String[] names) {
        Map<String, Integer> known = new LinkedHashMap<>();
        for (String name : names) {
            String filename = name;
            while (known.keySet().contains(filename)) {
                filename = name + String.format("(%s)", known.compute(name, (k, v) -> v + 1));
            }
            known.put(filename, 0);
        }
        return known.keySet().toArray(String[]::new);
    }

}
