package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProduktVorlage extends JPanel {
	private JPanel panel;
	private JPanel panel_1;
	private JTextField textFieldName;
	private JTextField textFieldpreis;

	/**
	 * Create the panel.
	 */
	public ProduktVorlage() {

		initGUI();
	}
	private void initGUI() {
		setLayout(null);
		{
			panel = new JPanel();
			panel.setBounds(10, 11, 261, 185);
			add(panel);
			panel.setLayout(null);
			{
				panel_1 = new JPanel();
				panel_1.setBounds(10, 11, 112, 98);
				panel.add(panel_1);
			}
			{
				textFieldName = new JTextField();
				textFieldName.setBounds(148, 11, 86, 20);
				panel.add(textFieldName);
				textFieldName.setColumns(10);
			}
			{
				textFieldpreis = new JTextField();
				textFieldpreis.setBounds(148, 42, 86, 20);
				panel.add(textFieldpreis);
				textFieldpreis.setColumns(10);
			}
		}
	}

}
