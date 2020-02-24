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

	private JTextField Ueberschrift;
	protected Views v;
	protected MainGui maingui;

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
		{
			Ueberschrift = new JTextField();
			Ueberschrift.setBackground(Color.CYAN);
			Ueberschrift.setForeground(Color.BLACK);
			Ueberschrift.setHorizontalAlignment(SwingConstants.CENTER);
			Ueberschrift.setEditable(false);
			Ueberschrift.setFont(new Font("Tahoma", Font.PLAIN, 30));
			Ueberschrift.setBounds(0, 0, 450, 53);
			add(Ueberschrift);
			Ueberschrift.setColumns(10);
		}
	}
	
	public void setUeberschrift(String Ueberschrift) {
		this.Ueberschrift.setText(Ueberschrift);
	}
	
	public void beautifyButton(JButton btn) {
		btn.setBackground(Color.CYAN);
		btn.setForeground(Color.BLACK);
	}
}
