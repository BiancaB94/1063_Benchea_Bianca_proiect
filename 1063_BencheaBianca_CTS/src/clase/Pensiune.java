package clase;

import java.util.ArrayList;
import java.util.List;

import interfete.ICamera;

public class Pensiune implements ICamera{
	//START composite
	public List<ICamera> camere = new ArrayList<>();

	@Override
	public void add(ICamera camera) {
		// TODO Auto-generated method stub
		camere.add(camera);
	}

	@Override
	public void remove(ICamera camera) {
		// TODO Auto-generated method stub
		camere.remove(camera);
	}

	@Override
	public ICamera getChild(int i) {
		// TODO Auto-generated method stub
		return camere.get(i);
	}

	@Override
	public void descriere() {
		// TODO Auto-generated method stub
		System.out.println("pensiune:");
		for(int i=0;i<camere.size();i++){
			camere.get(i).descriere();
		}
	}
		//END composite
//de la factory
	@Override
	public String numarPaturi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Camera copiaza() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
	
	
	
	



