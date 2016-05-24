package clase;

import interfete.ICamera;
import interfete.ICameraCreator;

public class CreatorCameraDubla implements ICameraCreator{

	@Override
	public ICamera createObject() {
		// TODO Auto-generated method stub
		return new CameraDubla();
	}

}
