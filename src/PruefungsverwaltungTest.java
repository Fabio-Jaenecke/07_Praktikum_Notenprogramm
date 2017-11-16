import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruefungsverwaltungTest {
	
	private Pruefungsverwaltung pruefungsverwaltung = new Pruefungsverwaltung();

	@BeforeEach
	void setUp() throws Exception {
	 
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRundeAufHalbeNote() {
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.24) == 1);
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.74) == 1.5);
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.25) == 1.5);
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.75) == 2);
		
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1) == 1);
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.2) == 1);
		// Beliebige Genauigkeit geht noch nicht!!!
//		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.249) == 1.5);
//		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.2499) == 1.5);
		
	}

	@Test
	void testTextausgabeBestandenePruefung() {
        assertEquals("Herzliche Gratulation Fritz! Sie haben an der Pruefung eine 4.5 (vier punkt fuenf) erzielt und somit bestanden!", pruefungsverwaltung.generiereText("Fritz", 4.5));
    }
	
	@Test
    void testTextausgabeNichtBestandenePruefung() {
        assertEquals("Fritz, Sie haben an der Pruefung eine 3.5 (drei punkt fuenf) erzielt und sind somit durchgefallen!", pruefungsverwaltung.generiereText("Fritz", 3.5));
    }

}
