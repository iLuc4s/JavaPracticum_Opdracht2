package ui;

public class InstellingPanel {

}package ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;

import domain.tellers.TellerType;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextPane;

public class InstellingPanel extends JPanel{
	private JPanel logPanel;
	private JPanel knoppenPanel;
	private KluisPanel kluisPanel;
	private JButton instellingButton;
	private JButton [] slotButtons;
	private JTextArea log;
	private JTextField textFieldAantalTellers;
	private JTextField textFieldWaarden1;
	private JTextField textFieldWaarden2;
	private JTextField textFieldWaarden3;
	private JTextField textFieldWaarden4;
	private JTextField textFieldWaarden5;
	private JTextField textFieldGeheimeCode;
	private JComboBox comboBox1;
	private JComboBox comboBox2;
	
	private JComboBox comboBox3;
	
	private JComboBox comboBox4;
	
	private JComboBox comboBox5;
	
	
	
   
   public InstellingPanel(){
      setLayout(null);
      
   
      JLabel lblAantal = new JLabel("AANTAL TELLERS (MAX 5)");
      lblAantal.setBounds(12, 13, 197, 38);
      add(lblAantal);
      
      JLabel lblTellerType = new JLabel("TELLER 1 TYPE");
      lblTellerType.setBounds(12, 53, 118, 38);
      add(lblTellerType);
      
      JLabel lblWaardenDezeTeller = new JLabel("WAARDEN DEZE TELLER");
      lblWaardenDezeTeller.setBounds(12, 76, 197, 38);
      add(lblWaardenDezeTeller);
      
      JLabel label = new JLabel("WAARDEN DEZE TELLER");
      label.setBounds(12, 150, 197, 38);
      add(label);
      
      JLabel lblTellerType_1 = new JLabel("TELLER 2 TYPE");
      lblTellerType_1.setBounds(12, 127, 118, 38);
      add(lblTellerType_1);
      
      JLabel label_2 = new JLabel("WAARDEN DEZE TELLER");
      label_2.setBounds(12, 228, 197, 38);
      add(label_2);
      
      JLabel lblTellerType_2 = new JLabel("TELLER 3 TYPE");
      lblTellerType_2.setBounds(12, 205, 118, 38);
      add(lblTellerType_2);
      
      JLabel label_4 = new JLabel("WAARDEN DEZE TELLER");
      label_4.setBounds(12, 313, 197, 38);
      add(label_4);
      
      JLabel lblTellerType_3 = new JLabel("TELLER 4 TYPE");
      lblTellerType_3.setBounds(12, 290, 118, 38);
      add(lblTellerType_3);
      
      JLabel label_6 = new JLabel("WAARDEN DEZE TELLER");
      label_6.setBounds(12, 396, 197, 38);
      add(label_6);
      
      JLabel lblTellerType_4 = new JLabel("TELLER 5 TYPE");
      lblTellerType_4.setBounds(12, 373, 118, 38);
      add(lblTellerType_4);
      
      JLabel lblGeheimeCode = new JLabel("GEHEIME CODE");
      lblGeheimeCode.setBounds(164, 463, 118, 38);
      add(lblGeheimeCode);
      
      textFieldAantalTellers = new JTextField();
      textFieldAantalTellers.setBounds(202, 21, 116, 22);
      add(textFieldAantalTellers);
      textFieldAantalTellers.setColumns(10);
      
      textFieldWaarden1 = new JTextField();
      textFieldWaarden1.setColumns(10);
      textFieldWaarden1.setBounds(202, 84, 211, 22);
      add(textFieldWaarden1);
      
      comboBox1 = new JComboBox(TellerType.values());
      
      comboBox1.setBounds(202, 64, 211, 22);
      add(comboBox1);
      
      textFieldWaarden2 = new JTextField();
      textFieldWaarden2.setColumns(10);
      textFieldWaarden2.setBounds(202, 157, 211, 22);
      add(textFieldWaarden2);
      
      comboBox2 = new JComboBox(TellerType.values());
      comboBox2.setBounds(202, 137, 211, 22);
      add(comboBox2);
      
      textFieldWaarden3 = new JTextField();
      textFieldWaarden3.setColumns(10);
      textFieldWaarden3.setBounds(202, 233, 211, 22);
      add(textFieldWaarden3);
      
      comboBox3 = new JComboBox(TellerType.values());
      comboBox3.setBounds(202, 213, 211, 22);
      add(comboBox3);
      
      textFieldWaarden4 = new JTextField();
      textFieldWaarden4.setColumns(10);
      textFieldWaarden4.setBounds(202, 310, 211, 22);
      add(textFieldWaarden4);
      
      comboBox4 = new JComboBox(TellerType.values());
      comboBox4.setBounds(202, 290, 211, 22);
      add(comboBox4);
      
      textFieldWaarden5 = new JTextField();
      textFieldWaarden5.setColumns(10);
      textFieldWaarden5.setBounds(202, 404, 211, 22);
      add(textFieldWaarden5);
      
      comboBox5 = new JComboBox(TellerType.values());
      comboBox5.setBounds(202, 381, 211, 22);
      add(comboBox5);
      
      textFieldGeheimeCode = new JTextField();
      textFieldGeheimeCode.setColumns(10);
      textFieldGeheimeCode.setBounds(122, 496, 162, 22);
      add(textFieldGeheimeCode);
      
      instellingButton = new JButton("DEZE INSTELLINGEN GEBRUIKEN");
      instellingButton.setBounds(86, 531, 243, 25);
      add(instellingButton);
      
      JTextPane txtpnTypDeVerschillende = new JTextPane();
      txtpnTypDeVerschillende.setText("Typ de verschillende waarden voor een teller aan elkaar in 1 woord.");
      txtpnTypDeVerschillende.setBounds(477, 13, 133, 80);
      add(txtpnTypDeVerschillende);
      
      instellingButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
      


	}
   
   public void setInstellingButtonListener(ActionListener listenerForInstellingButton){
		  instellingButton.addActionListener(listenerForInstellingButton);			 
	}
   
   public String getAantalTellers()
   {
	   return this.textFieldAantalTellers.getText();
   }
   
   public void setAantalTellers(Integer aantal)
   {
	   String aantalText = aantal.toString();
	   this.textFieldAantalTellers.setText(aantalText);
   }

   
   public void setTypeTeller1(int index)
   {
	   this.comboBox1.setSelectedIndex(index);
   }

   public void setTypeTeller2(int index)
   {
	   this.comboBox2.setSelectedIndex(index);
   }

   public void setTypeTeller3(int index)
   {
	   this.comboBox3.setSelectedIndex(index);
   }

   public void setTypeTeller4(int index)
   {
	   this.comboBox4.setSelectedIndex(index);
   }

   public void setTypeTeller5(int index)
   {
	   this.comboBox5.setSelectedIndex(index);
   }
   
   public ArrayList<String> getWaarden()
   {
	   ArrayList<String> AlleWaarden = new ArrayList<String>();

		   AlleWaarden.add(textFieldWaarden1.getText());
		   AlleWaarden.add(textFieldWaarden2.getText());
		   AlleWaarden.add(textFieldWaarden3.getText());
		   AlleWaarden.add(textFieldWaarden4.getText());
		   AlleWaarden.add(textFieldWaarden5.getText());
		   
		   return AlleWaarden;

   }
   
   public ArrayList<Integer> getAlleTypes() 
   {
	ArrayList <Integer> AlleTypes = new ArrayList<Integer>();
	
	AlleTypes.add(comboBox1.getSelectedIndex());
	AlleTypes.add(comboBox2.getSelectedIndex());
	AlleTypes.add(comboBox3.getSelectedIndex());
	AlleTypes.add(comboBox4.getSelectedIndex());
	AlleTypes.add(comboBox5.getSelectedIndex());
	
	return AlleTypes;
	
   }
   
   
   public void setWaarden1(String waarden)
   {
	   this.textFieldWaarden1.setText(waarden);
   }

   public void setWaarden2(String waarden)
   {
	   this.textFieldWaarden2.setText(waarden);
   }

   public void setWaarden3(String waarden)
   {
	   this.textFieldWaarden3.setText(waarden);
   }

   public void setWaarden4(String waarden)
   {
	   this.textFieldWaarden4.setText(waarden);
   }

   public void setWaarden5(String waarden)
   {
	   this.textFieldWaarden5.setText(waarden);
   }
   
   public String getCode ()
   {
	   return this.textFieldGeheimeCode.getText();
   }
   public void setCode(String code)
   {
	   this.textFieldGeheimeCode.setText(code);
   }
  } 


