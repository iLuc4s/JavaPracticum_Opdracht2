package ui;

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
	
	private Integer[] aantalTellers = {1, 2, 3, 4, 5};
	private List<JComboBox> comboBoxesList = new ArrayList<JComboBox>();
	private List<JTextField> textFieldList = new ArrayList<JTextField>();
	private int maxTellers;
	
   
   public InstellingPanel(){
      setLayout(null);
      
   
      JLabel lblAantal = new JLabel("AANTAL TELLERS (MAX 5)");
      lblAantal.setBounds(37, 13, 197, 38);
      add(lblAantal);
      
      JLabel lblTellerType = new JLabel("KIES TELLER TYPE");
      lblTellerType.setBounds(37, 53, 118, 38);
      add(lblTellerType);
      
      JLabel lblWaardenDezeTeller = new JLabel("GEEF WAARDEN TELLER");
      lblWaardenDezeTeller.setBounds(202, 53, 144, 38);
      add(lblWaardenDezeTeller);
      
      JLabel lblGeheimeCode = new JLabel("GEHEIME CODE");
      lblGeheimeCode.setBounds(133, 405, 101, 38);
      add(lblGeheimeCode);
      
      textFieldWaarden1 = new JTextField();
      textFieldWaarden1.setColumns(10);
      textFieldWaarden1.setBounds(202, 89, 118, 22);
      add(textFieldWaarden1);
      textFieldList.add(textFieldWaarden1);
      
      comboBox1 = new JComboBox(TellerType.values());
      
      comboBox1.setBounds(37, 89, 95, 22);
      add(comboBox1);
      comboBoxesList.add(comboBox1);
      
      textFieldWaarden2 = new JTextField();
      textFieldWaarden2.setColumns(10);
      textFieldWaarden2.setBounds(202, 157, 118, 22);
      add(textFieldWaarden2);
      textFieldList.add(textFieldWaarden2);
      
      comboBox2 = new JComboBox(TellerType.values());
      comboBox2.setBounds(37, 157, 95, 22);
      add(comboBox2);
      comboBoxesList.add(comboBox2);
      
      textFieldWaarden3 = new JTextField();
      textFieldWaarden3.setColumns(10);
      textFieldWaarden3.setBounds(202, 225, 118, 22);
      add(textFieldWaarden3);
      textFieldList.add(textFieldWaarden3);
      
      comboBox3 = new JComboBox(TellerType.values());
      comboBox3.setBounds(37, 225, 95, 22);
      add(comboBox3);
      comboBoxesList.add(comboBox3);
      
      textFieldWaarden4 = new JTextField();
      textFieldWaarden4.setColumns(10);
      textFieldWaarden4.setBounds(202, 293, 118, 22);
      add(textFieldWaarden4);
      textFieldList.add(textFieldWaarden4);
      
      comboBox4 = new JComboBox(TellerType.values());
      comboBox4.setBounds(37, 293, 95, 22);
      add(comboBox4);
      comboBoxesList.add(comboBox4);
      
      textFieldWaarden5 = new JTextField();
      textFieldWaarden5.setColumns(10);
      textFieldWaarden5.setBounds(202, 361, 118, 22);
      add(textFieldWaarden5);
      textFieldList.add(textFieldWaarden5);
      
      comboBox5 = new JComboBox(TellerType.values());
      comboBox5.setBounds(37, 361, 95, 22);
      add(comboBox5);
      comboBoxesList.add(comboBox5);
      
      textFieldGeheimeCode = new JTextField();
      textFieldGeheimeCode.setColumns(10);
      textFieldGeheimeCode.setBounds(94, 438, 162, 22);
      add(textFieldGeheimeCode);
      
      instellingButton = new JButton("DEZE INSTELLINGEN GEBRUIKEN");
      instellingButton.setBounds(54, 473, 243, 25);
      add(instellingButton);
      
      JTextPane txtpnTypDeVerschillende = new JTextPane();
      txtpnTypDeVerschillende.setText("Typ de verschillende waarden voor een teller aan elkaar in 1 woord.");
      txtpnTypDeVerschillende.setBounds(477, 13, 133, 80);
      add(txtpnTypDeVerschillende);
      
      JComboBox comboBoxAantalTellers = new JComboBox(aantalTellers);
      comboBoxAantalTellers.addActionListener(new ActionListener() {
      	public void actionPerformed(ActionEvent arg0) {
      		
			maxTellers = (int)comboBoxAantalTellers.getSelectedItem() -1;

			for(JComboBox cmb : comboBoxesList)
				cmb.setVisible(false);
			
			for(JTextField txt : textFieldList)
				txt.setVisible(false);
			
			for(int i = 0; i <= maxTellers; i++)
				comboBoxesList.get(i).setVisible(true);
			
			for(int i = 0; i <= maxTellers; i++)
				textFieldList.get(i).setVisible(true);
      	}
      });
      comboBoxAantalTellers.setBounds(202, 22, 65, 20);
      add(comboBoxAantalTellers);
      
      instellingButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
      


	}
   
   public void setInstellingButtonListener(ActionListener listenerForInstellingButton){
		  instellingButton.addActionListener(listenerForInstellingButton);			 
	}
   
   /*
   public String getAantalTellers()
   {
	   return this.textFieldAantalTellers.getText();
   }
   
   public void setAantalTellers(Integer aantal)
   {
	   String aantalText = aantal.toString();
	   this.textFieldAantalTellers.setText(aantalText);
   }
*/
   
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


