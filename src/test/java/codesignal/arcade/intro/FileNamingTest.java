package codesignal.arcade.intro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FileNamingTest {

    @Test
    void solution() {
        assertArrayEquals(new String[]{"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"},
                FileNaming.solution(new String[]{"doc", "doc", "image", "doc(1)", "doc"}));
        assertArrayEquals(new String[]{"a(1)",
                        "a(6)",
                        "a",
                        "a(2)",
                        "a(3)",
                        "a(4)",
                        "a(5)",
                        "a(7)",
                        "a(8)",
                        "a(9)",
                        "a(10)",
                        "a(11)"},
                FileNaming.solution(new String[]{"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}));
    }

    @Test
    void solution2() {
        assertArrayEquals(new String[]{"doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"},
                FileNaming.solution2(new String[]{"doc", "doc", "image", "doc(1)", "doc"}));
        assertArrayEquals(new String[]{"a(1)",
                        "a(6)",
                        "a",
                        "a(2)",
                        "a(3)",
                        "a(4)",
                        "a(5)",
                        "a(7)",
                        "a(8)",
                        "a(9)",
                        "a(10)",
                        "a(11)"},
                FileNaming.solution2(new String[]{"a(1)", "a(6)", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a"}));
    }
}