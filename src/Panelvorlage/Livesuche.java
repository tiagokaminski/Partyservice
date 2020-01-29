package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Livesuche extends Panelvorlage {
	private JButton buttonNewButton;


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
			buttonNewButton.setBounds(323, 227, 101, 23);
			add(buttonNewButton);
		}
	}

	protected void buttonNewButtonActionPerformed(ActionEvent e) {
		maingui.switchTo(Views.sortiment);
	}
}
