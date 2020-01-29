package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Warenkorb extends Panelvorlage {
	private JButton buttonKasse;

	/**
	 * Create the panel.
	 * @param mainGui 
	 */
	public Warenkorb(MainGui mainGui) {
		super(mainGui);
		initGUI();
	}
	private void initGUI() {
		setLayout(null);
		{
			buttonKasse = new JButton("Kasse");
			buttonKasse.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonKasseActionPerformed(e);
				}
			});
			buttonKasse.setBounds(351, 230, 89, 23);
			add(buttonKasse);
		}
	}

	protected void buttonKasseActionPerformed(ActionEvent e) {
		maingui.switchTo(v.kasse);
	}
}
