package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;

public class Sortiment extends Panelvorlage {
	private JButton buttonZumWarenkorb;
	private JList list;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JButton buttonRefresh;
	private JLabel labelSortiment;
	private JLabel labelSortiment_1;

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
			buttonZumWarenkorb.setBounds(361, 256, 89, 23);
			add(buttonZumWarenkorb);
		}
		{
			list = new JList();
			list.setBounds(21, 21, 1, 1);
			add(list);
		}
		{
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"Test", "Test 1"}));
			comboBox.setToolTipText("");
			comboBox.setBounds(21, 49, 141, 32);
			add(comboBox);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setBounds(205, 49, 145, 32);
			add(comboBox_1);
		}
		{
			buttonRefresh = new JButton("Refresh");
			buttonRefresh.setBounds(21, 102, 141, 35);
			add(buttonRefresh);
		}
		{
			labelSortiment = new JLabel("Sortiment 1");
			labelSortiment.setBounds(21, 10, 141, 26);
			add(labelSortiment);
		}
		{
			labelSortiment_1 = new JLabel("Sortiment 2");
			labelSortiment_1.setBounds(205, 10, 145, 26);
			add(labelSortiment_1);
		}
	}
	protected void buttonZumWarenkorbActionPerformed(ActionEvent e) {
	maingui.switchTo(v.warenkorb);
	}
}
