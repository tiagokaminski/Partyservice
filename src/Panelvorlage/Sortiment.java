package Panelvorlage;

import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTree;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;

public class Sortiment extends Panelvorlage {
	private JButton buttonZumWarenkorb;
	private JList list;
	private JButton buttonRefresh;
	private JRadioButton radioButtonVodka;
	private JRadioButton radioButtonRum;
	private JRadioButton radioButtonKraeuterlikoer;
	private JRadioButton radioButtonLikr;
	private JRadioButton radioButtonWhiskey;
	private JRadioButton radioButtonKnabberzeug;
	private JRadioButton radioButtonPringles;
	private JRadioButton radioButtonLays;
	private JRadioButton radioButtonPombr;
	private JRadioButton radioButtonSkram;
	private JLabel labelAlkohol;
	private JLabel labelSnacks;
	private JLabel labelGetraenke;
	private JRadioButton radioButtonSoftdrinks;
	private JRadioButton radioButtonSfte;
	private JRadioButton radioButtonSonstiges;
	private JRadioButton radioButtonExtras;
	private JLabel labelExtras;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton buttonFilterAnwenden;
	private JPanel panel;

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
			buttonZumWarenkorb.setBounds(610, 584, 89, 23);
			add(buttonZumWarenkorb);
		}
		{
			list = new JList();
			list.setBounds(21, 21, 1, 1);
			add(list);
		}
		{
			panel = new JPanel();
			panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Filter", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			panel.setBounds(43, 53, 213, 652);
			add(panel);
			panel.setLayout(null);
			{
				radioButtonVodka = new JRadioButton("Vodka");
				radioButtonVodka.setBounds(6, 71, 201, 35);
				panel.add(radioButtonVodka);
				radioButtonVodka.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonVodka);
			}
			{
				radioButtonRum = new JRadioButton("Rum");
				radioButtonRum.setBounds(6, 104, 201, 35);
				panel.add(radioButtonRum);
				radioButtonRum.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonRum);
			}
			{
				radioButtonKraeuterlikoer = new JRadioButton("Kr\u00E4uterlik\u00F6r");
				radioButtonKraeuterlikoer.setBounds(6, 135, 201, 35);
				panel.add(radioButtonKraeuterlikoer);
				radioButtonKraeuterlikoer.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonKraeuterlikoer);
			}
			{
				radioButtonLikr = new JRadioButton("Lik\u00F6r");
				radioButtonLikr.setBounds(6, 167, 201, 35);
				panel.add(radioButtonLikr);
				radioButtonLikr.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonLikr);
			}
			{
				radioButtonWhiskey = new JRadioButton("Whiskey");
				radioButtonWhiskey.setBounds(6, 198, 201, 35);
				panel.add(radioButtonWhiskey);
				radioButtonWhiskey.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonWhiskey);
			}
			{
				radioButtonKnabberzeug = new JRadioButton("Knabberzeug");
				radioButtonKnabberzeug.setBounds(6, 413, 201, 35);
				panel.add(radioButtonKnabberzeug);
				radioButtonKnabberzeug.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonKnabberzeug);
			}
			{
				radioButtonPringles = new JRadioButton("Pringles");
				radioButtonPringles.setBounds(6, 444, 201, 35);
				panel.add(radioButtonPringles);
				radioButtonPringles.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPringles);
			}
			{
				radioButtonLays = new JRadioButton("Lays");
				radioButtonLays.setBounds(6, 474, 201, 35);
				panel.add(radioButtonLays);
				radioButtonLays.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonLays);
			}
			{
				radioButtonPombr = new JRadioButton("Pomb\u00E4r");
				radioButtonPombr.setBounds(6, 506, 201, 35);
				panel.add(radioButtonPombr);
				radioButtonPombr.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPombr);
			}
			{
				radioButtonSkram = new JRadioButton("S\u00FC\u00DFkram");
				radioButtonSkram.setBounds(6, 538, 201, 35);
				panel.add(radioButtonSkram);
				radioButtonSkram.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSkram);
			}
			{
				labelAlkohol = new JLabel("Alkohol");
				labelAlkohol.setBounds(6, 43, 92, 26);
				panel.add(labelAlkohol);
				labelAlkohol.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				labelSnacks = new JLabel("Snacks");
				labelSnacks.setBounds(6, 390, 92, 26);
				panel.add(labelSnacks);
				labelSnacks.setFont(new Font("Tahoma", Font.PLAIN, 23));
			}
			{
				labelGetraenke = new JLabel("Getr\u00E4nke");
				labelGetraenke.setBounds(6, 250, 144, 26);
				panel.add(labelGetraenke);
				labelGetraenke.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				radioButtonSoftdrinks = new JRadioButton("Softdrinks");
				radioButtonSoftdrinks.setBounds(6, 274, 201, 35);
				panel.add(radioButtonSoftdrinks);
				radioButtonSoftdrinks.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSoftdrinks);
			}
			{
				radioButtonSfte = new JRadioButton("S\u00E4fte");
				radioButtonSfte.setBounds(6, 306, 201, 35);
				panel.add(radioButtonSfte);
				radioButtonSfte.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSfte);
			}
			{
				radioButtonSonstiges = new JRadioButton("Sonstiges");
				radioButtonSonstiges.setBounds(6, 338, 201, 35);
				panel.add(radioButtonSonstiges);
				radioButtonSonstiges.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSonstiges);
			}
			{
				radioButtonExtras = new JRadioButton("Extras");
				radioButtonExtras.setBounds(6, 613, 201, 35);
				panel.add(radioButtonExtras);
				radioButtonExtras.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonExtras);
			}
			{
				labelExtras = new JLabel("Extras");
				labelExtras.setBounds(6, 590, 92, 26);
				panel.add(labelExtras);
				labelExtras.setFont(new Font("Tahoma", Font.PLAIN, 23));
			}
		}
		{
			buttonFilterAnwenden = new JButton("Filter Anwenden");
			buttonFilterAnwenden.setFont(new Font("Tahoma", Font.PLAIN, 22));
			buttonFilterAnwenden.setBounds(43, 726, 214, 35);
			add(buttonFilterAnwenden);
		}
	}
	protected void buttonZumWarenkorbActionPerformed(ActionEvent e) {
	maingui.switchTo(v.warenkorb);
	}
}
