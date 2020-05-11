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
		setLayout(null);
		{
//			labelPartyservice = new JLabel("Partyservice");
//			labelPartyservice.setVerticalAlignment(SwingConstants.BOTTOM);
//			labelPartyservice.setFont(new Font("Tahoma", Font.PLAIN, 69));
//			labelPartyservice.setBounds(BoundsCalc.calcBounds(33, 0, 449, 75));
//			add(labelPartyservice);
			setUeberschrift("Partyservice");
		}
		{
			labelVonAndreasTom = new JLabel("Von Andreas, Tom, Tiago, Cedric und Miguel");
			labelVonAndreasTom.setBounds(230, 64, 300, 14);
			add(labelVonAndreasTom);
		}
		
//		JLabel lblSmiley = new JLabel("");
//		lblSmiley.setBounds(141, 151, 46, 14);
//		add(lblSmiley);
	}
}
