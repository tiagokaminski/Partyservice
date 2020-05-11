package Panelvorlage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import javafx.scene.shape.Path;
import model.Image;
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
	File[] locationName = new File("C:\\Users\\a\\git\\Partyservice\\images").listFiles();
	File[] pathName = new File("C:\\Users\\a\\git\\Partyservice\\images").listFiles();

	/**
	 * Create the frame.
	 * @param mainGui 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public AuflistungSortiment() throws IOException  {
		produkt = dao.ProduktnamenPreis();
		initGUI();
	}

	private void initGUI() throws IOException {
		setBounds(100, 100, 826, 564);
		this.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setLayout(null);
		{
			this.scrollPane = new JScrollPane();
			this.scrollPane.setBounds(65, 33, 510, 481);
			this.add(this.scrollPane);
			{
				this.panel = new JPanel();
				this.scrollPane.setViewportView(this.panel);
				this.panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				this.panel.setLayout(null);
			}
		}

		for(int i=0;i<this.produkt.size();i++) {
			JPanel Panel = new JPanel();
			Panel.setBorder(new LineBorder(Color.ORANGE, 2));
			Panel.setBounds(10, 10+i*70, 371, 59);
			this.panel.add(Panel);
			Panel.setLayout(null);
			JLabel nameProdukt = new JLabel(this.produkt.get(i).getName());
			String preis = Double.toString(this.produkt.get(i).getPreis());		
			JLabel preis2 = new JLabel(preis + " €");

			nameProdukt.setBounds(21, 11, 156, 14);
			preis2.setBounds(170, 11, 46, 14);
			Panel.add(nameProdukt);
			Panel.add(preis2);


			for (int j = 0; j < pathName.length; j++) {

				String s = "/Partyservice/images/Produkt_Plastikmesser.png";
				int index = s.lastIndexOf('/');
				String pathName = s.substring(index+1);
				System.out.println(pathName);
				for (int i1 = 0; i1 < locationName.length; i1++) {
					String s1 = locationName[i1].toString();
					//	int index2 = s1.lastIndexOf('t');
					//String locationName = s1.substring(index+1);
					//System.out.println(locationName);
					if (s1.equals("C:\\Users\\a\\git\\Partyservice\\images\\" + pathName)) {
						if (pathName.equals("Produkt_" + this.produkt.get(i).getName() + ".png")) {
							System.out.println("3");
							BufferedImage myPicture = ImageIO.read(new File(s1));
							JLabel picLabel = new JLabel(new ImageIcon(myPicture));
							picLabel.setBounds(390, 11, 100,50);
							panel.add(picLabel);
						}
					}
					//				ArrayList<BufferedImage> ImmageList = new ArrayList<>();
					//				for (int i1 = 0; i1 < ImmageList.size(); i1++) {
					//
					//					if (ImmageList.get(i1).equals("Produkt_" + nameProdukt)) {
					//						
					//					//	BufferedImage bild = this.ImmageList.get(i1);
					//				//		bild.setBounds(130, 11, 46, 14);
				}
				this.panel.setPreferredSize(new Dimension(180,  this.produkt.size()*70));
			}
		}
	}
}

