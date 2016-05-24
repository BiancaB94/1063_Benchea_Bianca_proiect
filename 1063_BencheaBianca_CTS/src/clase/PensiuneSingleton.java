package clase;

import java.io.BufferedWriter;
import java.util.ArrayList;


public class PensiuneSingleton {
	
	    private ArrayList<String> listaCamere;
	    private static PensiuneSingleton instance = null;

	    private PensiuneSingleton(ArrayList<String> listaCamere) {
	        this.listaCamere = listaCamere;
	    }

	    private PensiuneSingleton() {
	        this.listaCamere = new ArrayList();
	    }

	    public static PensiuneSingleton getInstance() {
	        if (instance == null) {
	            instance = new PensiuneSingleton();
	        }
	        return instance;
	    }
	    
	    public void adaugaCamera(String numeCamera) {
	    	listaCamere.add(numeCamera);
	    }

	    public String obtineCamere() {
	        StringBuilder nume_camera = new StringBuilder();
	        for (int i = 0; i < listaCamere.size(); i++) {
	        	nume_camera.append(listaCamere.get(i));
	            if (i != listaCamere.size() - 1) {
	            	nume_camera.append(" ; ");
	            }
	        }
	        return nume_camera.toString();
	    }
	    
	    
}
