package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import model.Adresse;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

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
			buttonNewButton.setBounds(392, 229, 101, 23);
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
		
			textField_Adresse.setBounds(103, 38, 199, 20);
			add(textField_Adresse);
			textField_Adresse.setColumns(10);
		}
		{
			labelNewLabel = new JLabel("Stra\u00DFe:");
			labelNewLabel.setBounds(47, 41, 46, 14);
			add(labelNewLabel);
		}
		{
			labelHausnummer = new JLabel("Hausnummer:");
			labelHausnummer.setBounds(57, 68, 103, 14);
			add(labelHausnummer);
		}
		{
			textField_Hausnummer = new JTextField();
			textField_Hausnummer.setBounds(170, 65, 46, 20);
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
			list.setBounds(49, 96, 242, 122);
			add(list);
		}
		{
			textField_Fehlermeldung = new JTextField();
			textField_Fehlermeldung.setForeground(Color.RED);
			textField_Fehlermeldung.setEditable(false);
			textField_Fehlermeldung.setBackground(Color.LIGHT_GRAY);
			textField_Fehlermeldung.setBounds(49, 229, 316, 48);
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

