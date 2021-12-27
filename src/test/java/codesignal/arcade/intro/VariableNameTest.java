package codesignal.arcade.intro;

import codesignal.arcade.intro.VariableName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VariableNameTest {

    @Test
    void solution() {
        assertEquals(true, VariableName.solution("var_1__Int"));
        assertEquals(false, VariableName.solution("qq-q"));
        assertEquals(false, VariableName.solution("2w2"));
    }
}