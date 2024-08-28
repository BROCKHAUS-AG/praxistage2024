import de.brockhaus.SchereSteinPapierLogik;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SchereSteinPapierSpielLogikTests {

    // Test Methode bestimmeGewinnerString
    @Test
    void testBestimmeGewinner() {
        assertEquals("Unentschieden!", SchereSteinPapierLogik.bestimmeGewinnerString("STEIN", "STEIN"));
        assertEquals("Du gewinnst!", SchereSteinPapierLogik.bestimmeGewinnerString("STEIN", "SCHERE"));
        assertEquals("Roboter gewinnt!", SchereSteinPapierLogik.bestimmeGewinnerString("STEIN", "PAPIER"));
        assertEquals("Du gewinnst!", SchereSteinPapierLogik.bestimmeGewinnerString("PAPIER", "STEIN"));
        assertEquals("Roboter gewinnt!", SchereSteinPapierLogik.bestimmeGewinnerString("PAPIER", "SCHERE"));
        assertEquals("Du gewinnst!", SchereSteinPapierLogik.bestimmeGewinnerString("SCHERE", "PAPIER"));
        assertEquals("Roboter gewinnt!", SchereSteinPapierLogik.bestimmeGewinnerString("SCHERE", "STEIN"));
    }

    // Test Methode bestimmeErgebnisString
    @Test
    void testBestimmeErgebnisString() {
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("STEIN", "STEIN").matches(".*STEIN.*STEIN.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("STEIN", "SCHERE").matches(".*STEIN.*SCHERE.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("STEIN", "PAPIER").matches(".*STEIN.*PAPIER.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("PAPIER", "STEIN").matches(".*PAPIER.*STEIN.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("PAPIER", "SCHERE").matches(".*PAPIER.*SCHERE.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("SCHERE", "PAPIER").matches(".*SCHERE.*PAPIER.*"));
        assertTrue(SchereSteinPapierLogik.bestimmeErgebnisString("SCHERE", "STEIN").matches(".*SCHERE.*STEIN.*"));
    }

    // Test Methode istGewinnerSpieler
    @Test
    void testIstGewinnerSpieler() {
        assertTrue(SchereSteinPapierLogik.istGewinnerSpieler("STEIN", "SCHERE"));
        assertTrue(SchereSteinPapierLogik.istGewinnerSpieler("PAPIER", "STEIN"));
        assertTrue(SchereSteinPapierLogik.istGewinnerSpieler("SCHERE", "PAPIER"));
        assertFalse(SchereSteinPapierLogik.istGewinnerSpieler("STEIN", "PAPIER"));
        assertFalse(SchereSteinPapierLogik.istGewinnerSpieler("PAPIER", "SCHERE"));
        assertFalse(SchereSteinPapierLogik.istGewinnerSpieler("SCHERE", "STEIN"));
    }
}
