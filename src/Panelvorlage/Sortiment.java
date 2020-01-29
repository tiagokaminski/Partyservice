package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sortiment extends Panelvorlage {
	private JButton buttonZumWarenkorb;

	/**
	 * Create the panel.
	 */
	public Sortiment(MainGui maingui) {
		super(maingui);
		initGUI();
	}
	private void initGUI() {
		setLayout(null);
		{
			buttonZumWarenkorb = new JButton("zum Warenkorb");
			buttonZumWarenkorb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonZumWarenkorbActionPerformed(e);
				}
			});
			buttonZumWarenkorb.setBounds(351, 75, 89, 23);
			add(buttonZumWarenkorb);
		}
	}
	protected void buttonZumWarenkorbActionPerformed(ActionEvent e) {
	maingui.switchTo(v.warenkorb);
	}
}
