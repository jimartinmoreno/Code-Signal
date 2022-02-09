package codesignal.arcade.thecore;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StolenLunchTest {

    @Test
    void solution() {
        assertEquals("", StolenLunch.solution(""));
        assertEquals("you'll never guess it: 2390", StolenLunch.solution("you'll n4v4r 6u4ss 8t: cdja"));
        assertEquals("9ust gd93hd som4 r0n3om not4 9k735id 3sicd t70t you, 359cdi 3s5di l8ttl4 on4?, w8ll 019kdi sid    sk3ud cjn4v4r 64t!", StolenLunch.solution("just 63jd73 some random note jkhdf83 ds823 that you, dfj238 dsf38 little one?, will abjk38 s83    skdu3 29never get!"));
    }
}