package tollBarrier.bornes.tests;

import static org.junit.Assert.*;

import java.util.Set;

import tollBarrier.vehicule.MoyenDePaiment;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import tollBarrier.bornes.BoAutomatique;

public class TestBoAutomatique {

	BoAutomatique b;
	
	@Before
	public void setUp() throws Exception {
		b = new BoAutomatique();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	public void testgetMoyenDePaiement(){
		
		Set<MoyenDePaiment> s = b.getMoyensDePaiment();
		assertTrue(s instanceof Set<?>);
		assertTrue(s.contains(MoyenDePaiment.CB));
		assertTrue(s.contains(MoyenDePaiment.LIQUIDE));
		assertTrue(s.contains(MoyenDePaiment.ABONNEMENT));
		
	}
	
	public void testtoString(){
		assertTrue(b.toString() instanceof String);
	}
	
	
}
