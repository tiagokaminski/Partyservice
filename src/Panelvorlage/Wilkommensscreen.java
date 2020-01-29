package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Wilkommensscreen extends Panelvorlage {
	private JLabel labelWilkommen;
	private JLabel labelPartyservice;
	private JLabel labelVonAndreasTom;

	/**
	 * Create the panel.
	 */
	public Wilkommensscreen(MainGui mainGui) {
		super(mainGui);
		initGUI();
	}
	private void initGUI() {
		{
			labelWilkommen = new JLabel("Wilkommen beim ");
			labelWilkommen.setFont(new Font("Tahoma", Font.PLAIN, 30));
			labelWilkommen.setBounds(84, 46, 265, 26);
			add(labelWilkommen);
		}
		{
			labelPartyservice = new JLabel("Partyservice");
			labelPartyservice.setFont(new Font("Tahoma", Font.PLAIN, 30));
			labelPartyservice.setBounds(109, 93, 167, 26);
			add(labelPartyservice);
		}
		{
			labelVonAndreasTom = new JLabel("Von Andreas, Tom, Tiago, Cedric und Miguel");
			labelVonAndreasTom.setBounds(0, 207, 453, 26);
			add(labelVonAndreasTom);
		}
	}
}
