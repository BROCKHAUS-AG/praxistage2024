import de.brockhaus.SpielLogik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SpielLogikTests {

    // Test Methode bestimmeGewinnerString
    @Test
    void testBestimmeGewinner() {
        assertEquals("Unentschieden!", SpielLogik.bestimmeGewinnerString("STEIN", "STEIN"));
        assertEquals("Du gewinnst!", SpielLogik.bestimmeGewinnerString("STEIN", "SCHERE"));
        assertEquals("Roboter gewinnt!", SpielLogik.bestimmeGewinnerString("STEIN", "PAPIER"));
        assertEquals("Du gewinnst!", SpielLogik.bestimmeGewinnerString("PAPIER", "STEIN"));
        assertEquals("Roboter gewinnt!", SpielLogik.bestimmeGewinnerString("PAPIER", "SCHERE"));
        assertEquals("Du gewinnst!", SpielLogik.bestimmeGewinnerString("SCHERE", "PAPIER"));
        assertEquals("Roboter gewinnt!", SpielLogik.bestimmeGewinnerString("SCHERE", "STEIN"));
    }

    // Test Methode bestimmeErgebnisString
    @Test
    void testBestimmeErgebnisString() {
        assertTrue(SpielLogik.bestimmeErgebnisString("STEIN", "STEIN").matches(".*STEIN.*STEIN.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("STEIN", "SCHERE").matches(".*STEIN.*SCHERE.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("STEIN", "PAPIER").matches(".*STEIN.*PAPIER.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("PAPIER", "STEIN").matches(".*PAPIER.*STEIN.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("PAPIER", "SCHERE").matches(".*PAPIER.*SCHERE.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("SCHERE", "PAPIER").matches(".*SCHERE.*PAPIER.*"));
        assertTrue(SpielLogik.bestimmeErgebnisString("SCHERE", "STEIN").matches(".*SCHERE.*STEIN.*"));
    }

    // Test Methode istGewinnerSpieler
    @Test
    void testIstGewinnerSpieler() {
        assertTrue(SpielLogik.istGewinnerSpieler("STEIN", "SCHERE"));
        assertTrue(SpielLogik.istGewinnerSpieler("PAPIER", "STEIN"));
        assertTrue(SpielLogik.istGewinnerSpieler("SCHERE", "PAPIER"));
        assertFalse(SpielLogik.istGewinnerSpieler("STEIN", "PAPIER"));
        assertFalse(SpielLogik.istGewinnerSpieler("PAPIER", "SCHERE"));
        assertFalse(SpielLogik.istGewinnerSpieler("SCHERE", "STEIN"));
    }
}
