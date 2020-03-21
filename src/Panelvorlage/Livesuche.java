package Panelvorlage;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import model.Adresse;
import Panelvorlage.LivesucheAdresseDAO;


public class Livesuche extends Panelvorlage {
	private JButton buttonNewButton;
	private JTextField textField_Adresse;
	private JLabel labelNewLabel;
	private JLabel labelHausnummer;
	private JTextField textField_Hausnummer;
	private JList list;
	private JTextField textField_Fehlermeldung;


	public Livesuche(MainGui mainGui) {
		super(mainGui);
		initGUI();
	}
	private void initGUI() {
		{
			buttonNewButton = new JButton("zum Sortiment");
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonNewButtonActionPerformed(e);
				}
			});
			buttonNewButton.setBounds(390, 310, 101, 23);
			add(buttonNewButton);
		}
		{
			textField_Adresse = new JTextField();
			textField_Adresse.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					try {
						liveSucheFeld(e);
					} catch (ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
		
			textField_Adresse.setBounds(125, 121, 164, 20);
			add(textField_Adresse);
			textField_Adresse.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			textField_Adresse.setColumns(10);
		}
		{
			labelNewLabel = new JLabel("Stra\u00DFe:");
			labelNewLabel.setBounds(54, 124, 46, 14);
			add(labelNewLabel);
		}
		{
			labelHausnummer = new JLabel("Hausnummer:");
			labelHausnummer.setBounds(55, 149, 103, 14);
			add(labelHausnummer);
		}
		{
			textField_Hausnummer = new JTextField();
			textField_Hausnummer.setBounds(125, 146, 164, 20);
			textField_Hausnummer.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			add(textField_Hausnummer);
			textField_Hausnummer.setColumns(10);
		}
		{
			list = new JList();
			list.addListSelectionListener(new ListSelectionListener() {
				public void valueChanged(ListSelectionEvent e) {
					listValueChanged(e);
				}
			});
		
			list.setBackground(Color.WHITE);
			list.setForeground(Color.RED);
			list.setBounds(47, 177, 242, 122);
			add(list);
		}
		{
			textField_Fehlermeldung = new JTextField();
			textField_Fehlermeldung.setForeground(Color.RED);
			textField_Fehlermeldung.setEditable(false);
			textField_Fehlermeldung.setBackground(Color.LIGHT_GRAY);
			textField_Fehlermeldung.setBounds(47, 310, 316, 48);
			add(textField_Fehlermeldung);
			textField_Fehlermeldung.setBorder(javax.swing.BorderFactory.createEmptyBorder());
			textField_Fehlermeldung.setColumns(10);
		}
	}

	protected void buttonNewButtonActionPerformed(ActionEvent e) {
		if (!this.textField_Adresse.getText().equals("") && !this.textField_Hausnummer.getText().equals("")) {
			maingui.switchTo(v.sortiment);
		}else if (this.textField_Adresse.getText().equals("") || this.textField_Hausnummer.getText().equals("")) {
			this.textField_Fehlermeldung.setText("Adress- und Hausnummernfeld dürfen nicht leer sein!");
		} 
	}
	
	protected void liveSucheFeld(KeyEvent e) throws ClassNotFoundException {	
			LivesucheAdresseDAO dao=new LivesucheAdresseDAO();
			String eingabe = this.textField_Adresse.getText();
			ArrayList<Adresse> adressen = dao.lifesuche(eingabe);
			DefaultListModel<String> listmodel = new DefaultListModel<>();
			
			for(Adresse a: adressen) {
				listmodel.addElement(a.getStrasse() + ", " + a.getPlz() + " " + a.getOrt());
			}
			this.list.setModel(listmodel);			
	}
	
	protected void listValueChanged(ListSelectionEvent e) {
		String a= this.list.getSelectedValue().toString();
		this.textField_Adresse.setText(a);
		
	}
}

