package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.ClientPensiune;

public class TestClientPensiune {
	@Test
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
	
	
	
	



}
