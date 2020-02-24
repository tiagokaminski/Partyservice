package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class Wilkommensscreen extends Panelvorlage {
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
			labelPartyservice = new JLabel("Partyservice");
			labelPartyservice.setHorizontalAlignment(SwingConstants.CENTER);
			labelPartyservice.setFont(new Font("Tahoma", Font.PLAIN, 69));
			labelPartyservice.setBounds(0, 11, 1920, 95);
			add(labelPartyservice);
		}
		{
			labelVonAndreasTom = new JLabel("Von Andreas, Tom, Tiago, Cedric und Miguel");
			labelVonAndreasTom.setBounds(1617, 970, 274, 26);
			add(labelVonAndreasTom);
		}
		
		JLabel lblSmiley = new JLabel("");
		lblSmiley.setBounds(141, 151, 46, 14);
		add(lblSmiley);
	}
}
