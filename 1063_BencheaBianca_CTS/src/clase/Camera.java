package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.ICamera;
import interfete.IPersonalCuratenie;
import interfete.Observer;
import interfete.Subject;

public class Camera implements ICamera, IPersonalCuratenie{
	
	private List<Observer> obs = new ArrayList<>();


private String tip;
private String pozitionare;
private int an_renovare;
private int index;
private int etaj;
private int numar;
private int pret = 0;
private int lungime = 0;
private int latime = 0;
private int suprafata_calculata;

	public Camera(){
		this("noua", "nord", 2016);
		this.numar = -1;
		this.index = -1;
		this.etaj = -1;
		this.pret = 0;
	}
	
	
	public Camera(int pret, int lungime, int latime){
		super();
		this.pret = pret;
		this.lungime = lungime;
		this.latime=latime;
	}

	public Camera(String tip, String pozitionare, int an_renovare) {
		super();
		this.tip = tip;
		this.pozitionare = pozitionare;
		this.an_renovare = an_renovare;
		this.numar = -1;
		this.index = -1;
		this.etaj = -1;
		this.pret = 0;
		
	}
	
	public Camera(int index, int etaj){
		this.index = index;
		this.etaj = etaj;
		this.updateNumar();
		this.pret = 0;
	}

	private void updateNumar() {
		this.numar = 100*etaj + index;
	}
	
	public void setIndex(int index) {
		this.index = index;
		this.updateNumar();
	}
	
	public void setEtaj(int etaj) {
		this.etaj = etaj;
		this.updateNumar();
	}
	
	public void setPret(int pret) {
		this.pret = pret;
	}
	
	private void updateSuprafata() {
		
		suprafata_calculata = lungime * latime;
	}
	
	public int getSuprafata() {
		return suprafata_calculata;
	}
	
	
	//returnam tipul camerei
	public String incadrare_camera() {
		if ( suprafata_calculata < 25 ) {
			return "simpla";
		}
		if ( suprafata_calculata < 50 ) {
			return "dubla";
		}
		if ( suprafata_calculata < 100) {
			return "apartament";
		}
		return "aeroport";
	}
	
	public void setLungime(int l) {
		this.lungime = l;
		this.updateSuprafata();
	}
	
	public void setLatime(int l) {
		this.latime = l;
		this.updateSuprafata();
	}
	
	public double getValoareTva() {
		return 0.05 * pret; //5% TVA
	}
	 
	public int getIndex() { return index; }
	
	public int getEtaj() { return etaj; }
	
	public int getNumar() { return numar; }

	public String getTip() {
	return tip;
}


public void setTip(String tip) {
	this.tip = tip;
}


public String getPozitionare() {
	return pozitionare;
}

public int getPret(){
	return pret;
}

public int getLatime(){
	return latime;
}

public int getLungime(){
	return lungime;
}

public void setPozitionare(String pozitionare) {
	this.pozitionare = pozitionare;
}


public int getRenovare() {
	return an_renovare;
}


public void setRenovare(int renovare) {
	this.an_renovare = renovare;
}



	public void add(Camera planta) {
		throw new UnsupportedOperationException();
	}

	
	public void remove(Camera planta) {
		throw new UnsupportedOperationException();
	}

	
	public Camera getChild(int i)  {
		throw new UnsupportedOperationException();
	}

	
	public void descriere() {
		System.out.println(tip);
	}

	@Override
	public void add(ICamera planta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(ICamera planta) {
		// TODO Auto-generated method stub
		
	}
//de la factory
	@Override
	public String numarPaturi() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String toString() {
		return "Camera [tip=" + tip + ", pozitionare=" + pozitionare + ", renovare=" + an_renovare + "]";
	}
	
	//start adapter
	public void accesCamera(){
		System.out.println("Camera este libera asadar poate fi rezervata");
	}
	public void ocupatCamera(){
		System.out.println("Camera a fost ocuptata");
	}

	
	
//////end adapter

	////start command
	@Override
	public void incepeCuratenie() {
		// TODO Auto-generated method stub
		System.out.println("Curatenia a inceput");
	}

	@Override
	public void inceteazaCuratenie() {
		// TODO Auto-generated method stub
		System.out.println("Curatenia a luat sfarsit");
	} 
	

//end command

	
	//prototype
	@Override
	public Camera copiaza() {
		// TODO Auto-generated method stub
		Camera copie = new Camera();
		copie.setIndex(this.getIndex());
		copie.setEtaj(this.getEtaj());
		copie.setPozitionare(this.getPozitionare());
		copie.setRenovare(this.getRenovare());
		copie.setTip(this.getTip());
		
		return copie;
	}
//adapter

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	//stop adapter
}
//stop adapter
		

