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
	void testRundeAufHalbeNote() {												//Gültige Äquivalenzklassen:
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.24) == 1);			//1
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(0.24 + 1) == 1);		//2
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.74) == 1.5);			//1
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(0.74 + 1) == 1.5);		//2
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.25) == 1.5);			//1
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(0.25 + 1) == 1.5);		//2
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.75) == 2);			//1
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(0.75 + 1) == 2);		//2
		assertNotNull(pruefungsverwaltung.rundeAufHalbeNote(0) == 0);			//1
		
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1) == 1);				//1
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.2) == 1);			//1
		// Beliebige Genauigkeit geht noch nicht!!!
//		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.249) == 1.5);
//		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(1.2499) == 1.5);
																				//Ungültige Äquivalenzklassen:
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(-0.24) == 1);			//3
		assertTrue(pruefungsverwaltung.rundeAufHalbeNote(-0.74 - 2) == 1);		//4
		assertFalse(pruefungsverwaltung.rundeAufHalbeNote(6.24) == 6);			//5
		assertFalse(pruefungsverwaltung.rundeAufHalbeNote(6.24 + 1) == 6);		//6
		assertNotEquals(1, pruefungsverwaltung.rundeAufHalbeNote(-3.75 + 4));	//7
		assertFalse(pruefungsverwaltung.rundeAufHalbeNote(8.24 - 2) == 6);		//8
		
		
	}

	@Test
	void testTextausgabeBestandenePruefung() {
        assertEquals("Herzliche Gratulation Fritz! Sie haben an der Pruefung eine 5.5 (fuenf punkt fuenf) erzielt und somit bestanden!", pruefungsverwaltung.generiereText("Fritz", 5.5));
    }
	
	@Test
    void testTextausgabeNichtBestandenePruefung() {
        assertEquals("Peter, Sie haben an der Pruefung eine 2.5 (zwei punkt fuenf) erzielt und sind somit durchgefallen!", pruefungsverwaltung.generiereText("Peter", 2.5));
    }

}
