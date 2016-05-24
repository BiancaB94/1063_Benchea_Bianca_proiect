package clase;

import java.io.BufferedWriter;
import java.io.IOException;

import interfete.ModalitateRezervareStrategy;

public class Card implements ModalitateRezervareStrategy{

	private String numar;
	private String emitator;
	
	public Card(String numar, String emitator){
		this.numar = numar;
		this.emitator=emitator;
	}
	
	public Card(){
		numar="4242424242424243";
		emitator="BCR";
	}
	
	private void updateEmitator() {
		if ( numar != null ) {
			int shm = (Integer.parseInt(numar.substring(numar.length()-2)));
			if ( shm <= 25 ) {
				emitator = "BCR";
				return;
			}
			if ( shm <= 50 ) {
				emitator = "BRD";
				return;
			}
			if ( shm <= 75 ) {
				emitator = "BT";
				return;
			}
			emitator = "Alpha Bank";
		}
	}
	
	
	public String getEmitator() {
		return emitator;
	}
	
	public void setNumar(String nr) {
		boolean ok = true;
		
		if ( nr.length() != 16 )
			ok = false;
		
		if ( !nr.matches("[0-9]*")) {
			ok = false;
		}
		
		if ( ok == true ) {
			this.numar = nr;
			this.updateEmitator();
		} else {
			this.numar = null;
		}
	}
	public String getNumar() {
		return numar;
	}
	@Override
	public void executa() {
		// TODO Auto-generated method stub
		System.out.println("Ati ales sa platiti rezervarea cu cardul");
	}
	

	public void setEmitator(String emitator) {
		this.emitator = emitator;
	}
    


}
