package applicatie;

import javax.swing.JFrame;

import controller.InstellingController;

public class Launcher{



public static void main( String[] args ){
	   
	  
	  JFrame instellingVenster = new JFrame ("Instellingen");
	  
	  new InstellingController(instellingVenster);
	  
	  instellingVenster.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      instellingVenster.setSize( 650, 700 ); 
      instellingVenster.setVisible( true ); 

	

   } 
} 
