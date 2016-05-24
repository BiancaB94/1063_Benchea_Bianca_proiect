package clase;

import interfete.ICameraBuilder;

public class CameraBuilder implements ICameraBuilder{
	private String tip;
	private String pozitionare;
	private int renovare;
	
	
		
		public CameraBuilder() {
		tip="cameraMatrimoniala";
		pozitionare="SUD";
		renovare=2015;
	}


		


	public CameraBuilder setTip(String tip) {
		this.tip = tip;
		return this;
	}
	

	

	public CameraBuilder setPozitionare(String pozitionare) {
		this.pozitionare = pozitionare;
		return this;
	}


	


	public CameraBuilder setRenovare(int renovare) {
		this.renovare = renovare;
		return this;
	}


	@Override
	public Camera build() {
		// TODO Auto-generated method stub
		return new Camera(this.tip,this.pozitionare,this.renovare);
	}
	
	

}
