package interfete;

import clase.Camera;
import clase.PensiuneSingleton;

public interface ICamera {
	//composite
	void add(ICamera planta);
	void remove(ICamera planta);
	ICamera getChild(int i);
	void descriere();
	//end composite
	
	//start factory
	 public String numarPaturi();
	 
	 //adapter'
	 public void play();
	 public void stop();
	 
	 
	 ///prototype
	 public Camera copiaza();
	 
	 
}
