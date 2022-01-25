package klarna;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CameraTest {

    @Test
    void bestAngle() throws NoTreesException {
        assertEquals(71.56505117707799, Camera.bestAngle(30,
                List.of(new Tree(10, 30),
                        new Tree(10, 31),
                        new Tree(12, 41),
                        new Tree(13, 61),
                        new Tree(-14, -10),
                        new Tree(-14, -10),
                        new Tree(-14, -10),
                        new Tree(-14, -10),
                        new Tree(-14, -10),
                        new Tree(-14, -10),
                        new Tree(10, 32)
                )));
    }

    @Test
    void bestAngleSinEdgeCases() throws NoTreesException {
        assertEquals(71.56505117707799, Camera.bestAngleSinEdgeCases(30,
                List.of(new Tree(10, 30),
                        new Tree(10, 31),
                        new Tree(12, 41),
                        new Tree(13, 61),
                        new Tree(-14, -10),
                        new Tree(10, 32)
                )));
    }

    @Test
    void getTreeAngle() {
        assertEquals(71.56505117707799, Camera.getTreeAngle(new Tree(10, 30)));
        assertEquals(-144.46232220802563, Camera.getTreeAngle(new Tree(-14, -10)));
        assertEquals(-45.0, Camera.getTreeAngle(new Tree(10, -10)));
        assertEquals(-26.56505117707799, Camera.getTreeAngle(new Tree(10, -5)));
        assertEquals(-5.710593137499643, Camera.getTreeAngle(new Tree(10, -1)));
        assertEquals(0.0, Camera.getTreeAngle(new Tree(10, 0)));
        assertEquals(180.0, Camera.getTreeAngle(new Tree(-10, 0)));
        assertEquals(-90.0, Camera.getTreeAngle(new Tree(0, -10)));
        assertEquals(-175.91438322002512, Camera.getTreeAngle(new Tree(-14, -1)));
    }
}