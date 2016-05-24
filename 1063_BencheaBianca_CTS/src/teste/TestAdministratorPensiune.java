package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.AdministratorPensiune;

public class TestAdministratorPensiune {

	@Test
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
	

}
