import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ZufaelligeNotengebungTest {
	private ZufaelligeNotengebung zufaelligeNotengebung = new ZufaelligeNotengebung();

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGeneriereZufaelligePruefungsnote() {
		for (int i = 0; i < 1000000; i++) {
			assertTrue(zufaelligeNotengebung.generiereZufaelligePruefungsnote() < 6.0);
		}
	}
}
 