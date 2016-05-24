package clase;

import interfete.ModalitateRezervareStrategy;
import interfete.Observer;

public class ClientPensiune implements Observer{
	
	private int varsta;
	private String CNP;
	private String nume;
	private String numar_telefon;
	private String email;

	private String retea_telefonie;
	private String furnizor_email;
	
	private void updateVarsta() {
		//1930822270843
		if ( this.CNP != null ) {
			int an_nastere = Integer.parseInt(this.CNP.substring(1, 3));
			if ( an_nastere <= 16) { an_nastere = 2000 + an_nastere; }
			else { an_nastere = 1900 + an_nastere; }
			
			this.varsta = 2016 - an_nastere + 1;
		} else {		
			this.varsta = -1;
		}
		
	}

	private void updateReteaTelefonie() throws Exception {
		String prefix = this.numar_telefon.substring(0, 3);
		
		if ( this.numar_telefon.length() != 10 ) {
			throw new Exception("Numar telefon invalid");
		}
		
		if (this.numar_telefon.matches("(.*)[a-zA-Z](.*)") == true ) {
			throw new Exception("Numarul de telefon contine litere");
		}
		
		this.retea_telefonie = null;
		switch(prefix) {
		case "076":
		case "077":
		case "078":
			this.retea_telefonie = new String("Telekom");
			break;
		case "074":
		case "075":
			this.retea_telefonie = new String("Orange");
		case "072":
		case "073":
			this.retea_telefonie = new String("Vodafone");
		}
		
		if ( this.retea_telefonie == null) {
			throw new Exception("Numar telefon invalid");
		}
	}

	private void updateFurnizorEmail() throws Exception {
		int a_pos = this.email.indexOf('@');
		if ( a_pos < 0 ) {
			throw new Exception("Adresa de e-mail invalida");
		}
		
		int p_pos = this.email.lastIndexOf('.');
		if ( p_pos < 0 || a_pos >= p_pos ) {
			throw new Exception("Adresa de e-mail invalida");
		}
		
		String domeniu_furnizor = this.email.substring(a_pos+1, p_pos);
		
		this.furnizor_email = "Personal";
		switch(domeniu_furnizor) {
		case "gmail":
			this.furnizor_email = new String("GMail");
			break;
		case "yahoo":
			this.furnizor_email = new String("Yahoo");
		case "stud.ase":
			this.furnizor_email = new String("ASE Bucuresti");
		}
	}
	

public ClientPensiune(String Cnp, String nume, String numar_telefon, String email) {
	super();
	
	int s=0;
    boolean rezultat = false;
    if (Cnp.length()!=13)
        throw new IllegalArgumentException("CNP-ul nu are lungimea corecta!");
    String number = "279146358279";
    try{
        for(int i=0; i<12;i++){
            s+=Integer.parseInt(""+ number.charAt(i))*Integer.parseInt(""+ Cnp.charAt(i));
        }
        int cifra = s%11;
        if (cifra ==10)
            cifra=1;
        rezultat= true; //(cifra== Integer.parseInt(""+ Cnp.charAt(12)));
    } catch(Exception e){
        throw new IllegalArgumentException("CNP-ul contine caractere incorecte");
    }
    
    if (rezultat) {
        this.CNP= Cnp;
        this.updateVarsta();
    }
	
	this.nume = nume;
	this.numar_telefon = numar_telefon;
	this.email = email;
	try {
		this.updateReteaTelefonie();
		this.updateFurnizorEmail();
	} catch (Exception e) {}
	
	
}

public boolean equals(ClientPensiune a) {
	
	if ( this.CNP == null ) return false;
	if ( !a.getCNP().equals(this.CNP) ) return false;
	if ( !a.getEmail().equals(this.email) ) return false;
	if ( !a.getNumar_telefon().equals(this.numar_telefon) ) return false;
	if ( !a.getNume().equals(this.nume) ) return false;
	return true;
}

public String getCNP() {
	return CNP;
}



public void setCNP(String Cnp) {
	int s=0;
    boolean rezultat = false;
    if (Cnp.length()!=13)
        throw new IllegalArgumentException("CNP-ul nu are lungimea corecta!");
    String number = "279146358279";
    try{
        for(int i=0; i<12;i++){
            s+=Integer.parseInt(""+ number.charAt(i))*Integer.parseInt(""+ Cnp.charAt(i));
        }
        int cifra = s%11;
        if (cifra ==10)
            cifra=1;
        rezultat= true; //(cifra== Integer.parseInt(""+ Cnp.charAt(12)));
    } catch(Exception e){
        throw new IllegalArgumentException("CNP-ul contine caractere incorecte");
    }
    
    if (rezultat) {
        this.CNP= Cnp;
        this.updateVarsta();
    }
}



public String getNume() {
	return nume;
}



public void setNume(String nume) {
	this.nume = nume;
}



public String getNumar_telefon() {
	return numar_telefon;
}



public void setNumar_telefon(String numar_telefon) {
	this.numar_telefon = numar_telefon;
	try {
		this.updateReteaTelefonie();
	} catch ( Exception e ) {}
}



public String getEmail() {
	return email;
}



public void setEmail(String email) {
	this.email = email;
	try {
		this.updateFurnizorEmail();
	} catch ( Exception e ) {}
}

public int getVarsta() {
	return varsta;
}

public String getReteaTelefonie() {
	return retea_telefonie;
}

public String getFurnizorEmail() {
	return furnizor_email;
}
	
	private ModalitateRezervareStrategy modPlata;
	
	public ClientPensiune(ModalitateRezervareStrategy modPlata) {
		super();
		this.modPlata = modPlata;
	}

	@Override
	public void update(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(mesaj);
		
	}
	
	public ModalitateRezervareStrategy getModPlata() {
		return modPlata;
	}



	public void setModPlata(ModalitateRezervareStrategy modPlata) {
		this.modPlata = modPlata;
	}



	public void plateste() {
		if (modPlata != null)
			modPlata.executa();
		else
			System.out.println("nu ati selectat");
	}

}
