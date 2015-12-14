package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import domain.*;
import domain.tellers.Teller;
import domain.tellers.TellerType;
import domain.tellers.TellerTypeFactory;
import ui.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Properties;

public class InstellingController {
	

	
	private InstellingPanel instellingPanel;
	
	private Integer aantal = 0;
	private Integer type1 = -1;
	private String waarden1;
	private Integer type2 = -1;
	private String waarden2;
	private Integer type3 = -1;
	private String waarden3;
	private Integer type4 = -1;
	private String waarden4;
	private Integer type5 = -1;
	private String waarden5;
	private String code;
	private ArrayList<Integer> AlleTypes;
	private ArrayList<String> AlleWaarden;
	
	public InstellingController(JFrame instellingVenster){

		try  (InputStream in = new FileInputStream("kluis.properties")){
			
			Properties prop = new Properties();
			prop.load(in);
			
			aantal = Integer.parseInt(prop.getProperty("aantal"));
			type1 = Integer.parseInt(prop.getProperty("type1"));
			type2 = Integer.parseInt(prop.getProperty("type2"));
			type3 = Integer.parseInt(prop.getProperty("type3"));
			type4 = Integer.parseInt(prop.getProperty("type4"));
			type5 = Integer.parseInt(prop.getProperty("type5"));
			waarden1 = prop.getProperty("waarden1");
			waarden2 = prop.getProperty("waarden2");
			waarden3 = prop.getProperty("waarden3");
			waarden4 = prop.getProperty("waarden4");
			waarden5 = prop.getProperty("waarden5");
			code = prop.getProperty("code");

		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Instellingen konden niet gevonden worden. Geef nieuwe instellingen in.");
		}


		instellingPanel = new InstellingPanel();
		instellingPanel.setInstellingButtonListener(new InstellingButtonListener());
		//instellingPanel.setAantalTellers(aantal);
		instellingPanel.setWaarden1(waarden1);
		instellingPanel.setWaarden2(waarden2);
		instellingPanel.setWaarden3(waarden3);
		instellingPanel.setWaarden4(waarden4);
		instellingPanel.setWaarden5(waarden5);
		instellingPanel.setTypeTeller1(type1);
		instellingPanel.setTypeTeller2(type2);
		instellingPanel.setTypeTeller3(type3);
		instellingPanel.setTypeTeller4(type4);
		instellingPanel.setTypeTeller5(type5);
		instellingPanel.setCode(code);
	
		instellingVenster.add(instellingPanel);
		
		
	
	}
	
	class InstellingButtonListener implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 
			 try
			 {
				 aantal = instellingPanel.getMaxTellers() + 1;
				 /*if (aantal > 5) {aantal = 5;}
				 if (aantal < 1) {aantal = 1;}*/
				 
				 AlleTypes = instellingPanel.getAlleTypes();
			
				 
				 type1 = AlleTypes.get(0);
				 type2 = AlleTypes.get(1);
				 type3 = AlleTypes.get(2);
				 type4 = AlleTypes.get(3);
				 type5 = AlleTypes.get(4);
				 
				 AlleWaarden = instellingPanel.getWaarden();
				 waarden1 = AlleWaarden.get(0);
				 waarden2 = AlleWaarden.get(1);
				 waarden3 = AlleWaarden.get(2);
				 waarden4 = AlleWaarden.get(3);
				 waarden5 = AlleWaarden.get(4);
				 code =instellingPanel.getCode();
				 if (code.length() != aantal) {throw new Exception ("Onmogelijke code");}
				 
				 
					try (OutputStream out = new FileOutputStream("kluis.properties")){
						
						Properties properties = new Properties();
						properties.setProperty("name", "javaCodeGeeks");
						properties.setProperty("aantal", aantal.toString());
						properties.setProperty("type1", type1.toString());
						properties.setProperty("type2", type2.toString());
						properties.setProperty("type3", type3.toString());
						properties.setProperty("type4", type4.toString());
						properties.setProperty("type5", type5.toString());
						properties.setProperty("waarden1", waarden1);
						properties.setProperty("waarden2", waarden2);
						properties.setProperty("waarden3", waarden3);
						properties.setProperty("waarden4", waarden4);
						properties.setProperty("waarden5", waarden5);
						properties.setProperty("code", code);
						properties.store(out, "Kluisproperties");

					} catch (IOException e2) {
						e2.printStackTrace();
					}
			
			 
			   JFrame bedieningVenster = new JFrame( "Knack die code" );
			   
			  
			   
 			   ArrayList<Teller>tellers =new ArrayList<Teller>();
			   for (int telTellers = 0; telTellers < aantal ; telTellers ++)
			   {
				   Object[]w = new Character[AlleWaarden.get(telTellers).length()];
				   
				   for (int i = 0 ; i < w.length ; i++)
				   {
					   w[i] = AlleWaarden.get(telTellers).charAt(i);
				   }
				   
				   Object[] passed = {w};
				   
				   if (AlleTypes.get(telTellers) == 0)
				   {
					   Teller t = TellerTypeFactory.createTellerType(TellerType.CYCLISCH.getKlasseNaam(), passed);
					   tellers.add(t);
				   }
				   else
				   {
					   Teller t = TellerTypeFactory.createTellerType(TellerType.TERUGLOOP.getKlasseNaam(), passed);
					   tellers.add(t);
				   }
					   
				   
			   }
			   Slot slot = new Slot (tellers, code);
			   new SlotController(slot,bedieningVenster);

			      bedieningVenster.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			      bedieningVenster.setSize( 1000, 400 ); 
			      bedieningVenster.setVisible( true );
 }
			 
			 catch (Exception e1)
			 {
				 JOptionPane.showMessageDialog(null, "Gelieve de invoer te controleren " + e1.getMessage());
			 }

	 
		 }
	}
	

}
