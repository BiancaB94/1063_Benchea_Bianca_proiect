package clase;

import static org.junit.Assert.*;

import org.junit.Test;

public class AllTests_Bianca {
/*
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
	*/
	
	
	/*@Test
	public void TestConstructorAdministratorPensiune() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertEquals("CNP administrator", "1930512279098", a.getCNP());
	}
	
	@Test
	public void TestVartaAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertEquals(23, a.getVarsta(), 1); //este posibil, prin modul de calculare, sa obtinem marja de 1
	}
	
	@Test
	public void TestEgalitateAdevarataAdministratori() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		AdministratorPensiune a2 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertTrue(a1.equals(a2));
	}
	
	@Test
	public void TestEgalitateFalsaAdministratori() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		AdministratorPensiune a2 = new AdministratorPensiune("2930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertFalse(a1.equals(a2));
	}
	
	@Test
	public void TestReteaTelefoniePozitivAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		try {
			assertEquals("Retea administrator", "Telekom", a.getReteaTelefonie());
		} catch ( Exception e ) {
			e.printStackTrace();			
		}
	}
	
	@Test
	public void TestReteaTelefonieNegativAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		if ( a.getReteaTelefonie() != null )
			assertFalse(a.getReteaTelefonie().equals("Orange"));
		else
			assertFalse(true);
	}
	
	@Test
	public void TestReteaTelefonieInexistentaAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0795032543", "frone@gig.el");
		assertFalse((a.getReteaTelefonie() != null ));
	}
	
	@Test
	public void TestFurnizorEmailPozitivAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		assertEquals("Operator e-mail administrator", "GMail", a.getFurnizorEmail());
	}
	
	@Test
	public void TestFurnizorEmailNegativAdministrator() {
		AdministratorPensiune a = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertFalse(a.getFurnizorEmail().equals("Yahoo"));
	}
	
	
	//TODO: teste settere si gettere pe AdministratorPensiune
	
	@Test
	public void TestVarstaAdministrator() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String CNPAsteptat ="1930512279098";
		String CNP = a1.getCNP();
		assertEquals("CNP ", CNPAsteptat, CNP); 
	}
	
	@Test
	public void TestNumeAdministrator() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String numeAsteptat ="Gigel Frone";
		String nume = a1.getNume();
		assertEquals("CNP ", numeAsteptat, nume); 
	}
	
	@Test
	public void TestNrTelefonAdministrator() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String telefonAsteptat ="0765032543";
		String telefon= a1.getNumar_telefon();
		assertEquals("CNP ", telefonAsteptat, telefon); 
	}
	
	@Test
	public void TestEmailAdministrator() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String emailAsteptat ="frone@gmail.el";
		String email= a1.getEmail();
		assertEquals("CNP ", emailAsteptat, email); 
	}
	
	
	@Test
	public void TestReteaAdministrator() {
		AdministratorPensiune a1 = new AdministratorPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String emailAsteptat ="frone@gmail.el";
		String email= a1.getEmail();
		assertEquals("CNP ", emailAsteptat, email); 
	}
	
	*/
	/*
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
	}*/
	
/*	@Test
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
	*/
	
/*	@Test
	public void TestConstructorClientPensiune() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertEquals("CNP client", "1930512279098", a.getCNP());
	}
	
	@Test
	public void TestVarstaClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertEquals(23, a.getVarsta(), 1); //este posibil, prin modul de calculare, sa obtinem marja de 1
	}
	
	@Test
	public void TestEgalitateAdevarataClienti() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		ClientPensiune a2 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertTrue(a1.equals(a2));
	}
	
	@Test
	public void TestEgalitateFalsaClienti() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		ClientPensiune a2 = new ClientPensiune("2930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertFalse(a1.equals(a2));
	}
	
	@Test
	public void TestReteaTelefoniePozitivClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		try {
			assertEquals("Retea administrator", "Telekom", a.getReteaTelefonie());
		} catch ( Exception e ) {
			e.printStackTrace();			
		}
	}
	
	@Test
	public void TestReteaTelefonieNegativClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		if ( a.getReteaTelefonie() != null )
			assertFalse(a.getReteaTelefonie().equals("Orange"));
		else
			assertFalse(true);
	}
	
	@Test
	public void TestReteaTelefonieInexistentaClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0795032543", "frone@gig.el");
		assertFalse((a.getReteaTelefonie() != null ));
	}
	
	@Test
	public void TestFurnizorEmailPozitivClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		assertEquals("Operator e-mail administrator", "GMail", a.getFurnizorEmail());
	}
	
	@Test
	public void TestFurnizorEmailNegativClient() {
		ClientPensiune a = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gig.el");
		assertFalse(a.getFurnizorEmail().equals("Yahoo"));
	}
	
	
	//TODO: teste settere si gettere pe ClientPensiune
	
	
	
	@Test
	public void TestNumeClient() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String numeAsteptat ="Gigel Frone";
		String nume = a1.getNume();
		assertEquals("CNP ", numeAsteptat, nume); 
	}
	
	@Test
	public void TestNrTelefonClient() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String telefonAsteptat ="0765032543";
		String telefon= a1.getNumar_telefon();
		assertEquals("CNP ", telefonAsteptat, telefon); 
	}
	
	@Test
	public void TestEmailClient() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String emailAsteptat ="frone@gmail.el";
		String email= a1.getEmail();
		assertEquals("CNP ", emailAsteptat, email); 
	}
	
	
	@Test
	public void TestReteaClient() {
		ClientPensiune a1 = new ClientPensiune("1930512279098", "Gigel Frone", "0765032543", "frone@gmail.el");
		String emailAsteptat ="frone@gmail.el";
		String email= a1.getEmail();
		assertEquals("CNP ", emailAsteptat, email); 
	}
	
	
	
	*/
}
