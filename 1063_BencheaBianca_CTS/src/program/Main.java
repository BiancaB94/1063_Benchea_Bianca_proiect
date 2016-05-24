package program;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import clase.AdministratorPensiune;
import clase.Camera;
import clase.CameraBuilder;
import clase.Card;
import clase.Cash;
import clase.ClientPensiune;
import clase.CreatorCameraDubla;
import clase.StopCuratenieCommand;
import clase.Pensiune;
import clase.PensiuneSingleton;
import clase.StartCuratenieCommand;
import interfete.ICamera;
import interfete.ICameraCreator;
import interfete.ICommand;
import interfete.ModalitateRezervareStrategy;


public class Main {
	  public static void main(String[] args) {

		  /////////////////////START singleton
	
	/*PensiuneSingleton pensiuneSingleton = PensiuneSingleton.getInstance();
	pensiuneSingleton.adaugaCamera("camera11");
	System.out.println(pensiuneSingleton.obtineCamere());
        
        
             
      PensiuneSingleton pensiuneSingleton2 = PensiuneSingleton.getInstance();
      pensiuneSingleton2.adaugaCamera("Camera 302");
      pensiuneSingleton2.adaugaCamera("Camera 303");
      
      System.out.println(pensiuneSingleton2.obtineCamere());*/
       
      /////////////////////////// END singleton
      
      ////////////////////////////START composite
		  
		  
//        Camera camera1=new Camera("camera1");
//        Camera camera2=new Camera("camera 2");
//		Camera camera3=new Camera("camera 3");
//		
//		Pensiune pensiune1=new Pensiune();
//		pensiune1.add(camera1);
//		pensiune1.add(camera2);
//		Pensiune pensiune2=new Pensiune();
//		pensiune2.add(camera3);
//		pensiune1.add(pensiune2);
//		pensiune1.descriere();
		
		
     /////////////////////////////END composite
       
		
		///////////////////////START factoryMethod
		  
//		ICameraCreator creator = new CreatorCameraDubla();
//        ICamera camera = creator.createObject();
//        System.out.println(camera.numarPaturi());
//
//        creator = new CreatorCameraDubla();
//        camera = creator.createObject();
//        System.out.println(camera.numarPaturi());
		  
		///////////////////////////END factoryMethod
		
		  
		  ////////////////////////////START BUILDER
		  
//		  Camera camera=new Camera();
//		  Camera camera1=new CameraBuilder().setPozitionare("vest").setTip("matrimoniala").build();
//		  System.out.println(camera1.toString());
//
//			Camera camera2=new CameraBuilder().setPozitionare("est").setTip("cum vreau eu").build();
//			System.out.println(camera2.toString());
		  
		  //////////////////////////END BUILDER
		  
		  //////////////////////////////START ADAPTER
		  
//			Camera camera=new Camera();
//			AdministratorPensiune administrator=new AdministratorPensiune(camera);
//			administrator.play();
//			administrator.stop();
		  
		  
		  ////////////////////////////////END ADAPTER
			
			////////////////////////////START STRATEGY
			
			ModalitateRezervareStrategy mod=new Cash();
			
			ClientPensiune clientPlateste=new ClientPensiune(mod);
			clientPlateste.plateste();
			mod=new Card();
			clientPlateste.setModPlata(mod);
			clientPlateste.plateste();
			/////////////////////////////END STRATEGY
		  

		  
		  /////////////////////////////START COMMAND
		  
	  	/*	AdministratorPensiune administrator = new AdministratorPensiune();
	  		ICommand comanda = new StartCuratenieCommand(new Camera());
	  		administrator.invoca(comanda);
	 
	        administrator.invoca(new StopCuratenieCommand(new Camera()));
	        
	        administrator.undo();
	        administrator.undo();*/
		  
	        /////////////////////////////END COMMAND
		  
		  /////START PROTOTYPE
//		  Camera c1 = new Camera(1, 2);
//		  Camera c2 = c1.copiaza();
//		  System.out.println(c2.getNumar()); //ar trebui sa fie 201
		  /////END PROTOTYPE
            
   }
}
