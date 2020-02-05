package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Panelvorlage extends JPanel {
	protected Views v;
	protected MainGui maingui;
	private JTextField txtTest;

	/**
	 * Create the panel.
	 */
	public Panelvorlage(MainGui maingui) {
		this.maingui = maingui;
		initGUI();
	}
	private void initGUI() {
		setBackground(Color.LIGHT_GRAY);
		setLayout(null);
		
		txtTest = new JTextField();
		txtTest.setText("Test");
		txtTest.setBounds(1834, 1002, 86, 20);
		add(txtTest);
		txtTest.setColumns(10);
	}
	
	public void setUeberschrift(String Ueberschrift) {
	}
	
	public void beautifyButton(JButton btn) {
		btn.setBackground(Color.CYAN);
		btn.setForeground(Color.BLACK);
	}
}
