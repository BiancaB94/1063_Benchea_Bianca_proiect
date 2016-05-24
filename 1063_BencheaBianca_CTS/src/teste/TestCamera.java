package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Camera;

public class TestCamera {

	@Test
	public void TestConstructor1Camera() {
		Camera c1 = new Camera(1,2);
		int etajAsteptat = 2;
		int etaj = c1.getEtaj();
		assertEquals("etaj", etajAsteptat, etaj);
	}
	
	@Test
	public void TestConstructor2Camera() {
		Camera c1 = new Camera("tip", "dreapta", 2012);
		int anAsteptat = 2012;
		int an = c1.getRenovare();
		assertEquals("an renovare", anAsteptat, an);
	}
	
	@Test
	public void TestCalculNumarCamera() {
		Camera c1 = new Camera(1,2);
		int numarAsteptat = 201;
		int numar = c1.getNumar();
		assertEquals("numar camera", numarAsteptat, numar);
	}
	
	@Test
	public void TestIndexCamera() {
		Camera c1 = new Camera(1,2);
		int indexAsteptat = 1;
		int index = c1.getIndex();
		assertEquals("index camera", indexAsteptat, index); 
	}

	@Test
	public void TestEtajCamera() {
		Camera c1 = new Camera(1,2);
		int etajAsteptat = 2;
		int etaj = c1.getEtaj();
		assertEquals("etaj camera", etajAsteptat, etaj); 
	}
	
	@Test
	public void TestTipCamera () {
		Camera c1 = new Camera("naspa", "sud-est", 2016);
		String tipAsteptat = "naspa";
		String tip = c1.getTip();
		assertEquals("tip camera", tipAsteptat, tip); 
	}
	
	@Test
	public void TestPozitionareCamera () {
		Camera c1 = new Camera("naspa", "sud-est", 2016);
		String pozitionareAsteptat = "sud-est";
		String pozitionare = c1.getPozitionare();
		assertEquals("pozitionare camera", pozitionareAsteptat, pozitionare); 
	}
	
	@Test
	public void TestAnRenovareCamera() {
		Camera c1 = new Camera("naspa", "sud-est", 2016);
		int anRenovareAsteptat = 2016;
		int an = c1.getRenovare();
		assertEquals("an renovare camera", anRenovareAsteptat, an); 
	}
	
	@Test
	public void TestPretCamera() {
		Camera c1 = new Camera(200, 8, 3);
		int pretAsteptat = 200;
		int pret = c1.getPret();
		assertEquals("pretul camerei", pretAsteptat, pret); 
	}
	
	@Test
	public void TestLatimeCamera() {
		Camera c1 = new Camera(200, 8, 3);
		int latimeAsteptata = 3;
		int latime = c1.getLatime();
		assertEquals("pretul camerei", latimeAsteptata, latime); 
	}
	
	@Test
	public void TestLungimeCamera() {
		Camera c1 = new Camera(200, 8, 3);
		int lungimeAsteptata = 8;
		int lungime = c1.getLungime();
		assertEquals("pretul camerei", lungimeAsteptata, lungime); 
	}
	
	
	@SuppressWarnings("deprecation")
	@Test
	public void TestTvaCamera() {
		Camera c = new Camera();
		c.setPret(200);
		assertEquals(10, c.getValoareTva(), 0.1);
	}
	
	//TODO: Incadrare camera dupa suprafata
	@Test
	public void TestCalculSuprafataCamera() {
		Camera c = new Camera();
		c.setLungime(16);
		c.setLatime(3);
		assertEquals("Suprafata camera", 48, c.getSuprafata());
	}
	
	@Test
	public void TestIncadrareReusitaSimplaCamera() {
		Camera c = new Camera();
		c.setLungime(8);
		c.setLatime(3);
		assertEquals("Tip camera", "simpla", c.incadrare_camera());
	}
	
	@Test
	public void TestIncadrareReusitaDublaCamera() {
		Camera c = new Camera();
		c.setLungime(16);
		c.setLatime(3);
		assertEquals("Tip camera", "dubla", c.incadrare_camera());
	}
	
	@Test
	public void TestIncadrareReusitaApartamentCamera() {
		Camera c = new Camera();
		c.setLungime(16);
		c.setLatime(4);
		assertEquals("Tip camera", "apartament", c.incadrare_camera());
	}
	
	@Test
	public void TestIncadrareReusitaAeroportCamera() {
		Camera c = new Camera();
		c.setLungime(16);
		c.setLatime(14);
		assertEquals("Tip camera", "aeroport", c.incadrare_camera());
	}
	
	@Test
	public void TestIncadrareNereusitaCamera() {
		Camera c = new Camera();
		c.setLungime(16);
		c.setLatime(3);
		assertFalse("aeroport".equals(c.incadrare_camera()));
	}

}
