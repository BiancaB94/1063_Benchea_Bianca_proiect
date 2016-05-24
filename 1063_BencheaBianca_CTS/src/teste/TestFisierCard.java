//package teste;
//
//import static org.junit.Assert.*;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import clase.Card;
//import junit.framework.TestCase;
//
//public class TestFisierCard{
//	
//	private Card card = null;
//	File f = null;
//	FileReader fr = null;
//	BufferedReader br = null;
//
//	@Before
//	public void setUp() throws Exception { // apelata inainte de fiecare test
//		card = new Card();
//		f = new File("Test");
//		fr = new FileReader(f);
//		br = new BufferedReader(fr);
//	}
//
//	@After
//	public void tearDown() throws Exception { // apelata dupa fiecare test
//		br.close();
//		fr.close();
//	}
//
//	@Test
//	public void TestIncadrareCardBCR() {
//		
//		try {
//			// FileReader fr = new FileReader(f);
//			// BufferedReader br = new BufferedReader(fr);
//			String linie = "";
//			String[] text;
//			while ((linie = br.readLine()) != null) {
//				
//					String valoare =linie;
//					card.setNumar(linie);
//			}
//			fail("jdsb");
//
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		Card c = new Card();
//		c.setNumar("4242424242424216");
//		//assertEquals("Incadrare card", "BCR", c.getEmitator());
//		
//		
//	}
//
//
//}
