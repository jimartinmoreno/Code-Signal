package mytests;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    final private List<String> miLista;

    public ListTest(List<String> miLista) {
        this.miLista = miLista.stream().toList();
    }

    public List<String> getMiLista() {
        return miLista;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("String 1");
        new ListTest(list).getMiLista().add("String 2");
    }
}
