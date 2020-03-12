package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import model.Produkt;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.JLabel;

public class AuflistungSortiment extends JPanel {

	private JPanel panel;
	private JScrollPane scrollPane;
	SortimentDao dao = new SortimentDao();
	ArrayList<Produkt> produkt;


	/**
	 * Create the frame.
	 * @param mainGui 
	 * @throws ClassNotFoundException 
	 */
	public AuflistungSortiment()  {
		produkt = dao.ProduktnamenPreis();
		initGUI();
	}

	private void initGUI() {
		setBounds(100, 100, 826, 564);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		{
			this.scrollPane = new JScrollPane();
			this.scrollPane.setBounds(65, 33, 210, 481);
			this.add(this.scrollPane);
			{
				this.panel = new JPanel();
				this.scrollPane.setViewportView(this.panel);
				this.panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				this.panel.setLayout(null);

			}
		}

		for(int i=0;i<this.produkt.size();i++) {
			for (int j = 0; j < produkt.size(); j++) {
				JPanel Panel = new JPanel();
				Panel.setBorder(new LineBorder(Color.ORANGE, 2));
				Panel.setBounds(10, 10+i*70, 171, 59);
				this.panel.add(Panel);
				Panel.setLayout(null);
				JLabel nameProdukt = new JLabel(this.produkt.get(i).getName());

				String preis = Double.toString(this.produkt.get(i).getPreis());					
				JLabel preis2 = new JLabel(preis + " €");
				nameProdukt.setBounds(21, 11, 46, 14);
				preis2.setBounds(100, 11, 46, 14);
				Panel.add(nameProdukt);
				Panel.add(preis2);

//				ArrayList<BufferedImage> ImmageList = new ArrayList<>();
//				for (int i1 = 0; i1 < ImmageList.size(); i1++) {
//
//					if (ImmageList.get(i1).equals("Produkt_" + nameProdukt)) {
//						
//					//	BufferedImage bild = this.ImmageList.get(i1);
//				//		bild.setBounds(130, 11, 46, 14);
						
					}
				}
				this.panel.setPreferredSize(new Dimension(180,  this.produkt.size()*70));
			}
	}


