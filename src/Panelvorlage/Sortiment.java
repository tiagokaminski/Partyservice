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

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.font.TextAttribute;

public class Sortiment extends Panelvorlage {
	private JButton buttonZumWarenkorb;
	private JList list;
	private JButton buttonRefresh;
	private JRadioButton radioButtonVodka;
	private JRadioButton radioButtonRum;
	private JRadioButton radioButtonKraeuterlikoer;
	private JRadioButton radioButtonLikoer;
	private JRadioButton radioButtonWhiskey;
	private JRadioButton radioButtonKnabberzeug;
	private JRadioButton radioButtonPringles;
	private JRadioButton radioButtonLays;
	private JRadioButton radioButtonPombaer;
	private JRadioButton radioButtonSuesskram;
	private JLabel labelAlkohol;
	private JLabel labelSnacks;
	private JLabel labelGetraenke;
	private JRadioButton radioButtonSoftdrinks;
	private JRadioButton radioButtonSaefte;
	private JRadioButton radioButtonSonstiges;
	private JRadioButton radioButtonExtras;
	private JLabel labelExtras;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton buttonFilterAnwenden;
	private JPanel panel;
	FilterDao filterDao = new FilterDao();
	String alkohol = null;
	String snacks = null;
	String softdrinks = null;
	String extras = null;
	private JTextField textFieldTest;
	

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
			buttonZumWarenkorb = new JButton("weiter zum Warenkorb");
			buttonZumWarenkorb.setBackground(Color.WHITE);
			buttonZumWarenkorb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonZumWarenkorbActionPerformed(e);
				}
			});
			buttonZumWarenkorb.setBounds(1472, 842, 141, 35);
			add(buttonZumWarenkorb);
		}
		{
			
		}
		{
			list = new JList();
			list.setBounds(21, 21, 1, 1);
			add(list);
		}
		
		{
			panel = new JPanel();
			panel.setBackground(Color.WHITE);
			TitledBorder tb=new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Sortiment", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0));
			tb.setTitleFont(new Font("Tahoma", Font.PLAIN, 26));
			panel.setBorder(tb);
			panel.setBounds(1697, 11, 213, 652);
			add(panel);
			panel.setLayout(null);
			
			{
				

				}
				radioButtonVodka = new JRadioButton("Vodka");
				radioButtonVodka.setBackground(Color.WHITE);
				radioButtonVodka.setBounds(6, 78, 201, 35);
				panel.add(radioButtonVodka);
				radioButtonVodka.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonVodka);
				
			}
			{
				radioButtonRum = new JRadioButton("Rum");
				radioButtonRum.setBackground(Color.WHITE);
				radioButtonRum.setBounds(6, 110, 201, 35);
				panel.add(radioButtonRum);
				radioButtonRum.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonRum);
			}
			{
				radioButtonKraeuterlikoer = new JRadioButton("Kr\u00E4uterlik\u00F6r");
				radioButtonKraeuterlikoer.setBackground(Color.WHITE);
				radioButtonKraeuterlikoer.setBounds(6, 142, 201, 35);
				panel.add(radioButtonKraeuterlikoer);
				radioButtonKraeuterlikoer.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonKraeuterlikoer);
			}
			{
				radioButtonLikoer = new JRadioButton("Lik\u00F6r");
				radioButtonLikoer.setBackground(Color.WHITE);
				radioButtonLikoer.setBounds(6, 173, 201, 35);
				panel.add(radioButtonLikoer);
				radioButtonLikoer.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonLikoer);
			}
			{
				radioButtonWhiskey = new JRadioButton("Whiskey");
				radioButtonWhiskey.setBackground(Color.WHITE);
				radioButtonWhiskey.setBounds(6, 205, 201, 35);
				panel.add(radioButtonWhiskey);
				radioButtonWhiskey.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonWhiskey);
			}
			{
				radioButtonKnabberzeug = new JRadioButton("Knabberzeug");
				radioButtonKnabberzeug.setBackground(Color.WHITE);
				radioButtonKnabberzeug.setBounds(6, 413, 201, 35);
				panel.add(radioButtonKnabberzeug);
				radioButtonKnabberzeug.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonKnabberzeug);
			}
			{
				radioButtonPringles = new JRadioButton("Pringles");
				radioButtonPringles.setBackground(Color.WHITE);
				radioButtonPringles.setBounds(6, 444, 201, 35);
				panel.add(radioButtonPringles);
				radioButtonPringles.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPringles);
			}
			{
				radioButtonLays = new JRadioButton("Lays");
				radioButtonLays.setBackground(Color.WHITE);
				radioButtonLays.setBounds(6, 474, 201, 35);
				panel.add(radioButtonLays);
				radioButtonLays.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonLays);
			}
			{
				radioButtonPombaer = new JRadioButton("Pomb\u00E4r");
				radioButtonPombaer.setBackground(Color.WHITE);
				radioButtonPombaer.setBounds(6, 506, 201, 35);
				panel.add(radioButtonPombaer);
				radioButtonPombaer.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPombaer);
			}
			{
				radioButtonSuesskram = new JRadioButton("S\u00FC\u00DFkram");
				radioButtonSuesskram.setBackground(Color.WHITE);
				radioButtonSuesskram.setBounds(6, 538, 201, 35);
				panel.add(radioButtonSuesskram);
				radioButtonSuesskram.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSuesskram);
			}
			{
				labelAlkohol = new JLabel("<html><u>Alkohol</u></html>");
				labelAlkohol.setBounds(6, 47, 92, 26);
				panel.add(labelAlkohol);
				labelAlkohol.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				labelSnacks = new JLabel("<html><u>Snacks</u></html>");
				labelSnacks.setBounds(6, 389, 92, 26);
				panel.add(labelSnacks);
				labelSnacks.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				labelGetraenke = new JLabel("<html><u>Getränke</u></html>");
				labelGetraenke.setBounds(6, 250, 144, 26);
				panel.add(labelGetraenke);
				labelGetraenke.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				radioButtonSoftdrinks = new JRadioButton("Softdrinks");
				radioButtonSoftdrinks.setBackground(Color.WHITE);
				radioButtonSoftdrinks.setBounds(6, 274, 201, 35);
				panel.add(radioButtonSoftdrinks);
				radioButtonSoftdrinks.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSoftdrinks);
			}
			{
				radioButtonSaefte = new JRadioButton("S\u00E4fte");
				radioButtonSaefte.setBackground(Color.WHITE);
				radioButtonSaefte.setBounds(6, 306, 201, 35);
				panel.add(radioButtonSaefte);
				radioButtonSaefte.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSaefte);
			}
			{
				radioButtonSonstiges = new JRadioButton("Sonstiges");
				radioButtonSonstiges.setBackground(Color.WHITE);
				radioButtonSonstiges.setBounds(6, 338, 201, 35);
				panel.add(radioButtonSonstiges);
				radioButtonSonstiges.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSonstiges);
			}
			{
				radioButtonExtras = new JRadioButton("Extras");
				radioButtonExtras.setBackground(Color.WHITE);
				radioButtonExtras.setBounds(6, 613, 201, 35);
				panel.add(radioButtonExtras);
				radioButtonExtras.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonExtras);
			}
			{
				labelExtras = new JLabel("<html><u>Extras</u></html>");
				labelExtras.setBounds(6, 589, 92, 26);
				panel.add(labelExtras);
				labelExtras.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
		{
			textFieldTest = new JTextField();
			textFieldTest.setText("Test");
			textFieldTest.setBounds(21, 62, 516, 334);
			add(textFieldTest);
			textFieldTest.setColumns(10);
		}
		}
		{
			buttonFilterAnwenden = new JButton("Filter Anwenden");
			buttonFilterAnwenden.setBackground(Color.WHITE);
			buttonFilterAnwenden.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					buttonFilterAnwendenActionPerformed(arg0);
				}
			});
			buttonFilterAnwenden.setFont(new Font("Tahoma", Font.PLAIN, 22));
			buttonFilterAnwenden.setBounds(1697, 674, 214, 35);
			add(buttonFilterAnwenden);
		}
	
	protected void buttonZumWarenkorbActionPerformed(ActionEvent e) {
		maingui.switchTo(v.warenkorb);
	}

	protected void buttonFilterAnwendenActionPerformed(ActionEvent arg0) {
		
		if(radioButtonExtras.isSelected()) {
			extras = "Extras";
			filterDao.extrasAusgewaehlt(extras);
		}

		if(radioButtonVodka.isSelected()) {
			alkohol = "1";
			filterDao.alkoholAusgewaehlt(alkohol);
		}

		if(radioButtonRum.isSelected()) {
			alkohol = "2";
			filterDao.alkoholAusgewaehlt(alkohol);
		}

		if(radioButtonKraeuterlikoer.isSelected()) {
			alkohol = "3";
			filterDao.alkoholAusgewaehlt(alkohol);
		}

		if(radioButtonLikoer.isSelected()) {
			alkohol = "4";
			filterDao.alkoholAusgewaehlt(alkohol);
		}

		if(radioButtonWhiskey.isSelected()) {
			alkohol = "5";
			filterDao.alkoholAusgewaehlt(alkohol);
		}

		if(radioButtonSoftdrinks.isSelected()) {
			softdrinks = "1";
			filterDao.softdrinksAusgewaehlt(softdrinks);
		}

		if(radioButtonSaefte.isSelected()) {
			softdrinks = "2";
			filterDao.softdrinksAusgewaehlt(softdrinks);
		}

		if(radioButtonSonstiges.isSelected()) {
			softdrinks = "3";
			filterDao.softdrinksAusgewaehlt(softdrinks);
		}

		if(radioButtonKnabberzeug.isSelected()) {
			snacks = "1";
			filterDao.snacksAusgewaehlt(snacks);
		}

		if(radioButtonPringles.isSelected()) {
			snacks = "2";
			filterDao.snacksAusgewaehlt(snacks);
		}

		if(radioButtonLays.isSelected()) {
			snacks = "3";
			filterDao.snacksAusgewaehlt(snacks);
		}

		if(radioButtonPombaer.isSelected()) {
			snacks = "4";
			filterDao.snacksAusgewaehlt(snacks);
		}

		if(radioButtonSuesskram.isSelected()) {
			snacks = "5";
			filterDao.snacksAusgewaehlt(snacks);
		}
		
		//textFieldTest.setText(filterDao.);
	}
}
