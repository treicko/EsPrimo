package EsPrimo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EsPrimoTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void DevuelveTrueYaQueRecibeUnNueroPrimoElCualEsDos() {
		EsPrimo esprimo = new EsPrimo();
		assertTrue(esprimo.EsNumeroPrimo(2));
	}
	
	@Test
	public void DevuelveFalseYaQueRecibeUnNueroQueNoEsPrimoElCualEsDos() {
		EsPrimo esprimo = new EsPrimo();
		assertFalse(esprimo.EsNumeroPrimo(4));
	}
	
	@Test
	public void DevuelveFalseYaQueRecibeUnNueroQueNoEsPrimoElCualEsNoventaYNueve() {
		EsPrimo esprimo = new EsPrimo();
		assertFalse(esprimo.EsNumeroPrimo(99));
	}

}
