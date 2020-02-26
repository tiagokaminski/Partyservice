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
import java.nio.file.DirectoryStream.Filter;

import javax.swing.JSeparator;
import javax.swing.JTextPane;

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
	private JRadioButton radioButtonSoftdrinks;
	private JRadioButton radioButtonSaefte;
	private JRadioButton radioButtonSonstiges;
	private JRadioButton radioButtonExtras;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton buttonFilterAnwenden;
	private JPanel panel;
	private JRadioButton radioButtonAlkohol;
	private JRadioButton radioButtonGetraenke;
	private JSeparator separator;
	private JSeparator separator_1;
	private JSeparator separator_2;
	private JSeparator separator_3;
	private JRadioButton rdbtnsnacks;
	private JSeparator separator_4;
	private JSeparator separator_5;
	private JRadioButton rdbtnextras;
	private int unterkategorie;
	private int kategorie;
	private FilterDao filterDao = new FilterDao();
	private JTextPane textPaneTest;
	

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
			buttonZumWarenkorb.setFont(new Font("Tahoma", Font.PLAIN, 26));
			buttonZumWarenkorb.setBackground(Color.WHITE);
			buttonZumWarenkorb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					buttonZumWarenkorbActionPerformed(e);
				}
			});
			buttonZumWarenkorb.setBounds(1395, 736, 305, 108);
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
			panel.setBounds(1697, 11, 213, 672);
			add(panel);
			panel.setLayout(null);
			
			{
				

				}
				{
					separator = new JSeparator();
					separator.setForeground(Color.LIGHT_GRAY);
					separator.setBounds(0, 236, 225, 2);
					panel.add(separator);
				}
				{
					separator_1 = new JSeparator();
					separator_1.setForeground(Color.LIGHT_GRAY);
					separator_1.setBounds(0, 238, 225, 2);
					panel.add(separator_1);
				}
				{
					separator_2 = new JSeparator();
					separator_2.setForeground(Color.LIGHT_GRAY);
					separator_2.setBounds(0, 381, 225, 2);
					panel.add(separator_2);
				}
				{
					separator_3 = new JSeparator();
					separator_3.setForeground(Color.LIGHT_GRAY);
					separator_3.setBounds(0, 383, 225, 2);
					panel.add(separator_3);
				}
				radioButtonVodka = new JRadioButton("Vodka");
				buttonGroup.add(radioButtonVodka);
				radioButtonVodka.setBackground(Color.WHITE);
				radioButtonVodka.setBounds(6, 67, 201, 35);
				panel.add(radioButtonVodka);
				radioButtonVodka.setFont(new Font("Tahoma", Font.PLAIN, 22));
				
			}
			{
				rdbtnextras = new JRadioButton("<html><u>Extras</u></html>");
				buttonGroup.add(rdbtnextras);
				rdbtnextras.setFont(new Font("Tahoma", Font.PLAIN, 26));
				rdbtnextras.setBackground(Color.WHITE);
				rdbtnextras.setBounds(6, 598, 201, 35);
				panel.add(rdbtnextras);
			}
			{
				radioButtonRum = new JRadioButton("Rum");
				buttonGroup.add(radioButtonRum);
				radioButtonRum.setBackground(Color.WHITE);
				radioButtonRum.setBounds(6, 99, 201, 35);
				panel.add(radioButtonRum);
				radioButtonRum.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				radioButtonKraeuterlikoer = new JRadioButton("Kr\u00E4uterlik\u00F6r");
				buttonGroup.add(radioButtonKraeuterlikoer);
				radioButtonKraeuterlikoer.setBackground(Color.WHITE);
				radioButtonKraeuterlikoer.setBounds(6, 131, 201, 35);
				panel.add(radioButtonKraeuterlikoer);
				radioButtonKraeuterlikoer.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				radioButtonLikoer = new JRadioButton("Lik\u00F6r");
				buttonGroup.add(radioButtonLikoer);
				radioButtonLikoer.setBackground(Color.WHITE);
				radioButtonLikoer.setBounds(6, 162, 201, 35);
				panel.add(radioButtonLikoer);
				radioButtonLikoer.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				radioButtonWhiskey = new JRadioButton("Whiskey");
				buttonGroup.add(radioButtonWhiskey);
				radioButtonWhiskey.setBackground(Color.WHITE);
				radioButtonWhiskey.setBounds(6, 194, 201, 35);
				panel.add(radioButtonWhiskey);
				radioButtonWhiskey.setFont(new Font("Tahoma", Font.PLAIN, 22));
			}
			{
				rdbtnsnacks = new JRadioButton("<html><u>Snacks</u></html>");
				buttonGroup.add(rdbtnsnacks);
				rdbtnsnacks.setFont(new Font("Tahoma", Font.PLAIN, 26));
				rdbtnsnacks.setBackground(Color.WHITE);
				rdbtnsnacks.setBounds(6, 392, 201, 35);
				panel.add(rdbtnsnacks);
			}
			{
				radioButtonKnabberzeug = new JRadioButton("Knabberzeug");
				radioButtonKnabberzeug.setBackground(Color.WHITE);
				radioButtonKnabberzeug.setBounds(6, 422, 201, 35);
				panel.add(radioButtonKnabberzeug);
				radioButtonKnabberzeug.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonKnabberzeug);
			}
			{
				radioButtonPringles = new JRadioButton("Pringles");
				radioButtonPringles.setBackground(Color.WHITE);
				radioButtonPringles.setBounds(6, 453, 201, 35);
				panel.add(radioButtonPringles);
				radioButtonPringles.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPringles);
			}
			{
				radioButtonLays = new JRadioButton("Lays");
				radioButtonLays.setBackground(Color.WHITE);
				radioButtonLays.setBounds(6, 483, 201, 35);
				panel.add(radioButtonLays);
				radioButtonLays.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonLays);
			}
			{
				radioButtonPombaer = new JRadioButton("Pomb\u00E4r");
				radioButtonPombaer.setBackground(Color.WHITE);
				radioButtonPombaer.setBounds(6, 515, 201, 35);
				panel.add(radioButtonPombaer);
				radioButtonPombaer.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonPombaer);
			}
			{
				radioButtonSuesskram = new JRadioButton("S\u00FC\u00DFkram");
				radioButtonSuesskram.setBackground(Color.WHITE);
				radioButtonSuesskram.setBounds(6, 547, 201, 35);
				panel.add(radioButtonSuesskram);
				radioButtonSuesskram.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonSuesskram);
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
				radioButtonExtras.setBounds(6, 632, 201, 35);
				panel.add(radioButtonExtras);
				radioButtonExtras.setFont(new Font("Tahoma", Font.PLAIN, 22));
				buttonGroup.add(radioButtonExtras);
			}
			{
				radioButtonAlkohol = new JRadioButton("<html><u>Alkohol</u></html>");
				buttonGroup.add(radioButtonAlkohol);
				radioButtonAlkohol.setFont(new Font("Tahoma", Font.PLAIN, 26));
				radioButtonAlkohol.setBackground(Color.WHITE);
				radioButtonAlkohol.setBounds(6, 35, 201, 35);
				panel.add(radioButtonAlkohol);
			}
			{
				radioButtonGetraenke = new JRadioButton("<html><u>Getr\u00E4nke</u></html>");
				buttonGroup.add(radioButtonGetraenke);
				radioButtonGetraenke.setFont(new Font("Tahoma", Font.PLAIN, 26));
				radioButtonGetraenke.setBackground(Color.WHITE);
				radioButtonGetraenke.setBounds(6, 243, 201, 35);
				panel.add(radioButtonGetraenke);
			}
			{
				separator_4 = new JSeparator();
				separator_4.setForeground(Color.LIGHT_GRAY);
				separator_4.setBounds(0, 589, 225, 2);
				panel.add(separator_4);
			}
			{
				separator_5 = new JSeparator();
				separator_5.setForeground(Color.LIGHT_GRAY);
				separator_5.setBounds(0, 591, 225, 2);
				panel.add(separator_5);
			}
		{
			textPaneTest = new JTextPane();
			textPaneTest.setText("Test");
			textPaneTest.setBounds(47, 66, 509, 407);
			add(textPaneTest);
		}
		}
		{
			buttonFilterAnwenden = new JButton("Filter Anwenden");
			buttonFilterAnwenden.setBackground(Color.WHITE);
			buttonFilterAnwenden.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					try {
						buttonFilterAnwendenActionPerformed(arg0);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			});
			buttonFilterAnwenden.setFont(new Font("Tahoma", Font.PLAIN, 22));
			buttonFilterAnwenden.setBounds(1697, 690, 214, 35);
			add(buttonFilterAnwenden);
		}
	
	protected void buttonZumWarenkorbActionPerformed(ActionEvent e) {
		maingui.switchTo(v.warenkorb);
	}

	protected void buttonFilterAnwendenActionPerformed(ActionEvent arg0) throws ClassNotFoundException {
		if(radioButtonExtras.isSelected()) {
			unterkategorie = 1;
			filterDao.unterkategorieAusgewaehlt(1);
		}

		if(radioButtonVodka.isSelected()) {
			unterkategorie = 2;
			filterDao.unterkategorieAusgewaehlt(2);
			textPaneTest.setText(filterDao.getProduktListe());			
		}

		if(radioButtonRum.isSelected()) {
			unterkategorie = 3;
			filterDao.unterkategorieAusgewaehlt(3);
		}

		if(radioButtonKraeuterlikoer.isSelected()) {
			unterkategorie = 4;
			filterDao.unterkategorieAusgewaehlt(4);
		}

		if(radioButtonLikoer.isSelected()) {
			unterkategorie = 5;
			filterDao.unterkategorieAusgewaehlt(5);
		}

		if(radioButtonWhiskey.isSelected()) {
			unterkategorie = 6;
			filterDao.unterkategorieAusgewaehlt(6);
		}

		if(radioButtonSoftdrinks.isSelected()) {
			unterkategorie = 7;
			filterDao.unterkategorieAusgewaehlt(7);
		}

		if(radioButtonSaefte.isSelected()) {
			unterkategorie = 8;
			filterDao.unterkategorieAusgewaehlt(8);
		}

		if(radioButtonSonstiges.isSelected()) {
			unterkategorie = 9;
			filterDao.unterkategorieAusgewaehlt(9);
		}

		if(radioButtonKnabberzeug.isSelected()) {
			unterkategorie = 10;
			filterDao.unterkategorieAusgewaehlt(10);
		}

		if(radioButtonPringles.isSelected()) {
			unterkategorie = 11;
			filterDao.unterkategorieAusgewaehlt(11);
		}

		if(radioButtonLays.isSelected()) {
			unterkategorie = 12;
			filterDao.unterkategorieAusgewaehlt(12);
		}

		if(radioButtonPombaer.isSelected()) {
			unterkategorie = 13;
			filterDao.unterkategorieAusgewaehlt(13);
		}

		if(radioButtonSuesskram.isSelected()) {
			unterkategorie = 14;
			filterDao.unterkategorieAusgewaehlt(14);
		}
		
		if (rdbtnextras.isSelected()) {
			kategorie = 1;
		}
		
		if (rdbtnsnacks.isSelected()) {
			kategorie = 4;
		}
		
		if (radioButtonAlkohol.isSelected()) {
			kategorie = 2;
		}
		
		if (radioButtonGetraenke.isSelected()) {
			kategorie = 3;
		}
		
		
	}
}
