package ui;

import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;


public class KluisPanel extends JPanel implements ActionListener{
   private boolean isDicht = true;
   private Timer timer;
   private int teller = 0;
   
   public KluisPanel(){
	   timer = new Timer(200, this);
	   timer.setInitialDelay(500);      
   } 
   
   public void setDicht(boolean dicht){
	   isDicht = dicht;
	   if (!isDicht){
		   teller=0;		   
		   timer.start();
	   }	   
   }
  

   public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		//teken het gezicht
		g.setColor(Color.YELLOW);
		g.fillOval(10, 5, 200, 145);
		
		//teken de ogen
		g.setColor(Color.BLACK);
		g.fillOval(55,  35,  30, 30);
		g.fillOval(135, 35, 30, 30);
		
		if (!isDicht){
		//nu de lach
		//teken de mond
		g.fillOval(50, 70, 120, 50);
		g.setColor(Color.YELLOW);
		g.fillRect(50, 70, 120, 20);
		
			if (teller <10){
				teller++;
	  	  	}	  
		  	if (teller == 10){
		  		timer.stop();
		  	  }
		
		}
		else{
		//nu de sad
		//teken de mond
		g.fillOval(50, 80, 120, 50);		
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 20);
		}
	}
   
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
	   repaint();	
   }
} 