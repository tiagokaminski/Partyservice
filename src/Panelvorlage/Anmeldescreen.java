package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Anmeldescreen extends Panelvorlage {
	private JButton buttonNewButton;

	public Anmeldescreen(MainGui mainGui) {
		super(mainGui);
		initGUI();
	}
	private void initGUI() {
		{
			buttonNewButton = new JButton("Weiter als Gast");
			buttonNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonNewButtonActionPerformed(e);
				}
			});
			buttonNewButton.setBounds(310, 227, 114, 23);
			add(buttonNewButton);
		}
	}
	protected void buttonNewButtonActionPerformed(ActionEvent e) {
		maingui.switchTo(v.liveSuche, 0);
	}
}
