package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Card;

public class TestCard {
	
//	@Before
//	public void setUp(){
//		Card c = new Card();
//		c= new Card("4242424242424242", "BCR");
//	}

	@Test
	public void TestCardNumarCorect() {
		Card c = new Card();
		c.setNumar("4242424242424242");
		assertFalse((c.getNumar() == null));
	}
	
	@Test
	public void TestCardNumarIncorect1() {
		Card c = new Card();
		c.setNumar("42424242424242");
		assertTrue((c.getNumar() == null));
	}
	
	@Test
	public void TestCardNumarIncorect2() {
		Card c = new Card();
		c.setNumar("4242424f42424242");
		assertTrue((c.getNumar() == null));
	}
	
	@Test
	public void TestIncadrareCardBCR() {
		Card c = new Card();
		c.setNumar("4242424242424216");
		assertEquals("Incadrare card", "BCR", c.getEmitator());
	}
	
	@Test
	public void TestIncadrareCardBRD() {
		Card c = new Card();
		c.setNumar("4242424242424243");
		assertEquals("Incadrare card", "BRD", c.getEmitator());
	}
	
	@Test
	public void TestIncadrareCardBT() {
		Card c = new Card();
		c.setNumar("4242424242424269");
		assertEquals("Incadrare card", "BT", c.getEmitator());
	}
	
	@Test
	public void TestIncadrareCardAlpha() {
		Card c = new Card();
		c.setNumar("4242424242424287");
		assertEquals("Incadrare card", "Alpha Bank", c.getEmitator());
	}
	
	@Test
	public void TestIncadrareCardIncorecta() {
		Card c = new Card();
		c.setNumar("4242424242424287");
		assertFalse("BT".equals(c.getEmitator()));
	}
	
	//TODO: setere si getere pentru Card
	
	@Test
	public void TestNumarCard() {
		Card c1 = new Card("1234567891234567", "BCR");
		String numarAsteptat ="1234567891234567";
		String numar = c1.getNumar();
		assertEquals("numar", numarAsteptat, numar); 
	}
	
	@Test
	public void TestEmitatorCard() {
		Card c1 = new Card("1234567891234567", "BCR");
		String emitatorAsteptat ="BCR";
		String emitator = c1.getEmitator();
		assertEquals("emitator", emitatorAsteptat, emitator); 
	}
	

}
